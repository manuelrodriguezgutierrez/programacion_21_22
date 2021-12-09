package UD03.T3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio5 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int[] b = new int[6];
    int[] a = new int[6];

    System.out.println("Introduce 6 números: ");

    for (int i = 0; i < a.length; i++) {
      System.out.println("INTRODUCE UN NÚMERO: ");
      a[i] = teclado.nextInt();
    }
    System.out.println("array a: " + Arrays.toString(a));
    Arrays.sort(a);
    System.out.println("Array a ordenado: " + Arrays.toString(a));

    System.out.println("Introduce otros 6 números: ");

    for (int i = 0; i < b.length; i++) {
      System.out.println("INTRODUCE UN NÚMERO: ");
      b[i] = teclado.nextInt();
    }
    System.out.println("array b: " + Arrays.toString(b));
    Arrays.sort(b);
    System.out.println("Array b ordenado: " + Arrays.toString(b));

    int[] fusion = new int[a.length + b.length];
    System.arraycopy(a, 0, fusion, 0, a.length);
    System.arraycopy(b, 0, fusion, a.length, b.length);
    Arrays.sort(fusion);
    System.out.println("Array fusionado y ordenado: " + Arrays.toString(fusion));
  }
}
