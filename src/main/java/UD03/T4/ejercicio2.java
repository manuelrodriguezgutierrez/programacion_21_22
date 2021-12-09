package UD03.T4;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio2 {
  public static void main(String[] args) {
    //Escribe un programa que pida 8 palabras y las almacene en un array.
      // A continuación, las palabras correspondientes a colores se deben almacenar alcomienzo
      // y las que no son colores a continuación. Puedes utilizar tantos arraysauxiliares como quieras. Los colores que conoce
      //el programa deben estar en otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,blanco y morado.


      //ARRAY COLORES:
      String[] colores= {"verde","rojo","azul","amarillo","naranja","rosa","negro","blanco","morado"};
      //creo el scanner

      Scanner teclado=new Scanner(System.in);

      //CREAR ARRAY, PIDE 8 PALABRAS, y MUESTRA EL ARRAY CON LAS PALABRAS ORIGINALES.
      String [] array_palabras= new String[8];
    for (int i = 0; i < array_palabras.length; i++) {
      System.out.println("INTRODUCE 8 PALABRAS: ");
       array_palabras[i]= teclado.nextLine();
    }
      System.out.println("array original: "+Arrays.toString(array_palabras));

    //CREO OTRO ARRAY PARA COPIAR LA INFORMACIÓN QUE INTRODUCIMOS EN EL PRIMER ARRAY.
      String[] color = new String[0];
      String[] palabras_normales= new String[0];
      int indice_color=0;
      int indicie_palabras=0;
    for (int i = 0; i < array_palabras.length; i++) {
      for (int j = 0; j < colores.length; j++) {
       if (array_palabras[i].equalsIgnoreCase(colores[j])){
           color=Arrays.copyOf(color,color.length+1);
           color[indice_color]=array_palabras[i];
           indice_color++;
          }else {
           palabras_normales=Arrays.copyOf(palabras_normales, palabras_normales.length+1);
           palabras_normales[indicie_palabras]=array_palabras[i];
           indicie_palabras++;
       }
      }
    }
  }}