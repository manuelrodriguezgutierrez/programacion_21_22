package UD03.T1;

import java.util.Scanner;

public class eje11 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int numeroelevado = 0;
    System.out.println("INTRODUCE UN NUMERO: ");
    int num1 = teclado.nextInt();
    System.out.println("INTRODUCE A QUE NÚMERO VA A ESTAR ELEVADO: ");
    int elevado = teclado.nextInt();
    System.out.println("EL " + num1 + " ELEVADO ES: " + elevar(num1, elevado, numeroelevado));
  }

  static int elevar(int num1, int elevado, int numeroelevado) {
    numeroelevado = (int) Math.pow(num1, elevado);
    return numeroelevado;
  }
}
