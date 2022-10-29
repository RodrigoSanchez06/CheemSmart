package cuentasBancarias;

import cliente.Cliente;
import idiomas.Idioma;

/**
 * Clase que representa a un Proxy de la cuenta bancaria del usuario.
 */
public class ProxyCuenta implements Icuenta {

    private Cuenta actual;

    public ProxyCuenta(double fondos, int noCuenta, int nip, Cliente clienteAsociado) {
        this.actual = new Cuenta(fondos, noCuenta, nip, clienteAsociado);
    }

    @Override
    public boolean ingresar(int numCuenta, int nip) {
        if (this.actual.ingresar(numCuenta, nip)) {
            System.out.println(this.actual.getClienteAsociado().getNombreDeUsuario() + "");
            return true;
        }
        return false;
    }

    /**
     * método que resta los fondos de la cuenta tras realizar una compra.
     */
    @Override
    public void comprar(Double factura, int noCuenta, int nip, Idioma idioma) {
        actual.comprar(factura, noCuenta, nip, idioma);
    }

    /**
     * Devuelve los fondos de la cuenta bancaria.
     */
    @Override
    public double consultarFondos() {
        return this.actual.consultarFondos();
    }

    /**
     * Método consultor del numero de cuenta
     * 
     * @return Un int que representa el numero de cuenta
     */
    @Override
    public int obtenerNoCuenta() {
        return this.actual.obtenerNoCuenta();
    }

    /**
     * Método consultor del nip de una cuenta
     * 
     * @return Devuelve un int que representa el nip de una cuenta
     */
    @Override
    public int obtenerNip() {
        return this.actual.obtenerNip();
    }
}
