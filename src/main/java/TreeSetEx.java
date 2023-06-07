import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        //создать древовидное множество
        TreeSet<String> ts = new TreeSet<>();
        //добавить элементы
        ts.add("one");
        ts.add("two");
        ts.add("four");
        ts.add("five");
        ts.add("six");
        ts.add("seven");
        ts.add("eight");
        ts.add("nine");

        //вывести на консоль. Отсортировано лексиграфически.
        System.out.println(ts);
        // находит самый близкий элемент, который больше или равен переданному в параметре. nine <= element - здесь one
        System.out.println(ts.ceiling("nine"));
        // находит самый близкий элемент, который строго больше переданного в параметре. nine < element - здесь one
        System.out.println(ts.higher("nine"));
        //ищет в наборе наибольший элемент, который меньше либо равен элементу переданному в параметре nine >= element
        System.out.println(ts.floor("nine"));
        //ищет в наборе наибольший элемент, который меньше элемента переданному в параметре nine > element
        System.out.println(ts.lower("nine"));

    }
}
