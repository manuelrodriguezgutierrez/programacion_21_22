package UD01.T5B;

import java.util.Objects;
import java.util.Scanner;

public class ej5b_15 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int puntos = 0;
    System.out.println(
        "TE REALIZAREMOS UNAS PREGUNTAS PARA SABER SI TU PAREJA TE ESTÁ SINEDO FIEL O NO.....PARA ELLO TENDRÁ QUE CONTESTAR CON VERDADERO O FALSO");
    System.out.println(
        "1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
    String respuesta1 = teclado.nextLine();
    if (respuesta1.equals("verdadero")) {
      puntos += 3;
    } else if (respuesta1.equals("falso")) {
    }

    System.out.println("2. Ha aumentado sus gastos de vestuario");
    String respuesta2 = teclado.nextLine();
    if (respuesta2.equals("verdadero")) {
      puntos += 3;
    } else if (respuesta2.equals("falso")) {
    }

    System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
    String respuesta3 = teclado.nextLine();
    if (respuesta3.equals("verdadero")) {
      puntos += 3;
    } else if (respuesta3.equals("falso")) {
    }

    System.out.println(
        "4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
    String respuesta4 = teclado.nextLine();
    if (respuesta4.equals("verdadero")) {
      puntos += 3;
    } else if (respuesta4.equals("falso")) {
    }

    System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
    String respuesta5 = teclado.nextLine();
    if (respuesta5.equals("verdadero")) {
      puntos += 3;
    } else if (respuesta5.equals("falso")) {
    }

    System.out.println(
        "6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
    String respuesta6 = teclado.nextLine();
    if (respuesta6.equals("verdadero")) {
      puntos += 3;
    } else if (respuesta6.equals("falso")) {
    }

    System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
    String respuesta7 = teclado.nextLine();
    if (respuesta7.equals("verdadero")) {
      puntos += 3;
    } else if (respuesta7.equals("falso")) {
    }

    System.out.println(
        "8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
    String respuesta8 = teclado.nextLine();
    if (respuesta8.equals("verdadero")) {
      puntos += 3;
    } else if (respuesta8.equals("falso")) {
    }

    System.out.println("9. Has notado que últimamente se perfuma más");
    String respuesta9 = teclado.nextLine();
    if (respuesta9.equals("verdadero")) {
      puntos += 3;
    } else if (respuesta9.equals("falso")) {
    }

    System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    String respuesta10 = teclado.nextLine();
    if (respuesta10.equals("verdadero")) {
      puntos += 3;
    } else if (respuesta10.equals("falso")) {
    }
    System.out.println(
        "Puntuación entre 0 y 10: ¡Enhorabuena! tu pareja parece ser totalmente fiel.\n"
            + "• Puntuación entre 11 y 22: Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.\n"
            + "• Puntuación entre 22 y 30: Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
    System.out.println("TU PUNTUACIÓN HA SIDO:  " + puntos);
  }
}
