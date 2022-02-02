package UD04.EJ5;

public class texto {
    public int longitud;

    public String caracter;

    public String cadena;

    public String cadenasecundaria;

        public texto (){
            this.longitud= 100;

            }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public void setCadenasecundaria(String cadenasecundaria) {
        this.cadenasecundaria = cadenasecundaria;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }



    public String getCaracter() {
        return caracter;
    }

    public String getCadenasecundaria() {
        return cadenasecundaria;
    }

    public String getCadena() {
        return cadena;
    }
}
