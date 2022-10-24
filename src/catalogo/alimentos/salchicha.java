package catalogo.alimentos;

import catalogo.Producto;

public class salchicha implements Producto{

    @Override
    public String nombre() {
        return "Salchicha";
    }

    @Override
    public double precio() {
        return 47.90;
    }

    @Override
    public String departamento() {
        return "Alimentos";
    }

    @Override
    public double codigoBarras() {
        return 003;
    }
    
}
