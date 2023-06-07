import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("начальный размер " + al.size());

        al.add(4);
        al.add(7);
        al.add(3);
        al.add(7);
        al.add(10);
        al.add(0);

        System.out.println("размер после добавления " + al.size());

        System.out.println("Содержимое списочного массива " + al);
        //удаление по индексу
        int res = al.remove(2);
        System.out.println(res);
        //удаление по объекту
        Integer obj = 0;
        boolean result = al.remove(obj);
        System.out.println(result);
        System.out.println("Размер списочного массива " + al.size());

        ArrayList<String> strList = new ArrayList<>();
        strList.add("one");
        strList.add("two");
        strList.add("three");
        strList.add("four");
        strList.add("five");
        String str = new String("one");
        strList.remove(str);
        System.out.println(strList);

        Object object = new Object();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = object1;

        ArrayList<Object> objects = new ArrayList<>();
        objects.add(object);
        objects.add(object1);
        objects.add(object2);

        System.out.println(objects.remove(object3));

        System.out.println("размер после удаления " + objects.size());

        StringBuilder stringBuilder = new StringBuilder("abc");
        StringBuilder stringBuilder1 = new StringBuilder("def");
        StringBuilder stringBuilder2 = new StringBuilder("ghi");

        ArrayList<StringBuilder> builderArrayList = new ArrayList<>();
        builderArrayList.add(stringBuilder);
        builderArrayList.add(stringBuilder1);
        builderArrayList.add(stringBuilder2);

        System.out.println(builderArrayList.remove(new StringBuilder("def")));


    }
}
