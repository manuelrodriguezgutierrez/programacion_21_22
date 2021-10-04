package UD01.T5B;

import java.util.Scanner;

public class ej5_6 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("introduzca la primera nota: ");
    int nota1 = teclado.nextInt();

    System.out.println("introduzca la nota 2");
    int nota2 = teclado.nextInt();

    System.out.println("introudzca la nota 3");
    int nota3 = teclado.nextInt();

    System.out.println("la media de las 3 notas es = " + (nota1 + nota2 + nota3) / 3);
  }
}
