package catalogo;

/**
 * Clase abstracta que representa a un producto de la tienda CheemSmart.
 */
public interface Producto {

    /**
     * regresa el nombre del producto.
     * @return nombre del producto.
     */
    String nombre();

    /**
     * regresa el precio del producto.
     * @return precio del producto.
     */
    double precio();

    /**
     * regresa el departamento al que pertenece el producto.
     * @return departamento del producto.
     */
    String departamento();

    /**
     * regresa el código de barras del producto.
     * @return codigo de barras del producto. 
     */
    String codigoBarras();

    void aplicarDescuento(double d);

    double getMultiplicadorDescuento();
}
