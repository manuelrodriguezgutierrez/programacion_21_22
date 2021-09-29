package UD01.T5;

import java.util.Scanner;

public class ej5_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduzca el número 12");
        int num1 = teclado.nextInt();

        if (num1 == 12) {
            System.out.println("Es correcto");
        } else {
            System.out.println("No es correcto");
        }

    }
}
