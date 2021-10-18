package UD01.T7;

import java.util.Scanner;

public class ej7_1 {
  public static void main(String[] args) {
    // Realiza un programa que dadas dos variables a y b, intercambie los valores de a y b.
    Scanner teclado = new Scanner(System.in);
    System.out.println("INTRODUCE EL VALOR DE A");
    int a = teclado.nextInt();
    System.out.println("INTRODUZCA EL VALOR DE B");
    int b = teclado.nextInt();
    System.out.println("PRODUCIENDO INTERCAMBIO DE VALORES: . . . . . ");
    int axuliar = b;
    b = a;

    System.out.println("EL VALOR DE A: " + axuliar);
    System.out.println("EL VALOR DE B: " + a);
  }
}
