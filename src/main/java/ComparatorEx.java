import java.util.Comparator;
import java.util.TreeSet;


public class ComparatorEx {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(new SpecComparator());
        ts.add("B");
        ts.add("A");
        ts.add("D");
        ts.add("C");
        ts.add("F");
        ts.add("E");
//элементы выводятся в обратном порядке. Древовидное множество сортирует элементы, а компортатор задает порядок сортировки
        System.out.println(ts);

    }
    //специальный компоратор
   static class  SpecComparator implements Comparator<String> {

       @Override
       public int compare(String o1, String o2) {
           return o2.compareTo(o1);
       }
   }
}
