package UD01.T7;

import java.util.Scanner;

public class ej7_2 {
  public static void main(String[] args) {
    //
    Scanner teclado = new Scanner(System.in);
    System.out.println("introduce la edad: ");
    int edad = teclado.nextInt();
    System.out.println("nivel de estudios: ");
    int niveldeestudios = teclado.nextInt();
    System.out.println("Ingresos: ");
    int ingresos = teclado.nextInt();
    boolean jasp;
    if (edad <= 28 && niveldeestudios > 3 && ingresos > 28000) jasp = true;
    else jasp = false;

    System.out.println("el valor de jasp es : " + jasp);
  }
}
