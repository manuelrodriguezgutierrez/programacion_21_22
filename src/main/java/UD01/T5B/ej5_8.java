package UD01.T5B;

import java.util.Scanner;

public class ej5_8 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    // a b y c valores de la ecuación
    // x0 y x1 son las posibles soluciones
    double x0;
    double x1;
    System.out.println("introduzca valor para a");
    double a = teclado.nextDouble();

    System.out.println("introduzca un valor para b");
    double b = teclado.nextDouble();

    System.out.println("introuzca valor de c");
    double c = teclado.nextDouble();

    x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c) / (2 * a)));
    x0 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c) / (2 * a)));
    System.out.println(x1);
    System.out.println(x0);
  }
}
