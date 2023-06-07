import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorEx {
    public static void main(String[] args) {
        List<String> arList = Arrays.asList("один", "два", "три", "четрые", "пять");

      Iterator<String> iterator = arList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        ListIterator<String> literator = arList.listIterator();
        while (literator.hasNext()) {
            String str = literator.next();
            literator.set(str + " +");
            System.out.print(literator + " ");
        }



    }
}
