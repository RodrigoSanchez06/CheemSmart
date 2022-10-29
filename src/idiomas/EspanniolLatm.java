package idiomas;

import java.util.LinkedList;
import catalogo.Departamento;
import catalogo.alimentos.Alimentos;
import catalogo.electrodomesticos.Electrodomesticos;
import catalogo.electronicos.Electronicos;
import java.util.Random;

/**
 * Clase que Representa al idioma español (LATAM) del sistema CheemSmart.
 */
public class EspanniolLatm implements Idioma {

    private LinkedList<Departamento> probabilidadesDepartamentos = new LinkedList<>();

    public EspanniolLatm() {
        asignaProbabilidadesDescuentos();
    }

    /**
     * Saluda al usuario en el idioma actual.
     */
    @Override
    public void saludo() {
        System.out.println("Bienvenido a la tienda de CheemSmart.");
    }

    /**
     * Despide al usuario en el idioma actual.
     */
    @Override
    public void despedida() {
        System.out.println("Hasta pronto, gracias por visitar CheemSmart.");
    }

    /**
     * Da a conocer los descuentos disponibles en la región
     * en el idioma actual.
     */
    @Override
    public void descuentoPropaganda(Departamento departamentoDescuento, Double porcentajeDescuento) {
        System.out.println("Estas son las ofertas que tenemos para ti: ");
        System.out.println(porcentajeDescuento + "% " + "Descuento en el departamento de: "
                + departamentoDescuento.obtenerDepartamento());
    }

    /**
     * Da a conocer las opciones disponibles en el idioma actual.
     */
    @Override
    public void opciones() {
        System.out.println("Seleccione alguna de las siguientes opciones: "
                + "\n 1. Ver catálogo."
                + "\n 2. Realizar Una Compra."
                + "\n 3. Salir.");
    }

    /**
     * Hace saber al cliente que su compra fue completada con éxito.
     */
    @Override
    public void compraCompletada() {
        System.out.println("Muchas gracias por su compra");
    }

    /**
     * Hace saber al usuario que sus datos bancarios son incorrectos.
     */
    @Override
    public void datosIncorrectos() {
        System.out.println("Lo sentimos, el numero de cuenta o el pin es incorrecto");

    }

    /**
     * Hace saber al usuario que la opción que introdujo fue incorrecta.
     */
    @Override
    public void opcionIncorrecta() {
        System.out.println("Opcion inválida intente de nuevo por favor.");
    }

    /**
     * Hace saber al usuario que la opción no existe.
     */
    @Override
    public void opcionInexistente() {
        System.out.println("Lo siento esta opción no existe.");
    }

    /**
     * Obtiene el nombre de la región.
     * 
     * @return nombre de la reguión
     */
    @Override
    public String getRegion() {
        return "LATAM";
    }

    /**
     * Asigna la probabilidad reduciendo/aumentando la probabilidad entre
     * departamentos de adquirir un desciento dependiendo la región,
     */
    @Override
    public Departamento asignaProbabilidadesDescuentos() {
        Random azar = new Random();
        probabilidadesDepartamentos.add(new Alimentos());
        probabilidadesDepartamentos.add(new Alimentos());
        probabilidadesDepartamentos.add(new Electronicos());
        probabilidadesDepartamentos.add(new Electrodomesticos());
        Departamento d = probabilidadesDepartamentos.get(azar.nextInt(probabilidadesDepartamentos.size()));
        d.aplicarDescuentoDepartamento((((double) azar.nextInt(3)) + 1) / 10);
        return d;
    }

    /**
     * Devuelve las probabilidades de que el departamento consiga descuento o no
     * 
     * @return lista de departamentos, cada una representa un elemento en el espacio
     *         muestral de obtener probabilidad mayor o menor.
     */
    public LinkedList<Departamento> getProbabilidades() {
        return this.probabilidadesDepartamentos;
    }

    /**
     * Avisa al usuario para que introduzca un número de barras
     * 
     * @return aviso a usuario de introducir código de barras
     */
    @Override
    public String introduceNumBarras() {
        return "Introduce el código de barras del producto que deseas.";
    }

    /**
     * Avisa al usuario que el producto ha sido añadido con exito.
     * 
     * @return aviso al usuario que el producto se añadió con éxito.
     */
    @Override
    public String productoAnniadido() {
        return "El producto ha sido añadido con éxito.";
    }

    /**
     * Hace saber al usuario que su ticket se está imprimiendo
     * 
     * @return aviso de impresión de ticket
     */
    @Override
    public String imprimiendoTicket() {
        return "Imprimiendo Ticket...\n"
                + "********** CheemSmart *********";
    }

    /**
     * Avisa al usuario que el código de barras que introdujo es incorrecto.
     * 
     * @return aviso codigo de barras incorrecto.
     */
    @Override
    public String codigoBarrasIncorrecto() {
        return "El código de barras que introduciste es incorrecto. Intentalo de nuevo.";
    }

    /**
     * Hace saber al usuario cuando será su entregra programada.
     * 
     * @return cuando será su entrega programada.
     */
    @Override
    public String entregaProgramada() {
        return "Su entrega estará llegando el 20/nov/2022";
    }

    /**
     * Hace saber al usuario las opciones de compra.
     * 
     * @return opciones de compra
     */
    @Override
    public String opcionesEnCompra() {
        return "1. - introducir otro producto.\n"
                + "2. - Terminar Compra\n"
                + "3. - Cancelar Compra.";
    }

    /**
     * Hace saber al usuario que debe introducir su nip
     * 
     * @return aviso introducir no de cuenta.
     */
    @Override
    public String introduceNip() {
        return "Introduce tu nip por favor.";
    }

    /**
     * Hace saber al usuario que introduzca su num de cuenta
     * 
     * @return aviso de introducir no de Cuenta
     */
    @Override
    public String introduceNoCuenta() {
        return "Introduce tu numero de cuenta";
    }

    /**
     * Avisa al usuario que sus fondos son insuficientes.
     * 
     * @return aviso de fondos insuficientes
     */
    public String fondosInsuficientes() {
        return "Error en compra, Fondos insuficientes.";
    }

    /**
     * Imprime el estado de cuenta del usuario
     * 
     * @param antesCompra   fondos antes de la compra
     * @param despuesCompra fondos despues de la compra
     * @return estado de cuenta
     */
    public String saldoFinal(double antesCompra, double despuesCompra) {
        return "Saldo inicial: " + antesCompra + "\n Saldo final: " + despuesCompra;
    }

}
