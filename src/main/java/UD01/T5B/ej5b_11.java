package UD01.T5B;

import javax.naming.BinaryRefAddr;
import java.util.Scanner;

public class ej5b_11 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int puntos = 0;
    System.out.println("CURSTIONARIO DE PREGUNTAS ALEATORIAS DE 1ºDAW");
    System.out.println("PREGUNTA 1: Una máquina virtual es....");
    System.out.println(
        "1-software que simula un sistema de computación y puede ejecutar programas como si fuese una computadora real. ");
    System.out.println("2-Un perro");
    System.out.println("3-Un ordenador que no tiene componentes");
    int pregunta1 = teclado.nextInt();
    switch (pregunta1) {
      case 1:
        System.out.println("CORRECTO");
        puntos++;
        break;
      case 2:
      case 3:
        System.out.println("INCORRECTO");
        break;
      default:
        System.out.println("esta respuesta no es válida");
        break;
    }

    System.out.println("PREGUNTA 2: Un lenguaje de programación es....");
    System.out.println(
        "1- es un lenguaje de computadora que los programadores utilizan para comunicarse y para desarrollar programas de software, aplicaciones, páginas webs, scripts u otros conjuntos de instrucciones para que sean ejecutadas por los ordenadores");
    System.out.println(
        "2- es el lenguaje por donde se comunican los ordenadores para poder pasar archivos");
    System.out.println("3- es un lenguaje chino");
    int pregunta2 = teclado.nextInt();
    switch (pregunta2) {
      case 1:
        System.out.println("CORRECTO");
        puntos++;
        break;
      case 2:
      case 3:
        System.out.println("INCORRECTO");
        break;
      default:
        System.out.println("no es válido esta respuesta");
        break;
    }
    System.out.println("PREGUNTA 3: ¿COMO SE LLAMA EL TUTOR DE 1ºDAW DE TARDE?");
    System.out.println("1- Chema");
    System.out.println("2- Juan Carlos");
    System.out.println("3- Alejandro");
    int pregunta3 = teclado.nextInt();
    switch (pregunta3) {
      case 1:
        System.out.println("INCORRECTO");
      case 2:
        break;
      default:
        System.out.println("esta respuesta no es válida");
      case 3:
        System.out.println("CORRECTO");
        puntos++;
    }
    System.out.println("PREGUNTA 4: JAVA es ....");
    System.out.println("1- Es un sistema operativo como linux");
    System.out.println("2- Es un lenguaje de programación");
    System.out.println("3- Es un componente de un equipo");
    int pregunta4 = teclado.nextInt();
    switch (pregunta4) {
      case 2:
        System.out.println("CORRECTO");
        puntos++;
        break;
      case 1:
      case 3:
        System.out.println("INCORRECTO");
        break;
      default:
        System.out.println("esta respuesta no es válida");
    }
    System.out.println(" PREGUNTA 5: Una base de datos es");
    System.out.println(
        "1- es una colección organizada de información estructurada, o datos, típicamente almacenados electrónicamente en un sistema de computadora");
    System.out.println("2- Es un lenguaje de programación");
    System.out.println("3- Es un componente de un equipo");
    int pregunta5 = teclado.nextInt();
    switch (pregunta5) {
      case 1:
        System.out.println("CORRECTO");
        puntos++;
        break;
      case 2:
      case 3:
        System.out.println("INCORRECTO");
        break;
      default:
        System.out.println("esta respuesta no es válida");
    }
    System.out.println("PREGUNTA 6: Un entorno de desarrollo es ....");
    System.out.println(
        "1- es una colección organizada de información estructurada, o datos, típicamente almacenados electrónicamente en un sistema de computadora");
    System.out.println(
        "2- es una aplicación informática que proporciona servicios integrales para facilitarle al desarrollador o programador el desarrollo de software");
    System.out.println("3- Es un componente de un equipo");
    int pregunta6 = teclado.nextInt();
    switch (pregunta6) {
      case 2:
        System.out.println("CORRECTO");
        puntos++;
        break;

      case 1:
      case 3:
        System.out.println("INCORRECTO");
        break;
      default:
        System.out.println("esta respuesta no es válida");
    }
    System.out.println("PREGUNTA 7: Un DISCO DURO es ....");
    System.out.println(
        "1- es una colección organizada de información estructurada, o datos, típicamente almacenados electrónicamente en un sistema de computadora");
    System.out.println(
        "2- es una aplicación informática que proporciona servicios integrales para facilitarle al desarrollador o programador el desarrollo de software");
    System.out.println("3- Es un componente de un equipo que sirve para alamcenar información");
    int pregunta7 = teclado.nextInt();
    switch (pregunta7) {
      case 1:
        System.out.println("INCORRECTO");
      case 2:
        break;
      default:
        System.out.println("esta respuesta no es válida");

      case 3:
        System.out.println("CORRECTO");
        puntos++;
        break;
    }
    System.out.println("PREGUNTA 8: ¿QUÉ SIGNIFICAN LAS SIGLAS DE FOL?");
    System.out.println("1- FACULTAD O LIBERTAD");
    System.out.println("2- FORMACIÓN ORIENTACIÓN LABORAL");
    System.out.println("3- FUNCIÓN ORIENTADA LIBRO");
    int pregunta8 = teclado.nextInt();
    switch (pregunta8) {
      case 2:
        System.out.println("CORRECTO");
        puntos++;
        break;
      case 1:
      case 3:
        System.out.println("INCORRECTO");
        break;
      default:
        System.out.println("esta respuesta no es válida");
    }
    System.out.println("PREGUNTA 9: Un entorno de desarrollo es ....");
    System.out.println(
        "1- es una colección organizada de información estructurada, o datos, típicamente almacenados electrónicamente en un sistema de computadora");
    System.out.println(
        "2- es una aplicación informática que proporciona servicios integrales para facilitarle al desarrollador o programador el desarrollo de software");
    System.out.println("3- Es un componente de un equipo");
    int pregunta9 = teclado.nextInt();
    switch (pregunta9) {
      case 2:
        System.out.println("CORRECTO");
        puntos++;
        break;
      case 1:
      case 3:
        System.out.println("INCORRECTO");
        break;
      default:
        System.out.println("esta respuesta no es válida");
    }
    System.out.println("PREGUNTA 10: LA RESPUESTA CORRECTA ES LA 3");
    System.out.println("1- Sigue para abajo, esta no es.");
    System.out.println("2- Mira la siguiente.");
    System.out.println("3- Escoge esta opción");
    int pregunta10 = teclado.nextInt();
    switch (pregunta10) {
      case 2:
      case 1:
        System.out.println("INCORRECTO");
        break;
      default:
        System.out.println("esta respuesta no es válida");
      case 3:
        System.out.println("CORRECTO");
        puntos++;
        break;
    }
    System.out.println("EL RESULTADO DE TU CUESTIONARIO ES: " + puntos);
  }
}
