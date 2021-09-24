package UD01.T2;

import java.util.Scanner;

public class ej2_3 {
    public static void main(String[] args) {
        //int num1, num2;
        Scanner teclado =new Scanner(System.in);
        System.out.println("introduzca el primer número: ");
        int num1 = teclado.nextInt();
        System.out.println("introduzca el segundo número: ");
        int num2 = teclado.nextInt();
        System.out.println("la división de los dos números es: " + num1 / num2);
    }
}