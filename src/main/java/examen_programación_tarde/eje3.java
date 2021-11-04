package examen_programación_tarde;

import java.util.Scanner;

public class eje3 {
  public static void main(String[] args) {
    int num = (int) (Math.random() * 10000 + 1000);
    Scanner teclado = new Scanner(System.in);
    System.out.println("introduzca un numero:  ");
    num = teclado.nextInt();
  }
}
