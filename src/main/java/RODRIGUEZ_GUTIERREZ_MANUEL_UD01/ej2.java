package RODRIGUEZ_GUTIERREZ_MANUEL_UD01;

import java.util.Scanner;

public class ej2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int resto, falta, numerosalto = 0;
    long num, num2 = 0;

    System.out.println("introduzca un número entero: ");
    num = teclado.nextInt();

    System.out.println("Introduzca un número entre 0 y 2 (salto): ");
    num2 = teclado.nextInt();
    if (num2 == 0) {

      System.out.println(" El resultado es: " + num);
    }
    while (num == 0)
      ;
  }
}
