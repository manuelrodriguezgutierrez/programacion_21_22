package UD01.T5B;

import java.util.Scanner;

public class ej5b_16 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("introduce un número entero");
    int num1 = teclado.nextInt();
    System.out.println("La última cifra del número es: " + (num1 % 10));
  }
}
