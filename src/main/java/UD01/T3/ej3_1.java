package UD01.T3;

import java.util.Scanner;

public class ej3_1 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.println("INTRODUZCA EL PRIMER NÚMERO");
        byte num1 =teclado.nextByte();
        System.out.println("INTRODUCA EL SEGUNDO NÚMERO");
        byte num2 =teclado.nextByte();
        System.out.println("LA SUMA DE LOS DOS NÚMEROS ES:"+(num1 + num2));
    }
}
