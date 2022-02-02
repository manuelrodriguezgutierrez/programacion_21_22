package UD04.EJ1;

import UD04.EJ6.BANCO;

public class cuenta_corriente {
     private int saldo;
        private int limite;
        private int ingressar;

    public BANCO id_banco;

    private int retirada;

    public String nombre;
    String DNI;

    public cuenta_corriente(String nombre, String DNI, BANCO id_banco){
            this.DNI=DNI;
            this.limite=-50;
            this.saldo=0;
            this.nombre=nombre;
            this.id_banco=id_banco;

}

  public cuenta_corriente(String nombre, String DNI) {
    this.DNI = DNI;
    this.limite = -50;
    this.saldo = 0;
    this.nombre = nombre;
    this.id_banco = id_banco;
        }

    //ACTIVDAD 2 SOBRECARGAR CONSTRUCTORES

    cuenta_corriente(int saldo){
            this.saldo=saldo;
            this.limite=0;
}
    cuenta_corriente(int saldo, int limite, String DNI){
        this.DNI=DNI;
        this.limite=limite;
        this.saldo=saldo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public void setIngressar(int ingressar) {
        this.ingressar = ingressar;
    }

    public void setRetirada(int retirada) {
        this.retirada = retirada;
    }

    public void setId_banco(BANCO id_banco) {
        this.id_banco = id_banco;
    }

    public void setBanco(String banco) {
        this.id_banco = id_banco;
    }

    public void ingresar(){
        this.saldo= this.saldo+this.ingressar;
    System.out.println("LA CANTIDAD INGRESADA HA SIDO REALIZADA CON ÉXITO....");
    System.out.println("SU SALDO ACTUALMENTE ES: "+this.saldo);
    }

    public void retirada(){
        if (this.retirada>this.limite){
           this.saldo=this.saldo - this.retirada;
      System.out.println("Se ha retirado la cantidad indicada....");
      System.out.println("SU SALDO ACTUALMENTE ES: "+this.saldo);

        }else {
      System.out.println("NO PUEDE RETIRAR DICHA CANTIDAD....");
            System.out.println("SU SALDO ACTUALMENTE ES: "+this.saldo);

        }
    }
    public void informacion(){
    System.out.println("Su nombre: "+this.nombre);
    System.out.println("SU DNI: "+this.DNI);
    System.out.println("SU SALDO: "+this.saldo);
    System.out.println("SU BANCO: "+id_banco.Nombre);
    System.out.println("DIRECCIÓN: "+id_banco.dirección);
    System.out.println("CAPITAL "+id_banco.capital);

    }
}
