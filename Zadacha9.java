import java.util.*;

public class Zadacha9 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер числового массива:");
        int size = sc.nextInt();

        System.out.println("Введите элементы массива через пробел:");
        double[] num = new double[size];
        double sum = 0;

        for (int i = 0; i < size; i++) {
            num[i] = sc.nextDouble();
            sum += num[i];
        }

        double mean = sum / size;

        System.out.println("Элементы массива, умноженные на среднее арифметическое:");

        for (double x : num)
            System.out.printf("%.3f ", x * mean);

    }
}
