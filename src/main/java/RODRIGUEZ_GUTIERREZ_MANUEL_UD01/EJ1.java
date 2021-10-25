package RODRIGUEZ_GUTIERREZ_MANUEL_UD01;

import java.util.Scanner;

public class EJ1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int altura;
    int anchura;
    System.out.println("Introduce la altura: ");
    altura = teclado.nextInt();

    System.out.println("Introduce la anchura: ");
    anchura = teclado.nextInt();

    for (int i = 0; i < altura; i++) {
      System.out.println("*");
    }
  }
}
