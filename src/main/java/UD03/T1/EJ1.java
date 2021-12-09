package UD03.T1;

import java.util.Scanner;

public class EJ1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("INTRODUCE UN NÚMERO");
    int n = teclado.nextInt();
    eco(n);
  }

  static void eco(int n) {
    while (n > 0) {
      System.out.println("ECO");
      n--;
    }
  }
}
