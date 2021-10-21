package UD01.T8;

import java.util.Scanner;

public class ej8_13 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int numerodecalificaciones = 0;
    int calificación;
    int suspenso = 0;
    int condicionado = 0;
    int aprobado = 0;

    do {
      System.out.println("INTRODUCE TU CALIFICACIÓN: ");
      calificación = teclado.nextInt();
      ++numerodecalificaciones;
      if (calificación < 4) {
        ++suspenso;
      }
      if (calificación >= 5) {
        ++aprobado;
      }
      if (calificación == 4) {
        ++condicionado;
      }

    } while (numerodecalificaciones < 6);
    if (suspenso > 0) {
      System.out.println("SUSPENSOS: " + suspenso);
      if (condicionado > 0) {
        System.out.println("CONDICIONADOS: " + condicionado + "");
        if (aprobado > 0) {
          System.out.println("APROBADO: " + aprobado);
        }
      }
    }
  }
}
