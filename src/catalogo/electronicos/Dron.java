package catalogo.electronicos;

import catalogo.Producto;

/**
 * Clase que representa a un producto Dron (implementa a la interfaz
 * producto).
 */
public class Dron implements Producto {

    /**
     * regresa el nombre del producto.
     * 
     * @return nombre del producto.
     */
    @Override
    public String nombre() {
        return "Dron";
    }

    /**
     * regresa el precio del producto.
     * 
     * @return precio del producto.
     */
    @Override
    public double precio() {
        return 3250.85;
    }

    /**
     * regresa el departamento al que pertenece el producto.
     * 
     * @return departamento del producto.
     */
    @Override
    public String departamento() {
        return "Electronicos";
    }

    /**
     * regresa el código de barras del producto.
     * 
     * @return codigo de barras del producto.
     */
    @Override
    public double codigoBarras() {
        return 100;
    }

}
