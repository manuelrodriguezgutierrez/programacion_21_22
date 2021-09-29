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
        System.out.println("RESULTADO= "+(int)(num1 + num2+ num3) /3);

    }

}
