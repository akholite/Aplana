import java.util.*;

public class Final1 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите курс доллара к рублю:");
        double rate = sc.nextDouble();

        System.out.println("Введите сумму в рублях:");
        double amount = sc.nextDouble();

        System.out.printf("Сумма в долларах: %.2f", amount / rate);
    }
}