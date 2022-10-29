package cuentasBancarias;

/**
 * Interfaz que define  el comportamiento de una Cuenta bancaria de CheemSmart
 */
public interface Icuenta{

    boolean ingresar(int noCuenta, int nip);

    /**
     * método que resta los fondos de la cuenta tras realizar una compra.
     */
    void comprar(int factura, int noCuenta, int nip);

    /**
     * Devuelve los fondos de la cuenta bancaria.
     */
    void consultarFondos();

    /**
     * Método consultor del numero de cuenta
     * @return Un int que representa el numero de cuenta
     */
    int obtenerNoCuenta();

    /**
     * Método consultor del nip de una cuenta
     * @return Devuelve un int que representa el nip de una cuenta
     */
    int obtenerNip();
}