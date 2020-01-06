import java.util.Scanner;
public class Tabl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        int z1=num*1;
        int z2=num*2;
        int z3=num*3;
        int z4=num*4;
        int z5=num*5;
        int z6=num*6;
        int z7=num*7;
        int z8=num*8;
        int z9=num*9;
        int z10=num*10;
        System.out.println("Таблица умножения: \n"+ "1*" + num+ "=" + z1);
        System.out.println("2*" + num+ "=" + z2);
        System.out.println("3*" + num+ "=" + z3);
        System.out.println("4*" + num+ "=" + z4);
        System.out.println("5*" + num+ "=" + z5);
        System.out.println("6*" + num+ "=" + z6);
        System.out.println("7*" + num+ "=" + z7);
        System.out.println("8*" + num+ "=" + z8);
        System.out.println("9*" + num+ "=" + z9);
        System.out.println("10*" + num+ "=" + z10);
        in.close();
    }
}

