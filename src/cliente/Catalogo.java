package cliente;

import java.util.Iterator;
import java.util.LinkedList;
import catalogo.*;
import catalogo.electrodomesticos.Electrodomesticos;
import catalogo.alimentos.Alimentos;
import catalogo.electronicos.Electronicos;

/**
 * Clase que representa al catálogo de la tienda CheemSmart
 */
public class Catalogo implements ICatalogo{
    // hacer una clase para alimentos
    // hacer una clase para electrodomesticos, electronicos y alimentos, en su
    // constructor le agrego los productos de su categoria. y les hago un metodo
    // para que devuelvan su iterador. el menu lo cambio a departamento

    Departamento departamentoAlimentos = new Alimentos();
    Departamento departamentoElectronicos = new Electronicos();
    Departamento departamentoElectrodomesticos = new Electrodomesticos();

    Iterator<Departamento> departamentos;

    public Catalogo(){
        LinkedList<Departamento> sDepartamentos = new LinkedList<Departamento>();
        sDepartamentos.add(departamentoAlimentos);
        sDepartamentos.add(departamentoElectrodomesticos);
        sDepartamentos.add(departamentoElectronicos);
        this.departamentos = sDepartamentos.iterator();
    }

    public void imprimirCatalogo(){
        Iterator<Departamento> i = this.iteradorDepartamentos();
        while(i.hasNext()){
            Departamento d = i.next();
            Iterator<Producto> j = d.obtenerIterador();
            System.out.println("Departamento: "+d.obtenerDepartamento().toUpperCase()+"\n");
            while(j.hasNext()){
                Producto p = j.next();
                System.out.println(p.nombre()+"\n"
                + "Precio : "+p.precio()+"\n"
                + "Codigo de barras: "+p.codigoBarras()+"\n");
            }
        }
    }

    public Iterator<Departamento> iteradorDepartamentos(){
        return this.departamentos;
    }

}
