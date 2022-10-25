package cuentasBancarias;


public interface Icuenta{
    public void comprar(int factura, int noCuenta, int nip);
    public void consultarFondos();
}