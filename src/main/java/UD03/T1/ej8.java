package UD03.T1;

import java.util.Scanner;

public class ej8 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("INTRODUCE UN NÚMERO: ");
    int divisores = 0;
    int num1 = teclado.nextInt();
    System.out.println(divisor(num1, divisores));
  }

  static int divisor(int num1, int divisores) {
    for (int i = 1; i < num1; i++) {
      if (num1 % i == 0 && i % 2 != 0) {
        divisores++;
      }
    }
    return divisores;
  }
}
