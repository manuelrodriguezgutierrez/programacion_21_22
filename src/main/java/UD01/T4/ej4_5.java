package UD01.T4;

import java.util.Calendar;

public class ej4_5 {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        int hora, minutos, segundos;
        hora = calendario.get(Calendar.HOUR_OF_DAY);
        minutos= calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
        System.out.println(hora +":"+ minutos+":"+segundos);

    }
}
