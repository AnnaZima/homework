import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(3);
        arrayList.add(6);
        arrayList.add(0);
        arrayList.add(9);
        System.out.println("Содержимое списочного массива " + arrayList);

        //получаем обычный массив
        Integer[] ai = new Integer[arrayList.size()];
        ai = arrayList.toArray(ai);

        int sum = 0;
        //суммировать элементы массива
        for(int i : ai) sum +=i;
        System.out.println(sum);
     }
}
