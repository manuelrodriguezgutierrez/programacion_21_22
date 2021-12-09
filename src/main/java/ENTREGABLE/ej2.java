package ENTREGABLE;

import java.util.Arrays;
import java.util.Scanner;

public class ej2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("INTRODUCE LA LONGITUD DEL ARRAY: ");
    int longitud = teclado.nextInt();
    int[] arrray1 = new int[longitud];
    int[] array2 = new int[longitud];
    int[]arraycombinado= new int[arrray1.length+array2.length];
    for (int i = 0; i < arrray1.length; i++) {
      System.out.println("INTRODUZCA VALORES PARA EL PRIMER ARRAY: ");
      arrray1[i] = teclado.nextInt();
    }
    for (int i = 0; i < array2.length; i++) {
      System.out.println("INTRODUZCA VALORES PARA EL SEGUNDO ARRAY: ");
      array2[i] = teclado.nextInt();
    }
    System.out.println("INTRODUZCA LA POSICION: ");
    int pos= teclado.nextInt();

    System.out.println(insertarEnVector(arrray1, array2,pos, arraycombinado));

}
    public static String insertarEnVector(int[] array1, int [] array2, int pos, int[] arraycombinado){
      if (pos<0){
      System.out.println("ARRAY 1: "+Arrays.toString(array1));
    } else if (pos > array1.length) {
      System.out.println(Arrays.toString(array2));
      }else if (pos == array1.length){
          System.arraycopy(array1, 0, arraycombinado, 0, array1.length);
          System.arraycopy(array2, 0, arraycombinado, array1.length, array2.length);
      }
      return Arrays.toString(arraycombinado);
    }
}
