package catalogo;

import java.util.Iterator;

/**
 * Interfaz que define el comportamiento de los distintos departamentos en
 * CheemSmart.
 */
public interface Departamento {

    /**
     * Metodo consultor del titulo del departamento
     * 
     * @return Devuelve un String con el titulo del departamento
     */
    String obtenerDepartamento();

    /**
     * Metodo que devuelve un iterador que permite recorrer los productos contenidos
     * en el catalogo
     * 
     * @return Devuelve un iterador del catalogo en cuestion
     */
    Iterator<Producto> obtenerIterador();

    /**
     * Aplica el descuento a todos los prouctos del departamento.
     */
    void aplicarDescuentoDepartamento(double d);

    double obtenerDescuento();
}
