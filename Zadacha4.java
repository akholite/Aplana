import java.util.*;

public class Zadacha4 {
    public static void main(String[] args) {
        double x, y, z;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите 3 числа через пробел");
        x = sc.nextDouble();
        y = sc.nextDouble();
        z = sc.nextDouble();

        double mean = (x + y + z) / 3;
        System.out.println("Среднее арифметическое введенных чисел = " + mean);

        double hmean = mean / 2;
        double m = hmean - (hmean % 1);

        if (hmean > 3)
            System.out.println("Программа выполнена корректно!");
    }
}
