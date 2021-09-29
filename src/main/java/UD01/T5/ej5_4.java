package UD01.T5;

import java.util.Scanner;

public class ej5_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduzca el primer número entero");
        int num1 = teclado.nextInt();
        if (num1 % 2 == 0) {
            System.out.println("NÚMERO PAR");
        } else {
            System.out.println("NÚMERO IMPAR");
        }

        System.out.println("introduzca el segundo número entero");
        int num2 = teclado.nextInt();
        if (num2 % 2 == 0) {
            System.out.println("NÚMERO PAR");
        } else {
            System.out.println("NÚMERO IMPAR");
        }
        if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.println("LOS DOS SON PARES");
        }

        else if (num1 % 2 == 0 || num2 % 2 == 0) {
            System.out.println("AL MENOS UNO ES PAR");}

         else {
            System.out.println("NINGUNO ES PAR");
        }
    }
}