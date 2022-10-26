package catalogo.electronicos;

import java.util.ArrayList;
import java.util.Iterator;

import catalogo.Departamento;
import catalogo.Producto;

public class Electronicos implements Departamento {

    private String nombreDepartamento = "Electrodomesticos";
    private ArrayList<Producto> electro = new ArrayList<Producto>();

    /**
     * Costructor por omision que inicializa la lista con los 3 productos de
     * electrodometicos
     */
    public Electronicos() {
        electro.add(new LaptopGamerPro());
        electro.add(new TV());
        electro.add(new Dron());
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
        return electro.iterator();
    }

}
