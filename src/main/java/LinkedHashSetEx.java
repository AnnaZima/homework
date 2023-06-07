import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        //создаем связанное хеш-множество
        LinkedHashSet <String> lhs = new LinkedHashSet<>();
        //добавляем элементы
        lhs.add("one");
        lhs.add("two");
        lhs.add("three");
        lhs.add("four");
        lhs.add("five");
        //выводим на консоль. Порядок вывода соответствует порядку ввода
        System.out.println(lhs);
    }
}
