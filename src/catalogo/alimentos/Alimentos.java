package catalogo.alimentos;

import java.util.ArrayList;
import java.util.Iterator;

import catalogo.Departamento;
import catalogo.Producto;

/**
 * Clase que representa al departamento de Alimentos de CheemSmart.
 */
public class Alimentos implements Departamento {

    private String nombreDepartamento = "Alimentos";
    private ArrayList<Producto> alimentos = new ArrayList<Producto>();
    private double descuento;

    /**
     * Constructor por omoision que inicializa la lista con 3 tipos de hamburguesas
     */
    public Alimentos() {
        alimentos.add(new Chocokrispis());
        alimentos.add(new Leche());
        alimentos.add(new Salchicha());

    }

    /**
     * Metodo consultor del departamento actual
     * 
     * @return Devuelve un String con el titulo del departamento
     */
    @Override
    public String obtenerDepartamento() {
        return this.nombreDepartamento;
    }

    /**
     * Metodo que devuelve un iterador que permite recorrer los productos del
     * departamento.
     * 
     * @return Devuelve un iterador del departamento en cuestion.
     */
    @Override
    public Iterator<Producto> obtenerIterador() {
        return alimentos.iterator();
    }

    /**
     * Aplica el descuento a todos los prouctos del departamento.
     */
    @Override
    public void aplicarDescuentoDepartamento(double d) {
        Iterator<Producto> i = alimentos.iterator();
        while (i.hasNext())
            i.next().aplicarDescuento(d);
        this.descuento = d;
    }

    /**
     * Obtiene el descuento del producto
     */
    public double obtenerDescuento() {
        return this.descuento * 100;
    }
}
