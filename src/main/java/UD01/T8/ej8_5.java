package UD01.T8;

import java.util.Scanner;

public class ej8_5 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("INTRODUCE UN VALOR MÍNIMO: ");
    int minimo = teclado.nextInt();
    System.out.println("INTRODUCE UN VALOR MÁXIMO: ");
    int maximo = teclado.nextInt();
    int valor;
    do {
      System.out.println("INTRODUCE UN VALOR ENTRE EL MÍNIMO Y EL MÁXIMO: ");
      valor = teclado.nextInt();
      if (valor > maximo) {
        System.out.println("INTRODUCE UN VALOR ENTRE EL RANGO MÍNIMO Y MÁXIMO ");
      }
      if (valor < minimo) {
        System.out.println("INTRODUCE UN VALOR ENTRE EL RANGO MÍNIMO Y MÁXIMO ");
      }
    } while (valor < minimo || valor > maximo);
  }
}
