package UD03.T1;

import java.util.Scanner;

public class ej2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("INTRODUZCA UN NÚMERO: ");
    int num1 = teclado.nextInt();

    System.out.println("INTRODUZCA UN SEGUNDO NÚMERO: ");
    int num2 = teclado.nextInt();
    numerosentreellos(num1, num2);
  }

  static void numerosentreellos(int num1, int num2) {
    while (num1 <= num2) {
      System.out.println(num1 + 1);
      num1++;
    }
  }
}
