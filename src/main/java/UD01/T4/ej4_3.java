package UD01.T4;

import java.util.Scanner;

public class ej4_3 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.println("PRIMERA NOTA");
        double num1 = teclado.nextDouble();
        System.out.println("SEGUNDA NOTA");
        double num2 = teclado.nextDouble();
        System.out.println("TERCERA NOTA ");
        double num3 = teclado.nextDouble();

        int x1 = (int) num1;
        int x2 = (int) num2;
        int x3 = (int) num3;
        System.out.println("RESULTADO= "+(num1 + num2+ num3) /3);

    }

}
