package UD01.T2;

import java.util.Scanner;

public class ej2_5 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.println("INTRODUZCA LOS GRADOS CENTÍGRADOS: ");
        int num1 = teclado.nextInt();
        System.out.println("PASO DE GRAODS CENTÍGRADOS A FARENHEIT: " +num1 * 9/37);
    }
}
