package com.company;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк массива");
        int k = in.nextInt();
        System.out.println("Введите количество столбцов массива");
        int l = in.nextInt();
        int matrix[][] = new int[k][l];
        int i, j;
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[i].length; j++) {
                System.out.println("Введите элемент массива [" + i + "][" + j + "]");
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.println("Первая строка*3 ");
            for (j = 0; j < matrix[0].length; j++) {
                System.out.println(matrix[0][j]*3);
            }
        }
    }
