import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число x");
        int x = in.nextInt();
        System.out.println("Введите число y");
        int y = in.nextInt();
        System.out.println("Введите число z");
        int z = in.nextInt();
        int a = (x + y + z) / 3;
        System.out.println("Среднее арифмитическое введенных чисел " + a);
        int k = a / 2;
        if (k > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
