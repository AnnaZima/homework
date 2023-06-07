import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("A");
        ll.add("F");
        ll.add("C");
        ll.add("B");
        ll.add("G");
        ll.addLast("Z");
        ll.addFirst("E");

        ll.add(1, "A2");
        System.out.print("Исходное содержимое связанного списка " + ll + " ");
        System.out.println("");

        ll.removeFirst();
        ll.removeLast();

        System.out.print("Cодержимое связанного списка после " +
                "удаления первого и последнего элемента " + ll + " ");
        System.out.println("");

        String val = ll.get(2);
        ll.set(2, val + " изменено");

        System.out.println("После изменения " + ll);



    }
}
