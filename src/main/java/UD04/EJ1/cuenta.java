package UD04.EJ1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class cuenta {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int opciones=1;
cuenta_corriente c1 = new cuenta_corriente( "Manuel","48191974m");
    System.out.println("BIENVENIDO.... " +c1.getNombre());
    System.out.println("INGRESE SU BANCO . . . .  ");
    c1.setBanco(teclado.nextLine());
    while (opciones !=0){
    System.out.println("INGRESE LA OPCIÓN QUE DESEE REALIZAR: ");
    System.out.println("1: INGRESAR     2: SACAR     3: MOSTRAR INFORMACIÓN   4:CAMBIAR DE BANCO    0: SALIR DEL PROGRAMA");

    opciones= teclado.nextInt();

    switch (opciones){
        case 1:
        System.out.println("INDIQUE CUANTO QUIERE INGRESAR: ");
            c1.setIngressar(teclado.nextInt());
            c1.ingresar();
            break;
        case 2:
        System.out.println("INDIQUE CUANTO DINERO QUISIERA SACAR: ");
        c1.setRetirada(teclado.nextInt());
        c1.retirada();
        break;

        case 3:
        c1.informacion();
        break;

        case 4:
          System.out.println("INDIQUE SU BANCO . . . . ");
          c1.setBanco(teclado.next());
          System.out.println("SE HA CAMBIADO SATISFACTORIAMENTE. . . . ");
      }
    }
}
}