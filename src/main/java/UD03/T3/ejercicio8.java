package UD03.T3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio8 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int[][] tabla = new int[5][5];

    for (int i = 0; i < tabla.length; i++) {
      System.out.println();
      for (int j = 0; j < tabla.length; j++) {
        tabla[i][j] = i + j;
        System.out.print(tabla[i][j] + " ");
      }
    }
  }
}
