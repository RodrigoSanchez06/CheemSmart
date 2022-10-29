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

    private Departamento departamentoAlimentos = new Alimentos();
    private Departamento departamentoElectronicos = new Electronicos();
    private Departamento departamentoElectrodomesticos = new Electrodomesticos();
    private Iterator<Departamento> departamentos;

    /**
     * Constructor por omision de un catalogo por defecto
     */
    public Catalogo(){
        LinkedList<Departamento> sDepartamentos = new LinkedList<Departamento>();
        sDepartamentos.add(departamentoAlimentos);
        sDepartamentos.add(departamentoElectrodomesticos);
        sDepartamentos.add(departamentoElectronicos);
        this.departamentos = sDepartamentos.iterator();
    }

    /**
     * Método que imprime en pantalla los productos del catalago organizados por departamentos
     */
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

    /**
     * Metodo que devuelve un iterador que recorre los departamentos
     */
    public Iterator<Departamento> iteradorDepartamentos(){
        return this.departamentos;
    }

    /**
     * Método que aplica el descuento correspondiente a cierto departamento
     * @param d Departamento con el descuento que queremos aplicar
     */
    public void descuento(Departamento d){
        if(d.obtenerDescuento() == 0)
            throw new IllegalStateException();
        if(d.obtenerDepartamento().equals("Alimentos")){
            departamentoAlimentos.aplicarDescuentoDepartamento(d.obtenerDescuento()/100);
        }
        else if(d.obtenerDepartamento().equals("Electronicos")){
            departamentoElectronicos.aplicarDescuentoDepartamento(d.obtenerDescuento()/100);
        }
        else if(d.obtenerDepartamento().equals("Electrodomesticos")){
            departamentoElectrodomesticos.aplicarDescuentoDepartamento(d.obtenerDescuento()/100);
        }
    }

}
