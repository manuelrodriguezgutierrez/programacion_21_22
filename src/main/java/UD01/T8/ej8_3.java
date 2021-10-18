package UD01.T8;

import java.util.Scanner;

public class ej8_3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double numerosecreto = Math.random() * 100;
    int numt = (int) numerosecreto;
    System.out.println("INTRODUUSTED SU EDAD:  ");
    int intento = teclado.nextInt();
    do {
      System.out.println("introduzca un número");
      intento = teclado.nextInt();
      if (intento < numt) {
        System.out.println("EL NÚMERO INTRODUCIDO ES MENOR QUE EL SECRETO");
      } else {
        System.out.println("EL NÚMERO INTRODUCIDO ES MAYOR QUE EL SECRETO");
      }
      if (intento < 0 && intento == -1) {
        System.out.println("VEO QUE USTED SE HA RENDIDO");
        intento = numt;
      }
      if (intento == numt) {
        System.out.println("USTED HA GANADO!!!!!!");
      }

    } while (intento != numt);
    System.out.println("EL JUEGO HA SIDO FINALIZADO.");
  }
}
