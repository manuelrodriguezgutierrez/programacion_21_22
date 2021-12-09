package UD03.T3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio7 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int[] primertrismtre = new int[5];
    int[] segundotrimestre = new int[5];
    int[] tercertrimestre = new int[5];
    int mediaprimer = 0;
    int mediasegundo = 0;
    int mediatercer = 0;

    for (int i = 0; i < primertrismtre.length; i++) {
      System.out.println("PRIMER TRIMESTRE");
      System.out.println("INTRODUCE LA NOTA DE ALUMNO " + (i + 1) + " del primer trimistre: ");
      primertrismtre[i] = teclado.nextInt();
      mediaprimer += primertrismtre[i];
    }
    for (int i = 0; i < segundotrimestre.length; i++) {
      System.out.println("SEGUNDO TRIMESTRE");
      System.out.println("INTRODUCE LA NOTA DE ALUMNO " + (i + 1) + " del segundo trimistre: ");
      segundotrimestre[i] = teclado.nextInt();
      mediasegundo += segundotrimestre[i];
    }
    for (int i = 0; i < tercertrimestre.length; i++) {
      System.out.println("TERCER TRIMESTRE");
      System.out.println("INTRODUCE LA NOTA DE ALUMNO " + (i + 1) + " del tercer trimistre: ");
      tercertrimestre[i] = teclado.nextInt();
      mediatercer += tercertrimestre[i];
    }
    System.out.println("INTRODUCE LA POSICIÓN  DEL ALUMNO (1-5): ");
    int posicion = teclado.nextInt();

    double media_alumno =
        (primertrismtre[posicion] + segundotrimestre[posicion] + tercertrimestre[posicion]);
    System.out.println("Media del alumno: " + media_alumno / 3);

    System.out.println("MEDIA DEL PRIMER TRIMESTRE: " + mediaprimer / 5);
    System.out.println("MEDIA DEL SEGUNDO TRIMESTRE: " + mediasegundo / 5);
    System.out.println("MEDIA DE TERCER TRIMESTRE: " + mediatercer / 5);
  }
}
