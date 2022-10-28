package cliente;

import java.util.Iterator;

import catalogo.Departamento;

public class ProxyCatalogo implements ICatalogo{
    private Catalogo catalogo = new Catalogo();

    public void imprimirCatalogo(){
        this.catalogo.imprimirCatalogo();
    }

    public Iterator<Departamento> iteradorDepartamentos(){
        return this.catalogo.iteradorDepartamentos();
    }
}