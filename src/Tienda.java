import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import catalogo.Departamento;
import catalogo.Producto;
import cliente.Cliente;
import cliente.ICatalogo;
import cliente.ProxyCatalogo;
import cuentasBancarias.Icuenta;
import cuentasBancarias.ProxyCuenta;
import idiomas.EspanniolEsp;
import idiomas.EspanniolLatm;
import idiomas.Idioma;
import idiomas.Ingles;

/**
 * Clase que representa a la tienda CheemSmart y todas sus operaciones que se
 * pueden hacer
 * dentro de la tienda.
 */
public class Tienda {

    private Idioma idioma;
    private LinkedList<Cliente> listaClientes = agregaClientes();
    private LinkedList<Producto> carritoDeCompra = new LinkedList<>();
    private ICatalogo catalogo = new ProxyCatalogo();
    private Scanner entrada = new Scanner(System.in);
    private Cliente clienteActual;

    /**
     * Cambia el idioma para el usuario
     * 
     * @param idiomaActual idioma al que se quiere cambiar.
     */
    public void cambioIdioma(Idioma idiomaActual) {
        idioma = idiomaActual;
    }

    /**
     * Se realiza una compra en el sistema.
     */
    public void hacerCompra() {
        // Aqui se empiezan a mostrar los productos
        boolean compraFinalizada = false;
        boolean salir = false;
        double total = 0;

        while (!compraFinalizada || !salir) {
            System.out.println(idioma.introduceNumBarras());
            String numeroBarras = entrada.nextLine();
            Iterator<Departamento> itDep = catalogo.iteradorDepartamentos();
            boolean encontrado = false;
            while (itDep.hasNext()) {
                Iterator<Producto> itPro = itDep.next().obtenerIterador();
                while (itPro.hasNext()) {
                    Producto temporal = itPro.next();
                    if (numeroBarras.equals(temporal.codigoBarras())) {
                        carritoDeCompra.add(temporal);
                        total += temporal.precio();
                        encontrado = true;
                    }
                }
            }
            if (encontrado) {
                System.out.println(idioma.productoAnniadido());
            } else {
                System.out.println(idioma.codigoBarrasIncorrecto());
            }
            while (encontrado) {
                try {
                    System.out.println(idioma.opcionesEnCompra());
                    String entradaCompra = entrada.nextLine();
                    int opcionCompra = Integer.parseInt(entradaCompra);
                    if (opcionCompra == 1) {
                        break;
                    } else if (opcionCompra == 2) {
                        imprimeTicket(carritoDeCompra, total);
                        try {
                            idioma.introduceNoCuenta();
                            String entradaNumCuenta = entrada.nextLine();
                            int numeroCuenta = Integer.parseInt(entradaNumCuenta);
                            idioma.introduceNip();
                            String entradaNip = entrada.nextLine();
                            int nip = Integer.parseInt(entradaNip);
                            if (encontrado) {

                            }
                        } catch (NumberFormatException nbe) {
                            System.out.println("Numero de cuenta o nip inválido intentalo de nuevo");
                        }
                        return;
                    } else {
                        return;
                    }
                } catch (NumberFormatException nbe) {
                    idioma.opcionIncorrecta();
                }
            }
        }
    }

    /**
     * Imprime el ticket de la compra del cliente.
     */
    private void imprimeTicket(LinkedList<Producto> carrito, double total) {
        System.out.println(idioma.imprimiendoTicket());
        for (Producto p : carritoDeCompra) {
            System.out.println("---------------------------------------");
            System.out.println(p.nombre() + "\n"
                    + "Precio : " + p.precio() + "\n"
                    + "Codigo de barras: " + p.codigoBarras() + "\n");
            System.out.println("---------------------------------------");
        }
        System.out.println("\nTOTAL: " + total);
        System.out.println("\n******************************");
    }

    /**
     * Crea una cuenta bancaría que se asociará a un cliente en particular.
     * 
     * @param fondos          fonddos de la cuenta bancaría.
     * @param nip             nip de la cuenta bancaria.
     * @param clienteAsociado Cliente al que s e la asocia esta cuenta.
     * @param numCuenta       numero de cuenta único de la cuenta.
     * @return Cuenta asociada al cliente.
     */
    private Icuenta crearAsociarCuenta(double fondos, int nip, Cliente clienteAsociado, int numCuenta) {
        return new ProxyCuenta(fondos, numCuenta, nip, clienteAsociado);
    }

    /**
     * Asigna al cliente actual al que se le esta atendiendo.
     * 
     * @param clienteActual cliente actual con el que se trabajará
     */
    public void asignarClienteActual(Cliente clienteActual) {
        this.clienteActual = clienteActual;
    }

    /**
     * Agrega clientes por "default" y los añade a una lista de clientes
     * 
     * @return lista de clientes registrados
     */
    private LinkedList<Cliente> agregaClientes() {
        LinkedList<Cliente> listaClientes = new LinkedList<Cliente>();
        EspanniolEsp esp = new EspanniolEsp();
        Ingles ing = new Ingles();
        EspanniolLatm latm = new EspanniolLatm();
        int id = 0;

        Cliente clienteUno = new Cliente("0", "0", "Juan Perez",
                552509051, "Nativitas CDMX", null, latm, id);
        clienteUno.setCuentaAsociada(crearAsociarCuenta(20000, 1234, clienteUno, 22060325));

        Cliente clienteDos = new Cliente("Maria1721", "mar1a_12", "María Fernanda",
                23123625, "Barcelona España", null, esp, ++id);
        clienteDos.setCuentaAsociada(crearAsociarCuenta(12500, 1721, clienteDos, 17118123));

        Cliente clienteTres = new Cliente("Fred12", "fr3di_21", "Frederick Town",
                7853255, "Texas 5th AV.", null, ing, ++id);
        clienteDos.setCuentaAsociada(crearAsociarCuenta(125, 2121, clienteTres, 31922257));
        listaClientes.add(clienteUno);
        listaClientes.add(clienteDos);
        listaClientes.add(clienteTres);

        return listaClientes;
    }

    /**
     * Devuelve la lista de clientes de la tienda CheemSmart.
     * 
     * @return lista de clientes
     */
    public LinkedList<Cliente> getListaClientes() {
        return this.listaClientes;
    }

    /**
     * Devuelve el idioma actual con el cual se está atendiendo.
     * 
     * @return idiom con el que se está atendiendo.
     */
    public Idioma getIdioma() {
        return this.idioma;
    }

    /**
     * Regresa el catalogo de la tienda
     * 
     * @return Icatalogo de la tienda
     */
    public ICatalogo getCatalogo() {
        return this.catalogo;
    }

}
