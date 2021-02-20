import java.util.*;

public class Zadacha6 {
    public static void main(String[] args) {

        String[] units = {};
        double[][] coefs = {};
        int m = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите, что переводить: 1 - масса, 2 - длина");
        int n = sc.nextInt();

        if (n == 1) {
            units = new String[]{"Килограммы:","Стоны:", "Унции:", "Фунты:"};

            //Массив coefs содержит коэффициенты конвертации i-ой единицы в j-ую согласно нумерации в массиве units
            coefs = new double[][]{{1, 0.15747, 35.274, 2.20462}, {6.35029, 1, 224, 14},
                                {0.02835, 0.00446, 1, 0.0625}, {0.45359, 0.07143, 16, 1}};

            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - стон, 3 - унция, 4 - фунт");
            m = sc.nextInt();
            }

        else if (n == 2) {
            units = new String[]{"Метры:","Мили:", "Ярды:", "Футы:"};

            coefs = new double[][]{{1, 0.00062, 1.09361, 3.28084}, {1609.34, 1, 1760, 5280},
                                {0.9144, 0.00057, 1, 3}, {0.3048, 0.00019, 0.33333, 1}};

            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            m = sc.nextInt();
        }

        if (m < 1 || m > 4)
            System.out.println("Введено некорректное значение");
        else
        {
            System.out.println("Введите число:");
            double x = sc.nextDouble();

            for (int i = 0; i < coefs.length; i++) {
                System.out.printf("%s %.5f %n", units[i], x * coefs[m - 1][i]);
            }
        }
    }
}
