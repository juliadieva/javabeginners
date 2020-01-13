import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст");
        String t = in.nextLine();
        System.out.println("Ваш текст без пробелов: \n" + t.replaceAll(" ",
                ""));
    }
}
