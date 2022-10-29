package cliente;

import java.util.Iterator;
import catalogo.Departamento;
import java.util.LinkedList;
import java.util.Random;
import idiomas.Idioma;

/**
 * Interfaz que define el comportamiento del catálogo de la tienda CheemSmart
 */
public interface ICatalogo {
    Iterator<Departamento> iteradorDepartamentos();

    void imprimirCatalogo();

    public void descuento(Departamento d);
}
