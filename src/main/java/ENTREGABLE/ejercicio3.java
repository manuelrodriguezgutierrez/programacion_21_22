package ENTREGABLE;

import java.sql.SQLSyntaxErrorException;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio3 {
  public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      int maximo_par= 13;
      int minimo_par= 79;
      int maximo_impar=13;
      int minimo_impar= 79;
    System.out.println("INTRODUCE EL NÚMERO DE FILAS: ");
    int filas = teclado.nextInt();
    System.out.println("INTRODUCE EL NÚMERO DE COLUMNAS: ");
    int columnas= teclado.nextInt();

    int[][] arraybidimensional= new int[filas][columnas];
    for (int i = 0; i < filas ; i++) {
      for (int j = 0; j < columnas; j++) {
          arraybidimensional[i][j]= (int) (Math.random()*64 +14);
      }
    }
      for (int[] mostrar :arraybidimensional) {
          System.out.println(Arrays.toString(mostrar));
      }
      int[]pares=new int[0];
      int indice_par=0;
      int contador_par=0;
      int suma_par=0;
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
          if ((i%2==0)&&(j%2==0)){
              pares=Arrays.copyOf(pares,pares.length+1);
              pares[indice_par++]=arraybidimensional[i][j];
              suma_par+=arraybidimensional[i][j];
              contador_par++;
          }

      }
    }
    System.out.println("PARES: "+Arrays.toString(pares));
      int[]impares=new int[0];
      int indice_impar=0;
      int sumaimpa=0;
      int contador_impar=0;
      for (int i = 0; i < filas; i++) {
          for (int j = 0; j < columnas; j++) {
              if ((i%2!=0)&&(j%2!=0)){
                  impares=Arrays.copyOf(impares,impares.length+1);
                  impares[indice_impar++]=arraybidimensional[i][j];
                  sumaimpa+=arraybidimensional[i][j];
                  contador_impar++;

              }
          }
      }
      int sumaimpares= sumaimpa/contador_impar;
      int sumapare= suma_par/contador_par;
      int mediapares=sumapare/contador_par;
      int media_impar= sumaimpares/contador_impar;

      System.out.println("IMPARES: "+Arrays.toString(impares));
    System.out.println("suma de pares: "+sumapare);
    System.out.println("suma de impares: "+sumaimpares);
    System.out.println("Media de pares: "+mediapares);
      System.out.println("Media de impares: "+media_impar);
      System.out.println("máximo de pares: ");
      System.out.println("mínimo de pares: ");
      System.out.println("Máximo de impares: ");
      System.out.println("Mínimo de impares: ");


  }

}
