package cliente;

import java.util.Iterator;
import catalogo.Departamento;

/**
 * Interfaz que define el comportamiento del catálogo de la tienda CheemSmart
 */
public interface ICatalogo {
    Iterator<Departamento> iteradorDepartamentos();

    void imprimirCatalogo();
}
