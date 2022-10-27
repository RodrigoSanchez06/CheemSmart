package catalogo.electronicos;

import catalogo.Producto;

/**
 * Clase que representa a un producto Laptop Gamer Pro (implementa a la interfaz
 * producto).
 */
public class LaptopGamerPro implements Producto {

    private double descuento=0;

    /**
     * regresa el nombre del producto.
     * 
     * @return nombre del producto.
     */
    @Override
    public String nombre() {
        return "Laptop Gamer Pro.";
    }

    /**
     * regresa el precio del producto.
     * 
     * @return precio del producto.
     */
    @Override
    public double precio() {
        return 18700.99;
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
        return "200";
    }

    public void aplicarDescuento(double d){
        if(d < 0 || d >= 1)
            throw new IllegalArgumentException();
        this.descuento = (1-d);
    }

    public double getMultiplicadorDescuento(){
        return this.descuento;
    }

}