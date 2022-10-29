package cliente;

import java.util.Iterator;
import catalogo.Departamento;

/**
 * Interfaz que define el comportamiento del catálogo de la tienda CheemSmart
 */
public interface ICatalogo {
    /**
     * Metodo que devuelve un iterador que recorre los departamentos
     */
    Iterator<Departamento> iteradorDepartamentos();

    /**
     * Método que imprime en pantalla los productos del catalago organizados por departamentos
     */
    void imprimirCatalogo();

    /**
     * Método que aplica el descuento correspondiente a cierto departamento
     * @param d Departamento con el descuento que queremos aplicar
     */
    void descuento(Departamento d);
}
