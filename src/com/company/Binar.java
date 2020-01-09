package com.company;

import java.util.Scanner;
public class Binar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число в бинарном формате: ");
        byte num = in.nextByte(2);
        int n= Integer.parseInt(String.valueOf(num),10);
        System.out.print("Ваше число в десятичном формате: " +n);
        in.close();
    }
}

