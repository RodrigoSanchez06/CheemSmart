package catalogo.alimentos;

import java.util.ArrayList;
import java.util.Iterator;

import catalogo.Departamento;
import catalogo.Producto;

public class Alimentos implements Departamento {

    private String nombreDepartamento = "Alimentos";
    private ArrayList<Producto> alimentos = new ArrayList<Producto>();

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
        return alimentos.iterator();
    }

}
