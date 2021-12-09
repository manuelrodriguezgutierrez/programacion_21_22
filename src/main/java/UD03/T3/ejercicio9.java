package UD03.T3;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio9 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int[] tu_apuesta = new int[6];
    int[] apuesta_ganadoraa = new int[6];
    for (int i = 0; i < 6; i++) {
      apuesta_ganadoraa[i] = (int) (Math.random() * 49 - 1);
    }

    for (int i = 0; i < 6; i++) {
      System.out.println("INTRODUCE UN NÚMERO DEL 1-50: ");
      tu_apuesta[i] = teclado.nextInt();
    }
    System.out.println("La apuesta ganadora es: " + Arrays.toString(apuesta_ganadoraa));
    System.out.println("EL NÚMERO DE ACIERTOS: " + apuesta_ganadora(tu_apuesta, apuesta_ganadoraa));
    System.out.println("Tu boleto es: " + Arrays.toString(tu_apuesta));
  }

  static int apuesta_ganadora(int[] tu_apuesta, int[] apuesta_ganadoraa) {
    int aciertos = 0;
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        if (tu_apuesta[i] == apuesta_ganadoraa[j]) {
          aciertos++;
        }
      }
    }
    return aciertos;
  }
}
