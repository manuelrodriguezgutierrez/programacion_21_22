package UD04.EJ8;

public class bombilla {
    public boolean estado;
    boolean bombilla;
    boolean apagada;
    boolean encendida;
   static boolean interruptor;

    public void bombilla(){
        this.estado=true;
    }

public void dimeESTADO(){
    if (this.estado==true && interruptor==true){
      System.out.println("ESTÁ ENCENDIDA");
    }else {
      System.out.println("ESTÁ APAGADA");
    }
}
public void estadointerruptor(){
    if (interruptor==true){
        System.out.println("ESTÁ ENCENDIDO");
    }else {
        System.out.println("ESTÁ APAGADO");
    }
}

    public void encender(){
        this.estado=true;
    }
    public void apagar(){
        this.estado=false;
    }


    public static void  interruptorencender(){
        interruptor=true;
    System.out.println("INTERRUPTOR ENCENDIDO");
    }

    public static void interruptorapagar(){
        interruptor=false;

    }

}
