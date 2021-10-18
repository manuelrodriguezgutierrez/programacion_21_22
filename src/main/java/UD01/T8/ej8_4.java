package UD01.T8;

import java.util.Scanner;

public class ej8_4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int n;
    int i = 1;
    System.out.println("introduzca un número N: ");
    n = teclado.nextInt();
    System.out.println("se escribirán los números desde el 1 hasta N: ");
    do {
      System.out.println(i);
      i++;

    } while (i <= n);
  }
}
