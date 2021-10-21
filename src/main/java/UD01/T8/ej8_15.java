package UD01.T8;

import java.util.Scanner;

public class ej8_15 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("INTRODUZCA UN NÚMERO CUALQUIERA: ");
    int numero = teclado.nextInt();

    System.out.println("NÚMERO INTRODUCIDO ES: " + numero);

    for (int i = 1; i <= numero; i++) {
      for (int j = 1; j <= numero; j++) {}
    }
  }
}
