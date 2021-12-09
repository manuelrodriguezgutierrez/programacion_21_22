package UD03.T1;

import java.util.Scanner;

public class ej9 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("INTRODUCE UN NÚMERO: ");
    int num1 = teclado.nextInt();
    System.out.println(divisor(num1));
  }

  static int divisor(int num1) {
    for (int i = 1; i < num1; i++) {
      if (num1 % i == 0 && i % 2 != 0) {
        System.out.println("ESTE NUMERO ES DIVISOR: " + i);
      }
    }
    System.out.println("DE NUMERO: ");
    return num1;
  }
}
