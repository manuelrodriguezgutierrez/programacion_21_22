package UD01.T5B;

import java.util.Scanner;

public class ejb_4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println(" INTRODUZCA LAS HORAS SEMANALES TRABAJADAS");
    int horastrabajadas = teclado.nextInt();
    int salarariosemanal;

    if (horastrabajadas <= 40) {
      System.out.println("El salario semanal del trabajador es = " + (horastrabajadas * 12));
    } else {
      System.out.println(salarariosemanal = (40 * 12) + (horastrabajadas - 40) * 16);
    }
  }
}
