package UD03.T1;

import java.util.Scanner;

public class eje4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("INTRODUCE EL PRIMER NÚMERO: ");
    int num1 = teclado.nextInt();
    System.out.println("INTRODUCE EL SEGUNDO NÚMERO: ");
    int num2 = teclado.nextInt();
    nummayor(num1, num2);
  }

  static void nummayor(int num1, int num2) {
    if (num1 > num2) {
      System.out.println("EL NÚMERO MAYOR ES: " + num1);
    } else {
      System.out.println("EL NÚMERO MAYOR ES: " + num2);
    }
  }
}
