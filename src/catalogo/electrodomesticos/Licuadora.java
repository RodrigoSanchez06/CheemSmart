package catalogo.electrodomesticos;

import catalogo.Producto;

public class Licuadora implements Producto{

    @Override
    public String nombre() {
        return "Licuadora";
    }

    @Override
    public double precio() {
        return 895.99;
    }

    @Override
    public String departamento() {
        return "Electrodomesticos";
    }

    @Override
    public double codigoBarras() {
        return 020;
    }

}