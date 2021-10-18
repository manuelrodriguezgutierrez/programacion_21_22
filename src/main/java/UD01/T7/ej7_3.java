package UD01.T7;

import java.util.Scanner;

public class ej7_3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("generando letra minúscula aleatoria.... ");
    double numeros = Math.random() * 25 + 98;
    System.out.println("numéro aleatorio= " + numeros);
    char ASCII = (char) numeros;
    System.out.println(" la letra es = " + ASCII);
  }
}
