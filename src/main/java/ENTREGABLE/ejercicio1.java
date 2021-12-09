package ENTREGABLE;

import java.util.Scanner;

public class ejercicio1 {
  public static void main(String[] args) {
      Scanner teclado= new Scanner(System.in);
    System.out.println("introduce una palabra: ");
    String palabra= teclado.nextLine();
      String caracter ="";

      while(caracter != palabra){
        System.out.println("INTRODUZCA UN CARÁCTER: ");
         caracter = teclado.nextLine();}
  }

}
