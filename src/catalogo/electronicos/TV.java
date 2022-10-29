package catalogo.electronicos;

import catalogo.Producto;

/**
 * Clase que representa a un producto TV (implementa a la interfaz
 * producto).
 */
public class TV implements Producto {

    private double descuento=0;

    /**
     * regresa el nombre del producto.
     * 
     * @return nombre del producto.
     */
    @Override
    public String nombre() {
        return "Televisión de 50 pulgadas";
    }

    /**
     * regresa el precio del producto.
     * 
     * @return precio del producto.
     */
    @Override
    public double precio() {
        return 6599.99;
    }

    /**
     * regresa el departamento al que pertenece el producto.
     * 
     * @return departamento del producto.
     */
    @Override
    public String departamento() {
        return "Electrónicos";
    }

    /**
     * regresa el código de barras del producto.
     * 
     * @return codigo de barras del producto.
     */
    @Override
    public String codigoBarras() {
        return "300";
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
