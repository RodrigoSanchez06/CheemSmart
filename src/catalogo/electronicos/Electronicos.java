package catalogo.electronicos;

import java.util.ArrayList;
import java.util.Iterator;

import catalogo.Departamento;
import catalogo.Producto;

/**
 *  Clase que representa al departamento de Electroincos de CheemSmart.
 */
public class Electronicos implements Departamento {

    private String nombreDepartamento = "Electronicos";
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
    @Override
    public String obtenerDepartamento() {
        return this.nombreDepartamento;
    }

    /**
     * Metodo que devuelve un iterador que permite recorrer los productos del
     * departamento
     * 
     * @return Devuelve un iterador del departamento en cuestion
     */
    @Override
    public Iterator<Producto> obtenerIterador() {
        return electro.iterator();
    }

    /**
     * Aplica el descuento a todos los prouctos del departamento.
     */
    @Override
    public void aplicarDescuentoDepartamento(double d){
        Iterator<Producto> i = electro.iterator();
        while(i.hasNext())
            i.next().aplicarDescuento(d);
    }

}
