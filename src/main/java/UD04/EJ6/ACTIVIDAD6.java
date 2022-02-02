package UD04.EJ6;

import UD04.EJ1.cuenta_corriente;

import java.util.Scanner;

public class ACTIVIDAD6 {
  public static void main(String[] args) {
      int opcion=0;
      Scanner teclado= new Scanner(System.in);
      BANCO Santander = new BANCO("Santander",5200000,"C/Federico García Lorca");
      BANCO CaixaBank = new BANCO("CaixaBank",5200000,"C/Vicente Bancoco");
      BANCO Cajasol = new BANCO("Cajasol",5200000,"C/Enmedio");
      BANCO Bankia = new BANCO("Bankia",5200000,"C/Antonio Almendro");


      cuenta_corriente c1 = new cuenta_corriente( "Manuel","43191974m",Santander);
      cuenta_corriente c2 = new cuenta_corriente( "Pepe","48191964p",Cajasol);
      cuenta_corriente c3 = new cuenta_corriente( "José Fino","48198974i",CaixaBank);
      cuenta_corriente c4 = new cuenta_corriente( "Antonio","48194974u",Bankia);

    System.out.println("¿DESEA USTED VER LA INFORMACIÓN DE SU CUENTA?  PULSE 1.");
    opcion=teclado.nextInt();
    if (opcion==1){
        c1.informacion();
        c2.informacion();
        c3.informacion();
        c4.informacion();
    }
  }
}
