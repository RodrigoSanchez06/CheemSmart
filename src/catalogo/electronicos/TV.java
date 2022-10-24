package catalogo.electronicos;

import catalogo.Producto;

public class TV implements Producto{

    @Override
    public String nombre() {
        return "Televisión de 50 pulgadas";
    }

    @Override
    public double precio() {
        return 6599.99;
    }

    @Override
    public String departamento() {
        return "Electrónicos";
    }

    @Override
    public double codigoBarras() {
        return 300;
    }
    
}
