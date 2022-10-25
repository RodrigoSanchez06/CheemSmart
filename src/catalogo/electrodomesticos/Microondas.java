package catalogo.electrodomesticos;

import catalogo.Producto;

public class Microondas implements Producto{

    @Override
    public String nombre() {
        return "Microondas";
    }

    @Override
    public double precio() {
        return 2570.99;
    }

    @Override
    public String departamento() {
        return "Electrodomesticos";
    }

    @Override
    public double codigoBarras() {
        return 030;
    }
    
}
