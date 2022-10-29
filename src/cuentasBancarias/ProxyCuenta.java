package cuentasBancarias;

/**
 * Clase que representa a un Proxy de la cuenta bancaria del usuario.
 */
public class ProxyCuenta implements Icuenta {

    private Cuenta actual;

    public ProxyCuenta(Cuenta c) {
        if (c == null)
            throw new NullPointerException();
        this.actual = c;
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
    public void comprar(int factura, int noCuenta, int nip) {
        actual.comprar(factura, noCuenta, nip);
    }

    /**
     * Devuelve los fondos de la cuenta bancaria.
     */
    @Override
    public void consultarFondos() {
        this.actual.consultarFondos();
    }
}
