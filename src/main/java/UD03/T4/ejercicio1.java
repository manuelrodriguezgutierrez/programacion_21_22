package UD03.T4;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio1 {
  public static void main(String[] args) {
    int maximo = 1;
    int minimo = 500;
    Scanner teclado = new Scanner(System.in);
    int[] numeros_aleatiorios = new int[100];

    for (int i = 0; i < numeros_aleatiorios.length; i++) {
      numeros_aleatiorios[i] = (int) (Math.random() * 499 + 1);
    }
    for (int i = 0; i < numeros_aleatiorios.length; i++) {
      System.out.print(numeros_aleatiorios[i] + " ");
    }
    System.out.println();
    System.out.println();
    System.out.println("¿QUE QUIÉRES DESTACAR? 1-MÁX 2-MIN");
    int destacar = teclado.nextInt();
    switch (destacar) {
      case 1:
        {
          for (int i = 0; i < numeros_aleatiorios.length; i++) {
            if (numeros_aleatiorios[i] > maximo) {
              maximo = numeros_aleatiorios[i];
            }
          }

          for (int i = 0; i < numeros_aleatiorios.length; i++) {
            String maximo_ = " ** " + maximo + " ** ";
            if (numeros_aleatiorios[i] == maximo) {
              System.out.print(maximo_);
            } else {
              System.out.print(numeros_aleatiorios[i] + " ");
            }
          }
        }
        break;

      case 2:
        {
          for (int i = 0; i < numeros_aleatiorios.length; i++) {
            if (numeros_aleatiorios[i] < minimo) {
              minimo = numeros_aleatiorios[i];
            }
          }

          for (int i = 0; i < numeros_aleatiorios.length; i++) {
            String minimo_ = " ** " + minimo + " ** ";
            if (numeros_aleatiorios[i] == minimo) {
              System.out.print(minimo_);
            } else {
              System.out.print(numeros_aleatiorios[i] + " ");
            }
          }
        }
        break;
    }
  }
}
