package examen_programación_tarde;

import java.util.Scanner;

public class ej4 {
  public static void main(String[] args) {

    double abs = 0.2;
    double pla = 0.3;
    double madera = 0.5;
    double flexible = 0.7;
    int posprocesado = 3;
    int gastodeenvio = 2;
    int total;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Bienvenido a Carbonita Volando");
    System.out.println("introduzca el peso de su figura en gramos: ");
    int peso = teclado.nextInt();
    System.out.println("Introduzca el tipo de material: (1=ABS, 2=PLA, 3=Madera, 4=Flexible)");
    int tpomaterial = teclado.nextInt();
    switch (tpomaterial) {
      case 1:
        System.out.println(abs * peso);
        break;
      case 2:
        System.out.println(pla * peso);
        break;
      case 3:
        System.out.println(madera * peso);
        break;
      case 4:
        System.out.println(flexible * peso);
        break;
    }

    System.out.println("¿QUIERE POSPROCESADO? (1=si, 2=no)");
    posprocesado = teclado.nextInt();
    switch (posprocesado) {
      case 1:
        System.out.println(posprocesado);
        break;
      case 2:
        break;
    }
    System.out.println("¿Pertenece a Enjuto3D Premium? (1=si, 2=no)");
    int premium = teclado.nextInt();
    switch (premium) {
      case 1:
        System.out.println("SI");
        break;
      case 2:
        System.out.println(gastodeenvio);
        break;
    }
  }
}
