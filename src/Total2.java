import java.util.Scanner;

public class Total2 {
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
        int temp, j;
        for (int i = 0; i < myList.length - 1; i++) {
            if (myList[i] > myList[i + 1]) {
                temp = myList[i + 1];
                myList[i + 1] = myList[i];
                j = i;
                while (j > 0 && temp < myList[j - 1]) {
                    myList[j] = myList[j - 1];
                    j--;
                }
                myList[j] = temp;
            }
        }
        System.out.println("Упорядоченный массив");
        for (int z = 0; z < myList.length; z++)
            System.out.println(myList[z]);
    }
}
