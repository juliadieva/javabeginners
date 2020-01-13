import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку 1");
        String t = in.nextLine();
        System.out.println("Введите строку 2");
        String p = in.nextLine();
        if (t.length() > p.length())
            System.out.println("Длинее строка: \n" + t);
        else if (t.length() < p.length())
            System.out.println("Длинее строка: \n" + p);
        else
            System.out.println("Длины строк равны");
    }
}
