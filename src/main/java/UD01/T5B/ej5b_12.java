package UD01.T5B;

import java.util.Scanner;

public class ej5b_12 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("INTRODUZCA TRES NÚMEROS Y SE ORDENARAN DE MENOR A MAYOR");
    System.out.println("introduzca el primer número");
    int num1 = teclado.nextInt();
    System.out.println("introduzca el segundo número");
    int num2 = teclado.nextInt();
    System.out.println("introduzca el tercer número");
    int num3 = teclado.nextInt();

    if (num1 < num2 && num1 < num3 && num3 > num2) {
      System.out.println("PRIMER NÚMERO: " + num1);
      System.out.println("SEGUNDO NÚMERO: " + num2);
      System.out.println("TERCER NÚMERO:" + num3);
    }
    if (num2 < num1 && num2 < num3 && num3 > num1) {
      System.out.println("PRIMER NÚMERO: " + num2);
      System.out.println("SEGUNDO NÚMERO: " + num1);
      System.out.println("TERCER NÚMERO:" + num3);
    }
    if (num3 < num2 && num3 < num1 && num1 > num2) {
      System.out.println("PRIMER NÚMERO: " + num3);
      System.out.println("SEGUNDO NÚMERO: " + num2);
      System.out.println("TERCER NÚMERO:" + num1);
    }
    if (num1 < num2 && num1 < num3 && num2 > num3) {
      System.out.println("PRIMER NÚMERO: " + num1);
      System.out.println("SEGUNDO NÚMERO: " + num3);
      System.out.println("TERCER NÚMERO:" + num2);
    }
  }
}
