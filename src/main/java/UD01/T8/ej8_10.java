package UD01.T8;

import java.util.Scanner;

public class ej8_10 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int num;
    do {
      System.out.println("introduzca un número del 1 al 10: ");
      num = teclado.nextInt();
      switch (num) {
        case 1:
          System.out.println(" 1x1= 1");
          System.out.println(" 1x2= 2");
          System.out.println(" 1x3= 3");
          System.out.println(" 1x4= 4");
          System.out.println(" 1x5= 5");
          System.out.println(" 1x6= 6");
          System.out.println(" 1x7= 7");
          System.out.println(" 1x8= 8");
          System.out.println(" 1x9= 9");
          System.out.println(" 1x10= 10");

          break;

        case 2:
          System.out.println(" 2x1= 2");
          System.out.println(" 2x2= 4");
          System.out.println(" 2x3= 6");
          System.out.println(" 2x4= 8");
          System.out.println(" 2x5= 10");
          System.out.println(" 2x6= 12");
          System.out.println(" 2x7= 14");
          System.out.println(" 2x8= 16");
          System.out.println(" 2x9= 18");
          System.out.println(" 2x10= 20");
          break;

        case 3:
          System.out.println(" 3x1= 3");
          System.out.println(" 3x2= 6");
          System.out.println(" 3x3= 9");
          System.out.println(" 3x4= 12");
          System.out.println(" 3x5= 15");
          System.out.println(" 3x6= 18");
          System.out.println(" 3x7= 21");
          System.out.println(" 3x8= 24");
          System.out.println(" 3x9= 27");
          System.out.println(" 3x10= 30");
          break;

        case 4:
          System.out.println(" 4x1= 4");
          System.out.println(" 4x2= 8");
          System.out.println(" 4x3= 12");
          System.out.println(" 4x4= 16");
          System.out.println(" 4x5= 20");
          System.out.println(" 4x6= 24");
          System.out.println(" 4x7= 28");
          System.out.println(" 4x8= 32");
          System.out.println(" 4x9= 36");
          System.out.println(" 4x10= 40");
          break;

        case 5:
          System.out.println(" 5x1= 5");
          System.out.println(" 5x2= 10");
          System.out.println(" 5x3= 15");
          System.out.println(" 5x4= 20");
          System.out.println(" 5x5= 25");
          System.out.println(" 5x6= 30");
          System.out.println(" 5x7= 35");
          System.out.println(" 5x8= 40");
          System.out.println(" 5x9= 45");
          System.out.println(" 5x10= 50");
          break;

        case 6:
          System.out.println(" 6x1= 4");
          System.out.println(" 6x2= 8");
          System.out.println(" 6x3= 12");
          System.out.println(" 6x4= 16");
          System.out.println(" 6x5= 20");
          System.out.println(" 6x6= 24");
          System.out.println(" 6x7= 28");
          System.out.println(" 6x8= 32");
          System.out.println(" 6x9= 36");
          System.out.println(" 6x10= 40");
          break;

        case 7:
          System.out.println(" 7x1= 7");
          System.out.println(" 7x2= 14");
          System.out.println(" 7x3= 21");
          System.out.println(" 7x4= 28");
          System.out.println(" 7x5= 35");
          System.out.println(" 7x6= 42");
          System.out.println(" 7x7= 49");
          System.out.println(" 7x8= 56");
          System.out.println(" 7x9= 63");
          System.out.println(" 7x10= 70");
          break;

        case 8:
          System.out.println(" 8x1= 8");
          System.out.println(" 8x2= 16");
          System.out.println(" 8x3= 24");
          System.out.println(" 8x4= 32");
          System.out.println(" 8x5= 40");
          System.out.println(" 8x6= 48");
          System.out.println(" 8x7= 56");
          System.out.println(" 8x8= 64");
          System.out.println(" 8x9= 72");
          System.out.println(" 8x10= 80");
          break;

        case 9:
          System.out.println(" 9x1= 9");
          System.out.println(" 9x2= 18");
          System.out.println(" 9x3= 27");
          System.out.println(" 9x4= 36");
          System.out.println(" 9x5= 45");
          System.out.println(" 9x6= 54");
          System.out.println(" 9x7= 63");
          System.out.println(" 9x8= 72");
          System.out.println(" 9x9= 81");
          System.out.println(" 9x10= 90");
          break;

        case 10:
          System.out.println(" 10x1= 10");
          System.out.println(" 10x2= 20");
          System.out.println(" 10x3= 30");
          System.out.println(" 10x4= 40");
          System.out.println(" 10x5= 50");
          System.out.println(" 10x6= 60");
          System.out.println(" 10x7= 70");
          System.out.println(" 10x8= 80");
          System.out.println(" 10x9= 90");
          System.out.println(" 10x10= 100");
          break;
      }
    } while (num < 10 || num > 0);
  }
}
