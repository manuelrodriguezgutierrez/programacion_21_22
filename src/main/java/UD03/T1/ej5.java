package UD03.T1;

import java.util.Scanner;

public class ej5 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("INTRODUCE EL PRIMER NÚMERO: ");
    int num1 = teclado.nextInt();
    System.out.println("INTRODUCE EL SEGUNDO NÚMERO: ");
    int num2 = teclado.nextInt();
    System.out.println("INTRODUCE EL TERCER NÚMERO: ");
    int num3 = teclado.nextInt();
    System.out.println("EL NUMERO MAYOR ES: " + nummayor(nummayor(num1, num2), num3));
  }

  static int nummayor(int num1, int num2) {
    return num1 > num2 ? num1 : num2;
  }
}
