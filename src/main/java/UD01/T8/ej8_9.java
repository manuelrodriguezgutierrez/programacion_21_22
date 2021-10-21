package UD01.T8;

import java.util.Scanner;

public class ej8_9 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int numerodearbol = 0;
    int cmarbol;
    int numeromasalto = 0;
    int arbolmayor = 0;

    do {
      System.out.println("INTROUDCE LA MEDIDA DEL ÁRBOL NÚMERO: " + numerodearbol + " EN CM: ");
      cmarbol = teclado.nextInt();
      numerodearbol++;
      if (cmarbol > numeromasalto) {
        numeromasalto = cmarbol;
        arbolmayor = numerodearbol;
        arbolmayor--;
      }
    } while (cmarbol != -1);
    System.out.println(
        "EL NÚMERO DE ARBOL " + arbolmayor + " ES EL MÁS ALTO CON UNA MEDIDA DE " + numeromasalto);
  }
}
