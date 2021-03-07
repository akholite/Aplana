import java.util.*;

public class Final3 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк:");

        int n = sc.nextInt();
        //двигаем сканер на следующую строку
        sc.nextLine();

        String[] tokens = new String[n];
        int[] unique = new int[n];

        System.out.println("Введите данные в столбик (через enter):");

        for (int i = 0; i < n; i++) {
            tokens[i] = sc.nextLine();
        }

        for (int i = 0; i < tokens.length; i++) {

            String s = tokens[i];
            int num = 0;

            for (int j = 0; j < s.length(); j++) {

                boolean newChar = true;

                for (int k = 0; k < j; k++) {

                    if (s.charAt(j) == s.charAt(k)) {
                        newChar = false;
                        break;
                    }
                }

                if (newChar)
                    num++;
            }

            unique[i] = num;
        }

        int max, index;
        max = index = 0;

        for (int i = 0; i < unique.length; i++) {
            if (unique[i] > max) {
                max = unique[i];
                index = i;
            }
        }

        System.out.println("Строка с наибольшим числом уникальных символов: '" + tokens[index] + "'");
    }
}
