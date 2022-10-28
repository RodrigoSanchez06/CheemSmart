import java.util.LinkedList;

import catalogo.Producto;
import cliente.Cliente;
import cuentasBancarias.Cuenta;
import idiomas.EspanniolEsp;
import idiomas.EspanniolLatm;
import idiomas.Idioma;
import idiomas.Ingles;

/**
 * Clase que representa a la tienda CheemSmart y todas sus operaciones que se pueden hacer
 * dentro de la tienda.
 */
public class Tienda {

    private  Idioma idioma;
    LinkedList<Cliente> listaClientes = agregaClientes();
    LinkedList<Producto> carritoDeCompra = new LinkedList<>();

    /**
     * Cambia el idioma para el usuario
     * @param idiomaActual idioma al que se quiere cambiar.
     */
    public  void cambioIdioma(Idioma idiomaActual){
        idioma = idiomaActual;
    }

    /** 
     * Se realiza una compra en el sistema.
    */
    public void hacerCompra(){
        //Aqui se empiezan a mostrar los productos
        boolean compraFinalizada = false;
        boolean salir = false;
        
        while (!compraFinalizada || !salir) {
            
        }
    }

    /**
     * Imprime el ticket de la compra del cliente.
     */
    private void imprimeTicket(){
        System.out.println("Imprimiendo Ticket...\n"
            + "********** CheemSmart *********");
        for (Producto p : carritoDeCompra) {
            //OJO AQUI FALTA
        }
        System.out.println("TOTAL: " );
        System.out.println("******************************");
        
        System.out.println("Su entrega está programada para el día: 12/nov/2022");
    }


    /**
     * Crea una cuenta bancaría que se asociará a un cliente en particular.
     * @param fondos fonddos de la cuenta bancaría.
     * @param nip nip de la cuenta bancaria.
     * @param clienteAsociado Cliente al que s e la asocia esta cuenta.
     * @param numCuenta numero de cuenta único de la cuenta.
     * @return Cuenta asociada al cliente.
     */
    private  Cuenta crearAsociarCuenta(double fondos, int nip, Cliente clienteAsociado, int numCuenta){
        return new Cuenta(fondos, numCuenta, nip, clienteAsociado);    
    }

    /**
     * Agrega clientes por "default" y los añade a una lista de clientes
     * @return lista de clientes registrados
     */
    private  LinkedList<Cliente> agregaClientes(){
        LinkedList<Cliente> listaClientes = new LinkedList<Cliente>();  
        EspanniolLatm latm = new EspanniolLatm();
        EspanniolEsp esp = new EspanniolEsp();
        Ingles ing = new Ingles();
        int id = 0;

        Cliente clienteUno = new Cliente("JuanitoPro777", "juan1234", "Juan Perez",
            552509051, "Nativitas CDMX", null,latm , id);
        clienteUno.setCuentaAsociada(crearAsociarCuenta(20000, 1234, clienteUno, 22060325));

        Cliente clienteDos = new Cliente("Maria1721", "mar1a_12", "María Fernanda",
             23123625, "Barcelona España", null, esp, ++id);
        clienteDos.setCuentaAsociada(crearAsociarCuenta(12500, 1721, clienteDos, 17118123));

        Cliente clienteTres = new Cliente("Fred12", "fr3di_21", "Frederick Town",
            7853255, "Texas 5th AV.", null, ing, ++id);
        clienteDos.setCuentaAsociada(crearAsociarCuenta(125, 0001, clienteTres, 31922257));
        listaClientes.add(clienteUno);
        listaClientes.add(clienteDos);
        listaClientes.add(clienteTres);

        return listaClientes;
    }

    /**
     * Devuelve la lista de clientes de la tienda CheemSmart.
     * @return lista de clientes
     */
    public LinkedList<Cliente> getListaClientes(){
        return this.listaClientes;
    }

    /**
     * Devuelve el idioma actual con el cual se está atendiendo.
     * @return idiom con el que se está atendiendo.
     */
    public Idioma getIdioma(){
        return this.idioma;
    }

}
