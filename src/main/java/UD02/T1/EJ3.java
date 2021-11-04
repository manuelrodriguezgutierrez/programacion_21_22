package UD02.T1;

import java.util.Scanner;

public class EJ3 {
  public static void main(String[] args) {

    int num;
    Scanner teclado = new Scanner(System.in);
    System.out.println("INTRODUCE EL NÚMERO: ");
    num = teclado.nextInt();

    if (esPrimo(num)) {
      System.out.println("el número " + num + " es primo");
    } else {
      System.out.println("el número " + num + " no es primo");
    }
  }

  public static boolean esPrimo(int num) {
    boolean esPrimo = true;
    for (int i = 2; i < num - 1; i++) {
      if (num % i == 0) {
        esPrimo = false;
      } else {
        esPrimo = true;
      }
    }
    return esPrimo;
  }
}
