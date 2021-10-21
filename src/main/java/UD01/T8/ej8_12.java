package UD01.T8;

import java.util.Scanner;

public class ej8_12 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int numerodecalificaciones = 0;
    int calificación;
    int suspenso = 0;

    do {
      System.out.println("INTRODUCE TU CALIFICACIÓN: ");
      calificación = teclado.nextInt();
      ++numerodecalificaciones;
      if (calificación < 5) {
        ++suspenso;
      }

    } while (numerodecalificaciones < 5);
    if (suspenso > 0) {
      System.out.println("TIENE " + suspenso + " SUSPENSOS");
    }

    if (suspenso == 0) {
      System.out.println("NO TIENE NINGÚN SUSPENSO");
    }
  }
}
