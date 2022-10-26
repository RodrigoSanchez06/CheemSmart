package cliente;

import java.util.LinkedList;
import catalogo.*;
import catalogo.alimentos.Alimentos;
import catalogo.electrodomesticos.Electrodomesticos;
import catalogo.electronicos.Electronicos;

public class Catalogo {
    private LinkedList<Producto> opciones;
    // hacer una clase para alimentos
    // hacer una clase para electrodomesticos, electronicos y alimentos, en su
    // constructor le agrego los productos de su categoria. y les hago un metodo
    // para que devuelvan su iterador. el menu lo cambio a departamento

    Departamento departamentoAlimentos = new Alimentos();
    Departamento departamentoElectonicos = new Electronicos();
    Departamento departamentoElectrodomesticos = new Electrodomesticos();

    LinkedList<Departamento> subDepartamentos = subDepartamentos(departamentoAlimentos, departamentoElectrodomesticos,
            departamentoAlimentos);

    /**
     * Crea una linkedList con los diferentes departamentos que existen.
     * 
     * @param alimentos         menu de lujo.
     * @param electrodomesticos menu versatil.
     * @param Electronicos      menu tradicional.
     * @return lista con todos los departamentos que existen.
     */
    public static LinkedList<Departamento> subDepartamentos(Departamento alimentos, Departamento electrodomesticos,
            Departamento electronicos) {
        LinkedList<Departamento> sDepartamentos = new LinkedList<Departamento>();
        sDepartamentos.add(alimentos);
        sDepartamentos.add(electrodomesticos);
        sDepartamentos.add(electronicos);
        return sDepartamentos;
    }
}
