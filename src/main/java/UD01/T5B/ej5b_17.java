package UD01.T5B;

import java.util.Scanner;

public class ej5b_17 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println(
        "introduzca un número de hasta 5 cifras y le diremos cual es la primera cifraa.");
    int num1 = teclado.nextInt();
    if (num1 < 10) {
      System.out.println("la primera cifra es: " + num1);
    }
    if (num1 > 10 && num1 < 100) {
      System.out.println("la primera cifra es: " + (num1 / 10));
    }
  }
}
