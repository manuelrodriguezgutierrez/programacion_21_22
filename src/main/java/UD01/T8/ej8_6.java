package UD01.T8;

import java.util.Scanner;

public class ej8_6 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("INTRODUCE EL NÚMERO 7 PARA SABER TODOS LOS MÚLTIPLOS: ");
    int num7 = teclado.nextInt();
    int multiplo = 1;
    do {
      System.out.println(num7 * multiplo);
      multiplo++;

    } while (num7 * multiplo < 100);
  }
}
