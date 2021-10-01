package UD01.T5B;

import java.io.BufferedReader;
import java.util.Scanner;

public class ejb_3 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println(" INTRODUZCA UN NÚMERO DEL 1 AL 7 CORRESPONDIENDO AL DÍA DE LA SEMANA: ");
    int num1 = teclado.nextInt();
    switch (num1) {
      case 1:
        System.out.println("LUNES");
        break;

      case 2:
        System.out.println("MARTES");
        break;

      case 3:
        System.out.println("MIERCOLES");
        break;

      case 4:
        System.out.println("JUEVES");
        break;

      case 5:
        System.out.println("VIERNES");
        break;

      case 6:
        System.out.println("SABADO");
        break;

      case 7:
        System.out.println("DOMINGO");
        break;
    }
  }
}
