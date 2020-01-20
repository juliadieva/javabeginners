import java.util.Scanner;

public class Task15 {
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
        for (int i = myList.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (myList[j] > myList[j + 1]) {
                    int tmp = myList[j];
                    myList[j] = myList[j + 1];
                    myList[j + 1] = tmp;
                }
            }
        }
        System.out.println("Упорядоченный массив");
        for (int z = 0; z < myList.length; z++)
            System.out.println(myList[z]);
    }
}



