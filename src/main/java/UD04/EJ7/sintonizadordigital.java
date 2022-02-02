package UD04.EJ7;

public class sintonizadordigital {
    public double subirradio;
    public double MHz=80;
    public double bajarradio;


    void subirradio(){
        this.MHz+=0.5;
        limites();
    }
    void bajarradio(){
        this.MHz-=0.5;
        limites();

    }

    void display(){
    System.out.println("LA CADENA EN LA QUE ESTÁ ES: "+this.MHz);
    }

    void limites(){
        if (MHz>108){
            MHz=80;
        }
        else if (MHz<80){
            MHz=108;
        }
    }
}
