package cuentasBancarias;

import cliente.Cliente;

/**
 * Clase que representa a una cuenta bancaria de un cliente asociado a CheemSmart
 */
public class Cuenta implements Icuenta{

    private double fondos;
    private int noCuenta;
    private int nip;
    private Cliente clienteAsociado;

    /**
     * Constructor de la cuenta de bancaria de los clientes, guardando su información
     * @param fondos
     * @param noCuenta
     * @param nip
     * @param clienteAsociado
     */
    public Cuenta(double fondos,int noCuenta, int  nip, Cliente clienteAsociado){
        this.fondos = fondos;
        this.noCuenta = noCuenta;
        this.nip = nip;
        this.clienteAsociado = clienteAsociado;
    }

    /**
     * método que resta los fondos de la cuenta tras realizar una compra.
     */
    @Override
    public void comprar(int factura, int noCuenta, int nip) {
        if (logIn(noCuenta, nip)) {
            fondos = fondos - factura;
            consultarFondos();   
        } else {
            System.out.println("El numero de cuenta o el nip, son incorrectos.");
        }
    }

    /**
     * Devuelve los fondos de la cuenta bancaria.
     */
    @Override
    public void consultarFondos(){
        System.out.println("Saldo de la cuenta: " + fondos);
    }

    /**
     * Metodo que verifica las credenciales de la cuenta bancaria del usuario.
     * @param noCuenta 
     * @param nip
     * @return true en caso de que conincidan, false en otro caso.
     */
    public boolean logIn(int noCuenta, int nip){
        if (noCuenta == this.noCuenta && nip == this.nip) {
            return true;
        }
        return false;
    }

    /**
     * devuelve el Cliente al que está asociado esta cuenta bancaria.
     * @return
     */
    public Cliente getClienteAsociado(){
        return this.clienteAsociado;
    }
}
