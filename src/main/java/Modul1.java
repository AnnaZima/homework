import java.util.Arrays;

public class Modul1 {
    public static void main(String[] args) {
        int[] number = {1, 7, 3, 5, 0, 2, 4, 9};
        Modul1 modul1 = new Modul1();
        modul1.sumNumber(number, 8);

    }

    public void sumNumber (int[] num, int decimal) {

        int[] filtrArr = Arrays.stream(num).filter(el -> el<= decimal).toArray();
        for(int i = 0; i < filtrArr.length; i++) {
            int temp = decimal - filtrArr[i];
            for(int j = i; j< filtrArr.length; j++) {
                if(temp == filtrArr[j] & i != j) {
                    System.out.println(i + ", " + j);
                    break;
                }
            }

        }

    }
}