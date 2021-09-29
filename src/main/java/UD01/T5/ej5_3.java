package UD01.T5;

import java.util.Scanner;

public class ej5_3 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.println("INTRODUZCA UN NÚMERO PAR O IMPAR");
        int num1 = teclado.nextInt();

        if (num1 % 2 ==0) {
            System.out.println("NÚMERO PAR");
        }


        else {
            System.out.println("NÚMERO IMPAR");
        }
    }

}
