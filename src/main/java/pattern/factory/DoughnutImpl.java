package pattern.factory;

public abstract class DoughnutImpl implements Doughnut {
    int cookingTime;
    @Override
    public boolean isDone() {
        int count = 0;
        while(count < cookingTime) {
            int timeSleep = (int)(Math.random() * 1000);
            try {
                Thread.sleep(timeSleep);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count++;
            System.out.println(count);

        }
        return true;
    }
}
