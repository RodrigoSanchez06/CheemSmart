package cuentasBancarias;

/**
 * Interfaz que define  el comportamiento de una Cuenta bancaria de CheemSmart
 */
public interface Icuenta{

   /**
     * método que resta los fondos de la cuenta tras realizar una compra.
     */ 
    public void comprar(int factura, int noCuenta, int nip);

    /**
     * Devuelve los fondos de la cuenta bancaria.
     */
    public void consultarFondos();
}