package examen_programación_tarde;

import java.util.Scanner;

public class eje2 {

  public static void main(String[] args) {
    int digito1, digito2, digito3, digito4, digito5, digito6, digito7, digito8, digito9, digito10;
    Scanner teclado = new Scanner(System.in);
    System.out.println("introduzca un número entero: ");
    int numero = teclado.nextInt();
    digito1 = numero / 1000000000;
    numero = numero % 1000000000;

    digito2 = numero / 100000000;
    numero = numero % 100000000;

    digito3 = numero / 10000000;
    numero = numero % 10000000;

    digito4 = numero / 1000000;
    numero = numero % 1000000;

    digito5 = numero / 100000;
    numero = numero % 100000;

    digito6 = numero / 10000;
    numero = numero % 10000;

    digito7 = numero / 1000;
    numero = numero % 1000;

    digito8 = numero / 100;
    numero = numero % 100;

    digito9 = numero / 10;
    numero = numero % 10;

    digito10 = numero;

    if (numero >= 10 || numero <= 99) {
      System.out.println(numero + " " + digito9);

    } else if (numero > 100 || numero < 999) {
      System.out.println(
          "Digitos que aparecen en el número: " + digito8 + "" + digito9 + "" + numero);
    } else if (numero < 1000 || numero > 9999) {
      System.out.println(
          "Digitos que aparecen en el número: "
              + digito10
              + ""
              + digito9
              + ""
              + digito8
              + ""
              + digito7);
    }
  }
}
