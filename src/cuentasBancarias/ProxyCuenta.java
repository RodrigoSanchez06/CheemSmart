package cuentasBancarias;

import cliente.Cliente;
import idiomas.Idioma;

/**
 * Clase que representa a un Proxy de la cuenta bancaria del usuario.
 */
public class ProxyCuenta implements Icuenta {

    private Cuenta actual;

    /**
     * Constructor parametrizado de un proxy de una cuenta bancaria
     * @param fondos Fondos iniciales de la cuenta
     * @param noCuenta Numero de cuenta 
     * @param nip Nip de la cuenta
     * @param clienteAsociado Cliente propetario de la compu
     */
    public ProxyCuenta(double fondos, int noCuenta, int nip, Cliente clienteAsociado) {
        this.actual = new Cuenta(fondos, noCuenta, nip, clienteAsociado);
    }

    /**
     * Método que valida el numero de cuenta y nip del propietario de la cuenta
     * @param noCuenta Numero de cuenta
     * @param nip Nip de la cuenta
     * @return Devuelve true de concordar los datos o false de lo contrario
     */
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

    @Override
    public int obtenerNoCuenta() {
        return this.actual.obtenerNoCuenta();
    }

    @Override
    public int obtenerNip() {
        return this.actual.obtenerNip();
    }
}
