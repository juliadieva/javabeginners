package com.company;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int z = 8;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int number = in.nextInt();
        if (number == x || number == y || number == z) {
            System.out.println("Данное значение имеется в константах");
        } else {
            System.out.println("Такой константы нет!");
        }
    }
}
