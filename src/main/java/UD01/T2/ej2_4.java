package UD01.T2;

import java.util.Scanner;

public class ej2_4 {
    public static void main(String[] args) {
                Scanner teclado =new Scanner(System.in);
                System.out.println("Longitud en millas: ");
                int num1 = teclado.nextInt();
                System.out.println("La solución de este cálculo sería: "+num1 * 1609);
            }
}
