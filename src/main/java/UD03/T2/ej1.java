package UD03.T2;

import java.util.Scanner;

public class ej1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("introduzca una palabra");
    String palabra1 = teclado.nextLine();

    System.out.println("introduzca una palabra");
    String palabra2 = teclado.nextLine();

    System.out.println("LA LONGITUD DE PALABRA1 ES " + palabra1.length());
    System.out.println("LA LONGITUD DE PALABRA2 ES " + palabra2.length());
    if (palabra1.length() < palabra2.length()) {
      System.out.println("PALABRA 2 ES MÁS LARGA QUE LA PALABRA 1!!!!");
    } else {
      System.out.println("PALABRA 1 ES MÁS LARGA QUE LA PALABRA 2!!!!");
    }
  }
}
