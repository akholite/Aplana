import java.util.*;

public class Final2 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите линейное уравнение с одной переменной без пробелов\n" +
                "(при х коэффициент должен быть равен единице, остальные числа целые от 0 до 9) :");
        String eq = sc.nextLine();

        int place, c1, c2;
        c1 = c2 = 0;

        if (eq.charAt(0) == 'x')
            place = 1;
        else if (eq.charAt(2) == 'x')
            place = 2;
        else
            place = 3;

        if (eq.charAt(1) == '+') {
            switch(place) {
                case 1:
                    c1 = -Character.getNumericValue(eq.charAt(2));
                    c2 = Character.getNumericValue(eq.charAt(4));
                    break;
                case 2:
                    c1 = -Character.getNumericValue(eq.charAt(0));
                    c2 = Character.getNumericValue(eq.charAt(4));
                    break;
                case 3:
                    c1 = Character.getNumericValue(eq.charAt(0));
                    c2 = Character.getNumericValue(eq.charAt(2));
                    break;
                default:
            }
        }
        else {
            switch (place) {
                case 1:
                    c1 = Character.getNumericValue(eq.charAt(2));
                    c2 = Character.getNumericValue(eq.charAt(4));
                    break;
                case 2:
                    c1 = Character.getNumericValue(eq.charAt(0));
                    c2 = -Character.getNumericValue(eq.charAt(4));
                    break;
                case 3:
                    c1 = Character.getNumericValue(eq.charAt(0));
                    c2 = -Character.getNumericValue(eq.charAt(2));
                    break;
            }
        }
        System.out.println(c1 + c2);
        }
    }
