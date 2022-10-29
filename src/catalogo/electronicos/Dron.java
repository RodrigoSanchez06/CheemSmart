package catalogo.electronicos;

import catalogo.Producto;

/**
 * Clase que representa a un producto Dron (implementa a la interfaz
 * producto).
 */
public class Dron implements Producto {

    private double descuento=1;

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
        return 3250.85*this.descuento;
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
    public String codigoBarras() {
        return "100";
    }

    /**
     * Aplica el descuento al producto.
     * @param d porcentaje de descuento
     */
    @Override
    public void aplicarDescuento(double d){
        if(d < 0 || d >= 1)
            throw new IllegalArgumentException();
        this.descuento = (1-d);
    }

    /**
     * Regresa el descuento del producto.
     * @return descuento del producto.
     */
    @Override
    public double getMultiplicadorDescuento(){
        return this.descuento;
    }
}
