package examen.tarde;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio1 {
  public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
    int longitud_matriz=0;
    int[] matriz= new int[longitud_matriz];
    System.out.println("INTRODUZCA EL NÚMERO DE FILAS: ");
    int num_filas= teclado.nextInt();

    System.out.println("INTRODUZCA EL NÚMERO DE COLUMNAS: ");
    int num_columnas=teclado.nextInt();

    System.out.println("INTRODUZCA LA LONGITUD DE LA MATRIZ: ");
     longitud_matriz=teclado.nextInt();

    for (int i = 0; i < matriz.length; i++) {
      System.out.println("SE GENERARÁ UN NÚMERO ENTRE 11 Y 1003");
      matriz[i]= (int) Math.random()*992 +11;
    }
    System.out.println(Arrays.toString(matriz));

  }
  public static boolean esPuntoDeSilla(int x[][], int i, int j)
}
