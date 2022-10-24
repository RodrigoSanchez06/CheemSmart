package catalogo.electronicos;

import catalogo.Producto;

public class LaptopGamerPro implements Producto{

    @Override
    public String nombre() {
        return "Laptop Gamer Pro.";
    }

    @Override
    public double precio() {
        return 18700.99;
    }

    @Override
    public String departamento() {
        return "Electronicos";
    }

    @Override
    public double codigoBarras() {
        return 200;
    }

}