package entregabletarde;

import java.util.Arrays;

public class vivienda {
        private String direccion;
        private int contador=0;
        private int metroscuadrados;

        private estancias[] sitios= new estancias[contador];

    public enum estancias {
        SALÓN, COCINA, BAÑO, DORMITORIO, TERRAZA, VESTÍBULO, COMEDOR, BALCÓN
    }
    private estancias estanciias;
        public vivienda(String direccion, int metroscuadrados){
            this.direccion=direccion;
            this.metroscuadrados=metroscuadrados;

        }

        public void meterinstancias(estancias estanciias){
    if (contador < sitios.length) {
        sitios[contador] = estanciias;
        contador++;
    }

        }

        public void eliminarestancias(estancias estanciias){
    for (int i = 0; i < sitios.length; i++) {
        if (sitios[i] == estanciias){
            sitios[i]=null;
        }
    }
        }

        public static void imprimirpantalla(){
            for (estancias lugaresdecasa :estancias.values() ) {
      System.out.println(lugaresdecasa);
            }
    }
        }

