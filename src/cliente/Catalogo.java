package cliente;

import java.util.Iterator;
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
    Departamento departamentoElectonicos = new Electronicos();
    Departamento departamentoElectrodomesticos = new Electrodomesticos();

    Iterator<Departamento> subDepartamentos = ICatalogo.subDepartamentos(departamentoAlimentos, departamentoElectrodomesticos, departamentoAlimentos);

}
