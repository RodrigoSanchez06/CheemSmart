package catalogo.electrodomesticos;

import catalogo.Producto;

/**
 * Clase que representa a un producto Licuadora (implementa a la interfaz
 * producto).
 */
public class Licuadora implements Producto {

    /**
     * regresa el nombre del producto.
     * 
     * @return nombre del producto.
     */
    @Override
    public String nombre() {
        return "Licuadora";
    }

    /**
     * regresa el precio del producto.
     * 
     * @return precio del producto.
     */
    @Override
    public double precio() {
        return 895.99;
    }

    /**
     * regresa el departamento al que pertenece el producto.
     * 
     * @return departamento del producto.
     */
    @Override
    public String departamento() {
        return "Electrodomesticos";
    }

    /**
     * regresa el código de barras del producto.
     * 
     * @return codigo de barras del producto.
     */
    @Override
    public double codigoBarras() {
        return 020;
    }

}