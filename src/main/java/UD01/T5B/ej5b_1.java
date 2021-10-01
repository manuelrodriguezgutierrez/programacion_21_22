package UD01.T5B;

import java.util.Scanner;

public class ej5b_1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println(
        "Introduce un número que corresponda a unos de estos días: 1= LUNES    DÍA 2= MARTES    DÍA 3= MIÉRCOLES   DIA 4= JUEVES   DIA 5= VIERNES");
    int num1 = teclado.nextInt();

    switch (num1) {
      case 1:
        System.out.println("Programación");
        break;
      case 2:
        System.out.println("Sistemas informáticos");
        break;
      case 3:
        System.out.println("Programación ");
        break;

      case 4:
        System.out.println("Entorno de desarrollo");
        break;

      case 5:
        System.out.println("Base de datos");
        break;
    }
  }
}
