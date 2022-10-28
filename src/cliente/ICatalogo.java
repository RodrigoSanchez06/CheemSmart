package cliente;

import java.util.Iterator;
import catalogo.Departamento;

public interface ICatalogo {
    Iterator<Departamento> iteradorDepartamentos();

    void imprimirCatalogo();
}
