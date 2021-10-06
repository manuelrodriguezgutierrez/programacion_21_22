package UD01.T5B;

import java.util.Scanner;

public class ej5b_9 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println(
        "Este programa le dirá cuál es su horóscopo a partir de su fecha de nacimiento.");
    System.out.println("introduzca el mes en el que nació --> (1-12)");
    int mes = teclado.nextInt();
    System.out.println("introduzca el día en el que nació.");
    int dia = teclado.nextInt();

    switch (mes) {
      case 1:
        if (dia < 21) {
          System.out.println("capricornio");
        } else {
          System.out.println("acuario");
        }

        break;
      case 2:
        if (dia < 20) {
          System.out.println("acuario");
        } else {
          System.out.println("psicis");
        }
        break;
      case 3:
        if (dia < 21) {
          System.out.println("piscis");
        } else {
          System.out.println("aries");
        }
        break;
      case 4:
        if (dia < 21) {
          System.out.println("aries");
        } else {
          System.out.println("tauro");
        }
        break;
      case 5:
        if (dia < 20) {
          System.out.println("tauro");
        } else {
          System.out.println("géminis");
        }
        break;
      case 6:
        if (dia < 22) {
          System.out.println("géminis");
        } else {
          System.out.println("cáncer");
        }
        break;
      case 7:
        if (dia < 22) {
          System.out.println("cáncer");
        } else {
          System.out.println("leo");
        }
        break;
      case 8:
        if (dia < 24) {
          System.out.println("leo");
        } else {
          System.out.println("virgo");
        }
        break;
      case 9:
        if (dia < 23) {
          System.out.println("virgo");
        } else {
          System.out.println("libra");
        }
        break;
      case 10:
        if (dia < 23) {
          System.out.println("libra");
        } else {
          System.out.println("escorpio");
        }
        break;
      case 11:
        if (dia < 23) {
          System.out.println("escorpio");
        } else {
          System.out.println("sagitario");
        }
        break;
      case 12:
        if (dia < 21) {
          System.out.println("sagitario");
        } else {
          System.out.println("capricornio");
        }
        break;
    }
  }
}
