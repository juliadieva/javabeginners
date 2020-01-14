import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        String S = in.nextLine();
        int X = Integer.parseInt(S);
        double Y = (double) X;
        System.out.println("Число в разных форматах: \n" + S);
        System.out.println(X);
        System.out.println(Y);
    }
}