package catalogo.electrodomesticos;

import catalogo.Producto;

/**
 * Clase que representa a un producto Microondas (implementa a la interfaz
 * producto).
 */
public class Microondas implements Producto {

    private double descuento=1;

    /**
     * regresa el nombre del producto.
     * 
     * @return nombre del producto.
     */
    @Override
    public String nombre() {
        return "Microondas";
    }

    /**
     * regresa el precio del producto.
     * 
     * @return precio del producto.
     */
    @Override
    public double precio() {
        return (2570.99*this.descuento);
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
    public String codigoBarras() {
        return "030";
    }

    /**
     * Aplica el descuento al producto.
     * @param d porcentaje de descuento
     */
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
