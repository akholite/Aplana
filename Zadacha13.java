import java.util.*;

public class Zadacha13 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String[] tokens = sc.nextLine().split(" ");

        System.out.println("Слова, состоящие только из латиницы:");
        int n = 0;

        for (int i = 0; i < tokens.length; i++) {

            String s = tokens[i];
            boolean lat = true;

            for (int j = 0; j < s.length(); j++) {

                char c = s.charAt(j);

                if (!Character.isLetter(c) || c < 'A' || c > 'z' || (c > 'Z' & c < 'a')) {
                    lat = false;
                    break;
                }
            }

            if (lat) {
                System.out.println(s);
                n++;
            }
        }

        System.out.println("Количество слов только из латиницы: " + n);
    }
}