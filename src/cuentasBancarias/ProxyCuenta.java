package cuentasBancarias;

public class ProxyCuenta implements Icuenta{
    private Cuenta actual;

    public void ingresar(int numCuenta, int nip){
        if(this.actual.logIn(numCuenta,nip)){
            System.out.println(this.actual.getClienteAsociado().getNombreDeUsuario()+"");
        }
    }

    public void comprar(int factura, int noCuenta, int nip){
        actual.comprar(factura, noCuenta, nip);
    }

    @Override
    public void consultarFondos(){
        this.actual.consultarFondos();
    }
}
