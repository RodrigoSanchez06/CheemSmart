package catalogo.electrodomesticos;

import catalogo.Producto;

public class Lavadora implements Producto{

    @Override
    public String nombre() {
        return "Lavadora";
    }

    @Override
    public double precio() {
        return 6999.80;
    }

    @Override
    public String departamento() {
        return "Electrodomesticos";
    }

    @Override
    public double codigoBarras() {
        return 010;
    }
    
}
