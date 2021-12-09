package UD03.T3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio10 {
  public static void main(String[] args) {
      Scanner teclado= new Scanner(System.in);
      System.out.println("INTRODUCE CUANTOS VALORES QUIERE QUE ALMACENE: ");
      int alamcenar_valores= teclado.nextInt();
      int[] array= new int[alamcenar_valores];
      int desechados= rellenapares(array);
    System.out.println("NUMEROS PARES: "+ Arrays.toString(array));
    System.out.println("IMPARES DESECHADOS: " +desechados);
  }

    static int rellenapares(int[] array1) {
        int contador_impares=0;

    for (int i = 0; i < array1.length; i++) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("INTRODUCE LOS VALORES: ");
        int valores=teclado.nextInt();
        if (valores % 2==0){
            array1[i]=valores;
        }else {

            contador_impares++;
        }
    }
        return contador_impares;
    }

    }

