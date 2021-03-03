import java.util.*;

public class Zadacha14 {
    public static void main (String[] args) {

        Random random = new Random();
        int size = 15;
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(41) - 20;
        }

        int min, max, absm;
        max = min = array[0];

        for (int i = 0; i < size; i++) {

            if (array[i] < min)
                min = array[i];

            if (array[i] > max)
                max = array[i];
        }

        if (Math.abs(max) < Math.abs(min))
            absm = min;
        else
            absm = max;

        System.out.printf("Наименьшее число: %d, наибольшее: %d\nНаибольшее по модулю: %d", min, max, absm);
    }
}
