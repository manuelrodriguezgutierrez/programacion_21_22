package UD02.T1;

import java.util.Scanner;

public class EJ2 {
  public static void main(String[] args) {
    int i, num;
    Scanner teclado = new Scanner(System.in);

    System.out.println("INTRODUCE UN NÚMERO: ");
    num = teclado.nextInt();
    System.out.println("MOSTRANDO LOS 10 PRIMEROS NÚMEROS: " + num);
    i = num;

    while (i < num + 9) {
      System.out.println("numero posterior " + (i + 1));
      i++;
    }
  }
}
