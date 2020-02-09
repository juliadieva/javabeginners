import java.util.Scanner;

public class Total1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число в бинарном формате: " + "\n");
        String num = in.nextLine();
        int n = 0;
        int m = num.length() - 1;
        if (num.charAt(m) == '1' || num.charAt(m) == '0') {
            for (int i = num.length() - 1, j = 1; i >= 0; i--, j *= 2) {
                n += (num.charAt(i) - '0') * j;
            }
            System.out.println("Ваше число в десятичном формате: " + n);
        } else {
            System.out.print("Неверный формат");

        }
    }
}



