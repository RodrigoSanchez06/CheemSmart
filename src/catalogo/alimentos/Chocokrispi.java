package catalogo.alimentos;

import catalogo.Producto;

public class Chocokrispi implements Producto{

    @Override
    public String nombre() {
        return "Chocokrispi";
    }

    @Override
    public double precio() {
        return 36.90;
    }

    @Override
    public String departamento() {
        return "Alimentos";
    }

    @Override
    public double codigoBarras() {
        return 001;
    }
    
}
