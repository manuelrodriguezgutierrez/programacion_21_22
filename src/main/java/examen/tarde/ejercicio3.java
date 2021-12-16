package examen.tarde;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio3 {
  public static void main(String[] args) {
      Scanner teclado= new Scanner(System.in);
      int lngitud_palabra=0;
      System.out.println("INTRODUZCA LA LONGITUD DE LA PALABRA: ");
      lngitud_palabra= teclado.nextInt();
      String[] cadena= new String[lngitud_palabra];
    for (int i = 0; i < cadena.length; i++) {
      cadena[i]=teclado.nextLine();
    }
    System.out.println(Arrays.toString(cadena));
  }
    public static String[] invertir(String cadena){

    }
    public static String[] desplazarVocales(String cadena){
      
    }
}
