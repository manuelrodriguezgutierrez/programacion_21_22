package UD01.T8;

import java.util.Scanner;

public class ej8_8 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int factroial;
    int num = 0;
    System.out.println("introduzca un número para calcular su factorial: ");
    num = teclado.nextInt();
    factroial = num;

    for (int i = 1; i < num; i++) {
      factroial = factroial * i;
    }
    System.out.println("EL FACTORIAL DE " + num + " es igual a  " + factroial);
  }
}
