package UD01.T8;

import java.util.Scanner;

public class ej8_7 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int impar = 1;
    for (int i = 1; i <= 20; i += 2) {
      impar *= i;
    }
    System.out.println("el producto es: " + impar);
  }
}
