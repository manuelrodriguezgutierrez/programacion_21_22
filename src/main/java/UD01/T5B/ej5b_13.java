package UD01.T5B;

import java.util.Scanner;

public class ej5b_13 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("introduce un número ");
    int num1 = teclado.nextInt();
    if (num1 % 2 == 0 && num1 % 5 == 0) {
      System.out.println("El número introducido es PAR Y DIVISIBLE ENTRE 5");
    } else if (num1 % 2 == 0 && num1 % 5 == 5) {
      System.out.println("El número introducido es PAR Y DIVISIBLE ENTRE 5");
    } else {
      System.out.println("No es par ni divisible entre 5");
    }
  }
}
