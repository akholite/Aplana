import java.util.*;

public class Zadacha5 {
    public static void main(String[] args) {
        System.out.println("Введите через пробел 2 числа и один из символов +, -, * или /");

        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        String op = sc.next();
        double res;

        switch (op) {
            case "+":
                System.out.println("Результат равен = " + (x + y));
                break;
            case "-":
                System.out.println("Результат равен = " + (x - y));
                break;
            case "*":
                System.out.println("Результат равен = " + (x * y));
                break;
            case "/":
                System.out.println("Результат равен = " + (x / y));
                break;
            default:
                System.out.println("Ввведен некорректный символ");
        }
    }
}
