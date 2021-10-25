package RODRIGUEZ_GUTIERREZ_MANUEL_UD01;

import java.util.Scanner;
import java.util.SortedMap;

public class ej3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int hamburguesa_basica = 3;
    double hamburgesa_gourmet = 5;
    int numdehamburguesasbasicas;
    int numdehamburguesasgourmet;
    int diadelasemana = 0;
    int resultado;

    System.out.println(" PEDIDOS: ");
    System.out.println(" Nº de hamburgesas básicas: ");
    numdehamburguesasbasicas = teclado.nextInt();
    System.out.println(" Nº de hamburgesas gourmet: ");
    numdehamburguesasgourmet = teclado.nextInt();

    System.out.println(
        "Día de la semana (1.lunes 2.Martes 3.Miércoles 4.Jueves 5.Viernes 6.Sábado 7.Domingo) ");
    diadelasemana = teclado.nextInt();
    switch (diadelasemana) {
      case 1:
        System.out.println("LUNES");
        break;
      case 2:
        System.out.println("MARTES");
        hamburgesa_gourmet = 4.5;
        break;
      case 3:
        System.out.println("MIÉRCOLES");
        hamburguesa_basica = 2;
        break;
      case 4:
        System.out.println("JUEVES");
        break;
      case 5:
        System.out.println("VIERNES");
        break;
      case 6:
        System.out.println("SÁBADO");
        break;
      case 7:
        System.out.println("DOOMINGO");
        break;
    }
    System.out.println("¿Pertenece al club? (1.SÍ   2.NO)");
    int sino = teclado.nextInt();

    System.out.println("GRACIAS POR SU COMPRA");
    int totalbasicas = +hamburguesa_basica * numdehamburguesasbasicas;
    System.out.println("hamburguesas básicas = " + totalbasicas);
    double totalgourmet = +hamburgesa_gourmet * numdehamburguesasgourmet;
    System.out.println("hamburguesa gourmet= " + totalgourmet);
    System.out.println("TOTAL: " + (totalbasicas + totalgourmet));
    double descuento = ((totalbasicas + totalgourmet) * 12 / 100);
    System.out.println("CON DESCUENTO : " + (totalbasicas + totalgourmet - descuento));
  }
}
