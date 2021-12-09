package UD03.T1;

import java.util.Scanner;

public class EJERCICIO10 {
  public static void main(String[] args) {
    int amigo1 = 0;
    int amigo2 = 0;
    Scanner teclado = new Scanner(System.in);
    System.out.println("INTRODUCE UN NÚMERO: ");
    int num1 = teclado.nextInt();
    System.out.println("INTRODUCE UN NÚMERO: ");
    int num2 = teclado.nextInt();
    if (divisoresdenumeros1(num1, amigo1) == num2 && divisoresdenumeros2(num2, amigo2) == num1) {
      System.out.println("SON AMIGOS!!!!");

    } else {
      System.out.println("NO SON AMIGOS!!!");
    }
  }

  static int divisoresdenumeros1(int num1, int amigo1) {
    for (int i = 1; i < num1; i++) {
      if (num1 % i == 0) {
        amigo1 += i;
      }
    }
    return amigo1;
  }

  static int divisoresdenumeros2(int num2, int amigo2) {
    for (int i = 1; i < num2; i++) {
      if (num2 % i == 0) {
        amigo2 += i;
      }
    }
    return amigo2;
  }
}
