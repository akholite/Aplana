import java.util.*;

public class Zadacha10 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк и столбцов числовой матрицы через пробел:");
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println("Введите элементы матрицы через пробел:");
        double[][] num = new double[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                num[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Элементы первой строки матрицы, умноженные на 3:");

        for (int j = 0; j < m; j++)
            System.out.printf("%.3f ", num[0][j] * 3);


    }
}
