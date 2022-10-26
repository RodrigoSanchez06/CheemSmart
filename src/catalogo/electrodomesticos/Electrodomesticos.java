package catalogo.electrodomesticos;

import java.util.ArrayList;
import java.util.Iterator;

import catalogo.Departamento;
import catalogo.Producto;

public class Electrodomesticos implements Departamento {

    private String nombreDepartamento = "Electrodomesticos";
    private ArrayList<Producto> electroDom = new ArrayList<Producto>();

    /**
     * Costructor por omision que inicializa la lista con los 3 productos de
     * electrodometicos
     */
    public Electrodomesticos() {
        electroDom.add(new Lavadora());
        electroDom.add(new Licuadora());
        electroDom.add(new Microondas());
    }

    /**
     * Metodo consultor del titulo del departamento
     * 
     * @return Devuelve un String con el titulo del departamento
     */
    public String obtenerDepartamento() {
        return this.nombreDepartamento;
    }

    /**
     * Metodo que devuelve un iterador que permite recorrer los productos del
     * departamento
     * 
     * @return Devuelve un iterador del departamento en cuestion
     */
    public Iterator<Producto> obtenerIterador() {
        return electroDom.iterator();
    }

}
