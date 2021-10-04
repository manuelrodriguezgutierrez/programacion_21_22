package UD01.T5B;

import java.util.Scanner;

public class ej5b_5 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("este programa resuelve ecuaciones de primer grado del tipo Ax+b=0");
    System.out.println("introduzca el valor de a");
    double a = teclado.nextDouble();
    System.out.println("introduzca el valor de b");
    double b = teclado.nextDouble();

    System.out.println("el valor de x es igual = " + (-1 / a));
  }
}
