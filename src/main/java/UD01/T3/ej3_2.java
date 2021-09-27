package UD01.T3;

import java.util.Scanner;

public class ej3_2 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.println("AÑO EN EL QUE NACISTE");
        short num1 =teclado.nextShort();
        System.out.println("AÑO actual");
        short num2 =teclado.nextShort();
        System.out.println("RESULTADO=" +(num2 - num1));
    }
}
