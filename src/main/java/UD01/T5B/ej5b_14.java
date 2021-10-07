package UD01.T5B;

import java.util.Scanner;

public class ej5b_14 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("¿PARA DÓNDE QUIERES QUE APUNTE EL VÉRTICE DE LA PIRAMIDE?");
    System.out.println("1- Hacia arriba");
    System.out.println("2- Hacia abajo");
    System.out.println("3- Hacia la izquierda");
    System.out.println("4- Hacia la derecha");
    int num1 = teclado.nextInt();

    switch (num1) {
      case 1:
        System.out.println("      *");
        System.out.println("     ***");
        System.out.println("    ****** ");
        System.out.println("   ******** ");
        System.out.println("  **********");
        break;

      case 2:
        System.out.println("  **********");
        System.out.println("   ******** ");
        System.out.println("    ****** ");
        System.out.println("     ***");
        System.out.println("      *");
        break;

      case 3:
        System.out.println("              *     ");
        System.out.println("            * *");
        System.out.println("          * * *");
        System.out.println("        * * * *");
        System.out.println("      * * * * *");
        System.out.println("        * * * *");
        System.out.println("          * * *");
        System.out.println("            * *");
        System.out.println("              *");
        break;

      case 4:
        System.out.println("*         ");
        System.out.println("* *       ");
        System.out.println("* * *      ");
        System.out.println("* * * *      ");
        System.out.println("* * * * *");
        System.out.println("* * * *      ");
        System.out.println("* * *       ");
        System.out.println("* *        ");
        System.out.println("*         ");
        break;
      default:
        System.out.println("NO HA INTRODUCIDO NINGÚN VALOR ESPECIFICADO");
    }
  }
}
