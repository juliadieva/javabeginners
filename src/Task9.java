import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int k = in.nextInt();
        int myList[] = new int[k];
        for (k = 0; k < myList.length; k++) {
            System.out.println("Введите данные массива");
            int n = in.nextInt();
            myList[k] = n;
        }
        System.out.println("Вывод массива *2");
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] * 2);

        }

    }
}