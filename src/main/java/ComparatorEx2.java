import java.util.TreeSet;

public class ComparatorEx2 {
    public static void main(String[] args) {
        //задать компаратор, используя лямбда-выражения
        TreeSet<String> ts = new TreeSet<>((a, b) -> b.compareTo(a));
        ts.add("B");
        ts.add("A");
        ts.add("D");
        ts.add("C");
        ts.add("F");
        ts.add("E");
        //выводит элементы упорядоченные в обратном лексиграфическом порядке.
        System.out.println(ts);
    }
}
