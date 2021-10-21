package UD01.T8_B;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class EJ8B_1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int contraseña = 1234;
    int numintroducido;
    int numerodeintentos = 0;
    do {
      System.out.println(
          "INTRODUZCA UN NÚMERO (4 CIFRAS COMO MÁX) PARA ABRIR LA CAJA MISTERIOSA: ");
      numintroducido = teclado.nextInt();
      ++numerodeintentos;
      if (numintroducido != contraseña) {
        System.out.println("Lo siento, esa no es la combinación de la caja....");
      } else {
        System.out.println("La caja ha sido abierta satisfactoriamente.");
      }

    } while (numintroducido != contraseña && numerodeintentos != 4);
  }
}
