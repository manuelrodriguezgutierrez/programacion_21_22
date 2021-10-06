package UD01.T5B;

import java.util.Scanner;

public class ej5b_10 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int horastotalesdeldiaensegundo = 86400;

    System.out.println("Hora");
    int hora = teclado.nextInt();
    System.out.println("Minutos");
    int minutos = teclado.nextInt();

    int h = hora * 3600;
    int m = minutos * 60;
    int tiempotranscurrido = (h + m);
    System.out.println(
        "los segundos hasta media noche = " + (horastotalesdeldiaensegundo - tiempotranscurrido));
  }
}
