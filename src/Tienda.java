import java.util.LinkedList;

import catalogo.Departamento;
import catalogo.alimentos.Alimentos;
import catalogo.electrodomesticos.Electrodomesticos;
import catalogo.electronicos.Electronicos;
import idiomas.EspanniolEsp;

public class Tienda {
    public static void main(String[] args) {
        LinkedList<Departamento> probabilidadesDepartamentos = new LinkedList<>();
        Electrodomesticos electrodomesticos = new Electrodomesticos();
        Alimentos alimentos = new Alimentos();
        Electronicos electronicos = new Electronicos();
        probabilidadesDepartamentos.add(electrodomesticos);
        probabilidadesDepartamentos.add(alimentos);
        probabilidadesDepartamentos.add(alimentos);
        probabilidadesDepartamentos.add(electronicos);
        System.out.println("qpd si jalo xd");
    }
}
