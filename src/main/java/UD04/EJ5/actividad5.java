package UD04.EJ5;

import java.util.Scanner;

public class actividad5 {
  public static void main(String[] args) {
      Scanner teclado= new Scanner(System.in);
      String resultado;
      texto t1 = new texto();
      System.out.println("ESCRIBA UNA PALABRA:");
      t1.setCadena(teclado.next());
        resultado=t1.getCadena();
      int cadena=0;
      int añadircaraceter;
      int posicion = 1;
      char caracter = 1;
String vocal="aeiou";
int contador=0;

    System.out.println("¿QUIERE AÑADIR ALGÚN CARÁCTER?  1.Si 2.No");
    añadircaraceter=teclado.nextInt();
    switch (añadircaraceter){
        case 1:
        System.out.println("¿QUE CARÁCTER QUISIERA AÑADIR?");
        t1.setCaracter(teclado.next());
        System.out.println("¿DÓNDE QUISIERA AÑADIRLO? 1.AL PRINCIPIO  2.AL FINAL");
        posicion=teclado.nextInt();
            switch (posicion) {
                case 1 -> {
                    resultado=t1.getCaracter()+" "+t1.getCadena();
                    System.out.println("SE AÑADIRÁ AL PRINCIPIO....    " +resultado);
                }

                case 2 -> {
                    resultado= t1.getCadena()+ " " +t1.getCaracter();
                    System.out.println("SE AÑADIRÁ AL AL FINAL....    " + t1.getCadena() + " " + t1.getCaracter());
                }
            }
        case 2:
        System.out.println("¿DESEA AÑADIR UNA CADENA ENTONCES?  1.Si   2.No");
        posicion=teclado.nextInt();
            if (posicion == 1) {
                System.out.println("ESCRIBE UNA PALABRA: ");
                t1.setCadenasecundaria(teclado.next());

                System.out.println("¿DÓNDE QUISIERA AÑADIRLO? 1.AL PRINCIPIO  2.AL FINAL");
                posicion = teclado.nextInt();
                switch (posicion) {
                    case 1:
                        resultado= t1.getCadenasecundaria()+ " "+ t1.getCadena();
                        System.out.println("SE AÑADIRÁ AL PRINCIPIO....    " + t1.getCadenasecundaria() + " " + t1.getCadena());
                        break;
                    case 2:
                        resultado= t1.getCadena()+ " "+ t1.getCadenasecundaria();

                        System.out.println("SE AÑADIRÁ AL AL FINAL....    " + t1.getCadena() + " " + t1.getCadenasecundaria());
                        break;
                }
            }
  }

for(int i = 0; i < vocal.length(); i++) {
    for(int j = 0; j < resultado.length() ; j++) {
        char vocal1= resultado.charAt(j);
        if (vocal.charAt(i) == Character.toLowerCase(vocal1)){
contador++;        }

    }
    
}
System.out.println("HAY "+contador+ " vocales");
}}
