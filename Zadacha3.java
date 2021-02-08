public class Zadacha3 {
    public static void main(String[] args) {
        int[] a = {1, 9, 15, 3, 75};
        int x, last = a.length - 1;

        x = a[0];
        a[0] = a[last];
        a[last] = x;

        int mid = last / 2;
        int sum = a[0] + a[mid];

        System.out.println("Сумма последнего и среднего элементов: " + sum);
    }
}
