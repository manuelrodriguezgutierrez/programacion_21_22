package UD04.EJ9;

public class Mecanicos {
    String nombrecompleto;
    char telefono;
    enum especialidad {
        frenos,hidráulica,ruedas
    }
    public Mecanicos(String nombrecompleto, char telefono,especialidad tipo){
        this.nombrecompleto=nombrecompleto;
        this.telefono=telefono;

    }

}
