package UD01.T8;

public class ej8_11 {
  public static void main(String[] args) {

    for (int i = 1; i <= 10; i++) {
      System.out.println();
      System.out.println("tabla de multiplicar: " + i);
      System.out.println();
      for (int j = 0; j <= 10; j++) {

        System.out.println(i + "x" + j + "=" + i * j);
      }
    }
  }
}
