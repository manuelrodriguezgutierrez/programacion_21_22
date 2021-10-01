package UD01.T5B;

import java.util.Scanner;

public class ej5b_2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("INTROUDCE UNA HORA");
    int num1 = teclado.nextInt();

    if (num1 >= 6 && num1 <= 12) {
      System.out.println("HOLA BUENOS DÍAS");
    }

    if (num1 >= 13 && num1 <= 20) {
      System.out.println("HOLA BUENOS TARDES");
    }
    if (num1 <= 5 || num1 >= 21) {
      System.out.println("HOLA BUENAS NOCHES");
    }
  }
}
