import java.util.*;

public class Zadacha7 {

    public static final String CONSTANT_X = "первая_строка";
    public static final String CONSTANT_Y = "153.2";
    public static final String CONSTANT_Z = "qwertyuio";

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива данных:");

        int size = sc.nextInt();
        //двигаем сканер на следующую строку
        sc.nextLine();
        String[] tokens = new String[size];

        System.out.println("Введите данные в столбик (через enter):");

        for (int i = 0; i < size; i++) {
            tokens[i] = sc.nextLine();
        }

        for (String str : tokens) {
            if (str.equals(CONSTANT_X) || str.equals(CONSTANT_Y) || str.equals(CONSTANT_Z)) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
    }
}
