package UD01.T8;

import java.util.Scanner;

public class EJ8_1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("introduzca un número:  ");
    int num1 = teclado.nextInt();
    double cuadrado = Math.pow(num1, 2);
    while (num1 > 0) {
      System.out.println(num1);
      if (num1 % 2 == 0) {
        System.out.println("Es par");
      } else {
        System.out.println("Es impar");
      }
      System.out.println("el número al cuadrado es = " + cuadrado);
      num1--;
    }
  }
}
