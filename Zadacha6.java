import java.util.*;

public class Zadacha6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите, что переводить: 1 - масса, 2 - длина");
        int n = sc.nextInt();

        if (n == 1) {
            String[] units = new String[]{"Килограммы:","Стоны:", "Унции:", "Фунты:"};

            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - стон, 3 - унция, 4 - фунт");
            int m = sc.nextInt();

            System.out.println("Введите число:");
            double x = sc.nextDouble();

            if (m == 1)
            {
                //Массив coefs содержит коэффициент конвертации выбранной единицы в остальные
                double[] coefs = new double[]{1, 0.15747, 35.274, 2.20462};

                for (int i = 0; i < coefs.length; i++) {
                    System.out.printf("%s %.5f %n", units[i], x * coefs[i]);
                }
            }
            else if (m == 2)
            {
                double[] coefs = new double[]{6.35029, 1, 224, 14};

                for (int i = 0; i < coefs.length; i++) {
                    System.out.printf("%s %.5f %n", units[i], x * coefs[i]);
                }
            }
            else if (m == 3)
            {
                double[] coefs = new double[]{0.02835, 0.00446, 1, 0.0625};

                for (int i = 0; i < coefs.length; i++) {
                    System.out.printf("%s %.5f %n", units[i], x * coefs[i]);
                }
            }
            else if (m == 4)
            {
                double[] coefs = new double[]{0.45359, 0.07143, 16, 1};

                for (int i = 0; i < coefs.length; i++) {
                    System.out.printf("%s %.5f %n", units[i], x * coefs[i]);
                }
            }
        }
        else if (n == 2) {
            String[] units = new String[]{"Метры:","Мили:", "Ярды:", "Футы:"};

            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int m = sc.nextInt();

            System.out.println("Введите число:");
            double x = sc.nextDouble();

            if (m == 1)
            {
                //Массив coefs содержит коэффициент конвертации выбранной единицы в остальные
                double[] coefs = new double[]{1, 0.00062, 1.09361, 3.28084};

                for (int i = 0; i < coefs.length; i++) {
                    System.out.printf("%s %.5f %n", units[i], x * coefs[i]);
                }
            }
            else if (m == 2)
            {
                double[] coefs = new double[]{1609.34, 1, 1760, 5280};

                for (int i = 0; i < coefs.length; i++) {
                    System.out.printf("%s %.5f %n", units[i], x * coefs[i]);
                }
            }
            else if (m == 3)
            {
                double[] coefs = new double[]{0.9144, 0.00057, 1, 3};

                for (int i = 0; i < coefs.length; i++) {
                    System.out.printf("%s %.5f %n", units[i], x * coefs[i]);
                }
            }
            else if (m == 4)
            {
                double[] coefs = new double[]{0.3048, 0.00019, 0.33333, 1};

                for (int i = 0; i < coefs.length; i++) {
                    System.out.printf("%s %.5f %n", units[i], x * coefs[i]);
                }
            }
        }
    }
}
