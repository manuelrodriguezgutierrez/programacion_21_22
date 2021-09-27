package UD01.T4;

import java.util.Scanner;

public class ej4_4 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("número decimal a introducir = ");
        double num1 = teclado.nextDouble();
        System.out.println("redondeo al número más cercano = " + Math.round(num1));
    }
}
