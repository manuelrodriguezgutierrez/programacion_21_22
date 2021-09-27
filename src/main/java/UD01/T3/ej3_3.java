package UD01.T3;

import java.util.Scanner;

public class ej3_3 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.println("NÚMERO 1 INTRODUCIR:");
        double num1 =teclado.nextDouble();
        System.out.println("NÚMERO 2 INTRODUCIR: ");
        double num2 =teclado.nextDouble();
        System.out.println("resultado:" +(num1 / num2));
    }
}
