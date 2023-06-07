import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        //создать хеш-множество
        HashSet<String> hs = new HashSet<>();
        //ввести элементы в хеш-множество
        hs.add("Бета");
        hs.add("Aльфа");
        hs.add("Эта");
        hs.add("Гамма");
        hs.add("Эпсилон");
        hs.add("Omega");

        System.out.println(hs);
    }
}
