package cliente;

import java.util.LinkedList;
import java.util.Iterator;
import catalogo.Departamento;

/**
 * Interfaz que define el comportamiento del catálogo de la tienda CheemSmart
 */
public interface ICatalogo {

    /**
     * Crea una linkedList con los diferentes departamentos que existen.
     * 
     * @param alimentos         menu de lujo.
     * @param electrodomesticos menu versatil.
     * @param Electronicos      menu tradicional.
     * @return lista con todos los departamentos que existen.
     */
    public static Iterator<Departamento> subDepartamentos(Departamento alimentos, Departamento electrodomesticos,
            Departamento electronicos) {
        LinkedList<Departamento> sDepartamentos = new LinkedList<Departamento>();
        sDepartamentos.add(alimentos);
        sDepartamentos.add(electrodomesticos);
        sDepartamentos.add(electronicos);
        return sDepartamentos.iterator();
    }
}
