package UD03.T1;

import java.util.Scanner;

public class eje3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double pi = 3.14;
    int area = 0;
    int volumen = 0;

    System.out.println("INTRODUCIR ALTURA");
    int altura = teclado.nextInt();
    int radio = altura / 2;
    System.out.println(
        "INTROUDCE 1 PARA REALIZAR EL ÁREA O INTROUDCE 2 PARA REALIZAR EL VOLUMEN: ");
    int valor = teclado.nextInt();
    introduce(area, volumen, valor, (int) pi, radio, altura);
  }

  static void introduce(int area, int volumen, int valor, int radio, int pi, int altura) {
    if (valor == 1) {
      area = 2 * pi * radio * (altura + radio);
      System.out.println(area);
    } else if (valor == 2) {
      volumen = pi * (radio * 2) * altura;
      System.out.println(volumen);
    }
  }
}
