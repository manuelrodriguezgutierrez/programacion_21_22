package UD01.T5B;

import java.util.Scanner;

public class ej5_7 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("introduzca la primera nota: ");
    double nota1 = teclado.nextDouble();

    System.out.println("introduzca la nota 2");
    double nota2 = teclado.nextDouble();

    System.out.println("introudzca la nota 3");
    double nota3 = teclado.nextDouble();
    double media = (nota1 + nota2 + nota3) / 3;
    System.out.println("la media de las 3 notas es = " + media);

    if (media < 5) {
      System.out.println("INSUFICIENTE");
    }
    if (media == 5) {
      System.out.println("SUFICIENTE");
    }
    if (media == 6) {
      System.out.println("BIEN");
    }

    if ((media > 6) && (media < 9)) {
      System.out.println("NOTABLE");
    }

    if (media >= 9) {
      System.out.println("SOBRESALIENTE");
    }
  }
}
