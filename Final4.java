import java.util.*;

public class Final4 {
    public static void main (String[] args) {

        String answer = "Заархивированный вирус";
        String hint = "Дед сидит в троянской лошади";

        System.out.println("Разгадай загадку: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает.\n" +
                "Даются 3 попытки. При 1-ой попытке доступна подсказка (введи \"Подсказка\"), \nно " +
                "других попыток в случае неправильного ответа после нее не дается. Введи ответ:");
        Scanner sc = new Scanner(System.in);

        int count = 0;

        do {
            String s = sc.nextLine();

            switch (s) {
                case "Подсказка":
                    if (count == 0) {
                        System.out.println(hint);
                        count++;
                    } else {
                        System.out.println("Подсказка уже недоступна. Введи ответ: ");
                        count--;
                    }
                    break;
                default:
                    if (s.equals(answer)) {
                        System.out.println("Правильно!");
                        count = 2;
                    }
                    else {
                        if (!(count == 2))
                            System.out.println("Подумай еще! Введи ответ:");
                        else
                            System.out.println("Обидно, приходи в другой раз");
                    }
            }
            count++;
        } while (count < 3);
    }
}
