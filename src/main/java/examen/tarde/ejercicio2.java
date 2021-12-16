package examen.tarde;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio2 {
  public static void main(String[] args) {
      Scanner teclado= new Scanner(System.in);
      int[] índice= new int[10];
      int contadorposicion=0;
    int[] num_aleatorios= new int[10];
    for (int i = 0; i < índice.length; i++) {
        índice[i]= i;
    }
      System.out.println(Arrays.toString(índice));

      for (int i = 0; i < num_aleatorios.length; i++) {
          num_aleatorios[i]= (int) (Math.random()*77 +12);
      }
      System.out.println(Arrays.toString(num_aleatorios));

      
  }
}
