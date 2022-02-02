package UD04.EJ8;

import java.util.Scanner;

public class main {
  public static void main(String[] args) {
      Scanner teclado= new Scanner(System.in);
      bombilla b1 = new bombilla();
      bombilla b2 = new bombilla();
      bombilla b3 = new bombilla();

    System.out.println("vamos a encender el interruptor");
    bombilla.interruptorencender();
    System.out.println("VAMOS A ENCENDER LAS BOMBILLAS");
      b1.encender();
      b2.encender();
      b3.encender();

      b1.dimeESTADO();
      b2.dimeESTADO();
      b3.dimeESTADO();
    System.out.println("VAMOH A APAGAR ALGUNA BOMBILLA");
    b2.apagar();
    b3.apagar();
      b1.dimeESTADO();
      b2.dimeESTADO();
      b3.dimeESTADO();
    System.out.println("UPS HA SALTADO EL FUSIBLE");
    bombilla.interruptorapagar();
      b1.dimeESTADO();
      b2.dimeESTADO();
      b3.dimeESTADO();
  }
}
