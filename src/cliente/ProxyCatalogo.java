package cliente;

import java.util.Iterator;

import catalogo.Departamento;

/**
 * Clase que implementa un Proxy para el catalogo de la tienda de modo que brinde mas seguridad
 * @author Chao280802 Heigz RodrigoSanchez06
 * @see ICatalogo
 */
public class ProxyCatalogo implements ICatalogo{
    private Catalogo catalogo = new Catalogo();

    /**
     * Método que imprime en pantalla los productos del catalago organizados por departamentos
     */
    public void imprimirCatalogo(){
        this.catalogo.imprimirCatalogo();
    }

    /**
     * Metodo que devuelve un iterador que recorre los departamentos
     */
    public Iterator<Departamento> iteradorDepartamentos(){
        return this.catalogo.iteradorDepartamentos();
    }

    /**
     * Método que aplica el descuento correspondiente a cierto departamento
     * @param d Departamento con el descuento que queremos aplicar
     */
    public void descuento(Departamento d){
        catalogo.descuento(d);
    }
}