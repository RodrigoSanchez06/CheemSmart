package cuentasBancarias;

import idiomas.Idioma;

/**
 * Interfaz que define el comportamiento de una Cuenta bancaria de CheemSmart
 */
public interface Icuenta {

    /**
     * Método que valida el numero de cuenta y nip del propietario de la cuenta
     * @param noCuenta Numero de cuenta
     * @param nip Nip de la cuenta
     * @return Devuelve true de concordar los datos o false de lo contrario
     */
    boolean ingresar(int noCuenta, int nip);

    /**
     * método que resta los fondos de la cuenta tras realizar una compra.
     */
    void comprar(Double factura, int noCuenta, int nip, Idioma idioma);

    /**
     * Devuelve los fondos de la cuenta bancaria.
     */
    double consultarFondos();

    /**
     * Método consultor del numero de cuenta
     * 
     * @return Un int que representa el numero de cuenta
     */
    int obtenerNoCuenta();

    /**
     * Método consultor del nip de una cuenta
     * 
     * @return Devuelve un int que representa el nip de una cuenta
     */
    int obtenerNip();
}