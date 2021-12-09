package UD03.T3;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio6 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("INTRODUCE LA CANTIDAD DE CARÁCTERES: ");
    int longitud_de_caracteres = teclado.nextInt();
    int[] t = new int[longitud_de_caracteres];

    for (int i = 0; i < longitud_de_caracteres; i++) {
      System.out.println("INTRODUCE UN NÚMERO: ");
      t[i] = teclado.nextInt();
    }
    System.out.println("array entero: " + Arrays.toString(t));
    System.out.println("ARRAY SIN REPETIR: " + Arrays.toString(sinRepetidos(t)));
  }

  static int[] sinRepetidos(int t[]) {
    int[] array_resultado = new int[0];
    int indice_resultado = 0;

    for (int i = 0; i < t.length; i++) {
      boolean repetido = false;
      for (int j = 0; j < array_resultado.length; j++) {
        if (t[i] == array_resultado[j]) {
          repetido = true;
          break;
        }
      }
      if (!repetido) {
        array_resultado = Arrays.copyOf(array_resultado, array_resultado.length + 1);
        array_resultado[indice_resultado++] = t[i];
      }
    }
    return array_resultado;
  }
}
