package catalogo.alimentos;

import catalogo.Producto;

/**
 * Clase que representa a un producto Chocokrispi (implementa a la interfaz
 * producto).
 */
public class salchicha implements Producto {

    /**
     * regresa el nombre del producto.
     * 
     * @return nombre del producto.
     */
    @Override
    public String nombre() {
        return "Salchicha";
    }

    /**
     * regresa el precio del producto.
     * 
     * @return precio del producto.
     */
    @Override
    public double precio() {
        return 47.90;
    }

    /**
     * regresa el departamento al que pertenece el producto.
     * 
     * @return departamento del producto.
     */
    @Override
    public String departamento() {
        return "Alimentos";
    }

    /**
     * regresa el código de barras del producto.
     * 
     * @return codigo de barras del producto.
     */
    @Override
    public double codigoBarras() {
        return 003;
    }

}
