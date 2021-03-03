import java.util.*;

public class Zadacha11 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа через пробел:");

        String s1 = sc.next();
        Double d = sc.nextDouble();
        int m = d.intValue();

        Double d1 = Double.parseDouble(s1);
        Double d2 = (double) m;

        if (d1.compareTo(d2) >= 0) {
            System.out.println("Большее число: " + s1);
            System.out.println("Меньшее число: " + d2);
        }
        else {
            System.out.println("Большее число: " + m);
            System.out.println("Меньшее число: " + d1);
        }
    }
}
