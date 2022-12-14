package cuentasBancarias;

import cliente.Cliente;
import idiomas.Idioma;

/**
 * Clase que representa a una cuenta bancaria de un cliente asociado a
 * CheemSmart
 */
public class Cuenta implements Icuenta {

    private double fondos;
    private int noCuenta;
    private int nip;
    private Cliente clienteAsociado;

    /**
     * Constructor de la cuenta de bancaria de los clientes, guardando su
     * información
     * 
     * @param fondos
     * @param noCuenta
     * @param nip
     * @param clienteAsociado
     */
    public Cuenta(double fondos, int noCuenta, int nip, Cliente clienteAsociado) {
        this.fondos = fondos;
        this.noCuenta = noCuenta;
        this.nip = nip;
        this.clienteAsociado = clienteAsociado;
    }

    /**
     * método que resta los fondos de la cuenta tras realizar una compra.
     */
    @Override
    public void comprar(Double factura, int noCuenta, int nip, Idioma idioma) {
        if (ingresar(noCuenta, nip)) {
            if (fondos < factura) {
                System.out.println(idioma.fondosInsuficientes());
                return;
            }
            Double antesCompra = consultarFondos();
            fondos = fondos - factura;
            System.out.println(idioma.saldoFinal(antesCompra, fondos));
            idioma.compraCompletada();
        } else {
            idioma.datosIncorrectos();
        }
    }

    /**
     * Devuelve los fondos de la cuenta bancaria.
     */
    @Override
    public double consultarFondos() {
        return this.fondos;
    }

    /**
     * Metodo que verifica las credenciales de la cuenta bancaria del usuario.
     * 
     * @param noCuenta
     * @param nip
     * @return true en caso de que conincidan, false en otro caso.
     */
    public boolean ingresar(int noCuenta, int nip) {
        if (noCuenta == this.noCuenta && nip == this.nip) {
            return true;
        }
        return false;
    }

    /**
     * devuelve el Cliente al que está asociado esta cuenta bancaria.
     * 
     * @return
     */
    public Cliente getClienteAsociado() {
        return this.clienteAsociado;
    }

    /**
     * Método consultor del numero de cuenta
     * 
     * @return Un int que representa el numero de cuenta
     */
    public int obtenerNoCuenta() {
        return this.noCuenta;
    }

    /**
     * Método consultor del nip de una cuenta
     * 
     * @return Devuelve un int que representa el nip de una cuenta
     */
    public int obtenerNip() {
        return this.nip;
    }
}
