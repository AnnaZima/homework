import java.util.HashMap;
import java.util.Map;

public class Modul1Task2 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,6,8};
        System.out.println(duplicateDetected(arr));
    }
    public static boolean duplicateDetected (int[] array) {
        boolean result;
        HashMap <Integer, Integer> duplicateMap = new HashMap<>();

        for(int i = 0; i < array.length; i++) {
           if(!(duplicateMap.containsKey(array[i]))) {
               duplicateMap.put(array[i], 1);
           } else {
              int value = duplicateMap.get(array[i]);
              duplicateMap.put(array[i], ++value);
           }
        }
        HashMap<Integer, Integer> newMap = new HashMap<>();
       for(Map.Entry <Integer, Integer> number : duplicateMap.entrySet()) {
           if(!(number.getValue() == 1)) {
               newMap.put(number.getKey(), number.getValue());
           }
       }
        if(newMap.isEmpty()) {
            result = false;
            System.out.println("Дубликатов нет");
        } else {
            result = true;
            for(Map.Entry <Integer, Integer> number : newMap.entrySet()) {
                System.out.println("Число " + number.getKey() + " повторяется " + number.getValue() + " раз");
            }
        }
        return result;
    }
}
