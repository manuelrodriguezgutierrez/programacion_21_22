package UD01.T5;

import java.util.Scanner;

public class ej5_1 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.println("introduzca número");
        int num1 = teclado.nextInt();

        if  (num1 > 0) {
        System.out.println("numero mayor que 0");}

        else {
            System.out.println("numero menor que 0");
        }
    }

    }

