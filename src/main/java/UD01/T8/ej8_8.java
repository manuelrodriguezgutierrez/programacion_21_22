package UD01.T8;

import java.util.Scanner;

public class ej8_8 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("INTRODUZCA UN NÚMERO PARA CALCULAR SU FACTORIAL: ");
    int factorial = teclado.nextInt();
    int factores = 1;
    while (factorial != factores) {
      factores *= factorial;
      factores--;
    }
    System.out.println("EL RESULTADO ES : ");
  }
}
