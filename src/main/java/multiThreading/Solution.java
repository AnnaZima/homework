package multiThreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Solution {
    public static void main(String[] args) {
        Foo foo = new Foo();
        CompletableFuture.runAsync(() -> {
            foo.second(new Thread());
        });

        CompletableFuture.runAsync(() -> {
            foo.first(new Thread());
        });

        CompletableFuture.runAsync(() -> {
            foo.third(new Thread());
        });
    }
}

class Foo {
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    int count = 0;

    public void first(Runnable r) {
        lock.lock();
        try {
            System.out.print("first ");
            count++;
            condition.signalAll();
        } finally {
            lock.unlock();
        }


    }

    public void second(Runnable r) {
        lock.lock();

        try {
            while (count != 1)
                condition.await();
            System.out.print("second ");
            count++;

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void third(Runnable r) {
        lock.lock();
        try {
            while (count != 2)
                condition.await();

            System.out.println("third ");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

}
