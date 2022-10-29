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

    public static void descuento(Idioma idioma){
        LinkedList<Departamento> proba = idioma.getProbabilidades();
        Random azar = new Random();
        Departamento conDescuento = proba.get(azar.nextInt(proba.size()));
        conDescuento.aplicarDescuentoDepartamento((azar.nextInt(3)+1)/10);
    }
}
