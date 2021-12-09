package UD03.T1;

import java.util.Scanner;

public class EJE7 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("introduce un numero: ");
    int num1 = teclado.nextInt();
    System.out.println(primo(num1));
  }

  static boolean primo(int num1) {
    boolean primo = true;
    for (int i = 1; i < num1; i++) {
      if (num1 % i == 0) {
        primo = false;
        break;
      }
    }
    return primo;
  }
}
