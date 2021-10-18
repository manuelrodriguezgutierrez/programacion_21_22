package UD01.T8;

import java.util.Scanner;

public class ej8_2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int edad = 0;
    int sumaedad = 0;
    int numdealumnos = 0;
    int niñomayores_edad = 0;
    int media = 0;

    do {
      System.out.println("introduzca la edad: ");
      edad = teclado.nextInt();
      if (edad >= 0) {
        sumaedad += edad;
        numdealumnos++;
        media = sumaedad / numdealumnos;

        if (edad < 0) {
          numdealumnos--;
        }

        if (edad > 18) {
          niñomayores_edad++;
        }
      }
    } while (edad > 0);
    System.out.println("RESULTADOS: SUMA= " + sumaedad);
    System.out.println("Media = " + media);
    System.out.println("número de alumnos= " + numdealumnos);
    System.out.println("Mayores de edad= " + niñomayores_edad);
  }
}
