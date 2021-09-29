package UD01.T5;

import java.util.EventListener;
import java.util.Scanner;

public class ej5_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduzca primer número");
        long num1 = teclado.nextLong();

        System.out.println("introduzca segundo número");
        long num2 = teclado.nextLong();

        System.out.println("introduzca tercero número");
        long num3 = teclado.nextLong();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("El mayor es: " + num1);
            } else {
                System.out.println("el mayor es: " + num3);
            }
        } else if (num2 > num3) {
            System.out.println("el mayor es: " + num2);
        } else {
            System.out.println("el mayor es: " + num3);
        }
    }


            }








