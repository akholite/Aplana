import java.util.*;

public class Zadacha12 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String s = sc.nextLine();

        if (s.contains("Java") && s.startsWith("I like") && s.endsWith("!!!"))
            System.out.println(s.toUpperCase());

        String rep = s.replace('a', 'o');

        System.out.println(rep.substring(7, 11));
    }
}
