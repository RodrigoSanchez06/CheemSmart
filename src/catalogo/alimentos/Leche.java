package catalogo.alimentos;

import catalogo.Producto;

public class Leche implements Producto{

    @Override
    public String nombre() {
        return "Leche";
    }

    @Override
    public double precio() {
        return 26.80;
    }

    @Override
    public String departamento() {
        return "Alimentos";
    }

    @Override
    public double codigoBarras() {
        return 002;
    }
    
}
