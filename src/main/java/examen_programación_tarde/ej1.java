package examen_programación_tarde;

import java.util.Scanner;

public class ej1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("INTRODUCE LA ALTURA: ");
    int altura = teclado.nextInt();
    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < altura; j++) {
        if ((j == altura / 2 - i) || (j == altura / 2 + i)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
