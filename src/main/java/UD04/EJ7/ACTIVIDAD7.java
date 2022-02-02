package UD04.EJ7;

import java.util.Scanner;

public class ACTIVIDAD7 {
  public static void main(String[] args) {
      Scanner teclado= new Scanner(System.in);
      int opcion=1;
      sintonizadordigital s1=new sintonizadordigital();
    System.out.println("PULSE 1, PARA INICIAR LA RADIO ");
    opcion=teclado.nextInt();
    do{


    if (opcion==1){
      s1.display();
    }
    System.out.println("PULSE 1 PARA SUBIR LA RADIO O PULSE 2 PARA BAJAR LA RADIO");
    opcion=teclado.nextInt();
    if (opcion==1){
        s1.subirradio();
        s1.display();
    }else {
        s1.bajarradio();
        s1.display();
    }
  }while (opcion!=-1);
}
}