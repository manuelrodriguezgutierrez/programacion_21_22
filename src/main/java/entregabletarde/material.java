package entregabletarde;

public class material {
    private String descripcion;
    private String proveedor;
    private int unidadesnecesarias;
    private int preciounidad;
    private static int IVA;

    public material (String descripcion, String proveedor, int unidadesnecesarias, int preciounidad, int IVA){
        this.descripcion=descripcion;
        this.proveedor=proveedor;
        this.unidadesnecesarias=unidadesnecesarias;
        this.preciounidad=preciounidad;
        material.IVA=IVA;
    }

    public material (String descripcion,int unidadesnecesarias, int preciounidad, int IVA){
        this.descripcion=descripcion;
        this.unidadesnecesarias=unidadesnecesarias;
        this.preciounidad=preciounidad;
        material.IVA=IVA;
    }


    public static void setIVA(int IVA) {
        material.IVA = IVA;
    }

    public static int getIVA() {
        return IVA;
    }
}
