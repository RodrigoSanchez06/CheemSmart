package catalogo.electrodomesticos;

import java.util.ArrayList;
import java.util.Iterator;

import catalogo.Departamento;
import catalogo.Producto;


/**
 *  Clase que representa al departamento de Electrodomesticos de CheemSmart.
 */
public class Electrodomesticos implements Departamento {

    private String nombreDepartamento = "Electrodomesticos";
    private ArrayList<Producto> electroDom = new ArrayList<Producto>();
    private double descuento;

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
        return electroDom.iterator();
    }

    /**
     * Aplica el descuento a todos los prouctos del departamento.
     */
    @Override
    public void aplicarDescuentoDepartamento(double d){
        Iterator<Producto> i = electroDom.iterator();
        while(i.hasNext())
            i.next().aplicarDescuento(d);
        this.descuento = d;
    }

    public double obtenerDescuento(){
        return this.descuento*100;
    }
}
