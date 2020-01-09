package com.company;

import java.util.Scanner;
public class Tabl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        System.out.println("Таблица умножения: \n"+ "1*" + num+ "=" + num);
        System.out.println("2*" + num+ "=" + num*2);
        System.out.println("3*" + num+ "=" + num*3);
        System.out.println("4*" + num+ "=" + num*4);
        System.out.println("5*" + num+ "=" + num*5);
        System.out.println("6*" + num+ "=" + num*6);
        System.out.println("7*" + num+ "=" + num*7);
        System.out.println("8*" + num+ "=" + num*8);
        System.out.println("9*" + num+ "=" + num*9);
        System.out.println("10*" + num+ "=" + num*10);
        in.close();
    }
}

