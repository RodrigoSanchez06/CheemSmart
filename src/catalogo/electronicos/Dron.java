package catalogo.electronicos;

import catalogo.Producto;

public class Dron implements Producto{

    @Override
    public String nombre() {
        return "Dron";
    }

    @Override
    public double precio() {
        return 3250.85;
    }

    @Override
    public String departamento() {
        return "Electronicos";
    }

    @Override
    public double codigoBarras() {
        return 100;
    }
    
}
