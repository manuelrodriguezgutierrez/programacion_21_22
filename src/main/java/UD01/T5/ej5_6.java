package UD01.T5;

import java.util.Scanner;

public class ej5_6 {
    public static void main(String[] args) {
        final double gravedad = 9.8;
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduzca el tiempo: ");
        long tiempo = teclado.nextLong();

        if (tiempo < 0) {
            System.out.println("tiempo incorrecto");
        } else {
            System.out.println("La velocidad es: " + (gravedad * tiempo));
        }
    }
}

