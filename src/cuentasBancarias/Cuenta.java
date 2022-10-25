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

    public Cuenta(double fondos,int noCuenta, int  nip, Cliente clienteAsociado){
        this.fondos = fondos;
        this.noCuenta = noCuenta;
        this.nip = nip;
        this.clienteAsociado = clienteAsociado;
    }

    @Override
    public void comprar(int factura, int noCuenta, int nip) {
        if (logIn(noCuenta, nip)) {
            fondos = fondos - factura;
            consultarFondos();   
        } else {
            System.out.println("El numero de cuenta o el nip, son incorrectos.");
        }
    }

    @Override
    public void consultarFondos(){
        System.out.println("Saldo de la cuenta: " + fondos);
    }

    public boolean logIn(int noCuenta, int nip){
        if (noCuenta == this.noCuenta && nip == this.nip) {
            return true;
        }
        return false;
    }

    public Cliente getClienteAsociado(){
        return this.clienteAsociado;
    }
}
