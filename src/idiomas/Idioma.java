package idiomas;

import java.util.LinkedList;

import catalogo.Departamento;

/**
 * Interfaz idioma, sirve para definir el comportamiento de un idioma
 * del sistema CheemSmart
 */
public interface Idioma {

    /**
     * Saluda al usuario en el idioma actual.
     */
    public void saludo();

    /**
     * Despide al usuario en el idioma actual.
     */
    public void despedida();

    /**
     * Da a conocer los descuentos disponibles en la región
     * en el idioma actual.
     */
    public void descuentoPropaganda(Departamento departamentoDescuento, Double porcentajeDescuento);

    /**
     * Da a conocer las opciones disponibles en el idioma actual.
     */
    public void opciones();

    /**
     * Hace saber al cliente que su compra fue completada con éxito.
     */
    public void compraCompletada();

    /**
     * Hace saber al usuario que sus datos bancarios son incorrectos.
     */
    public void datosIncorrectos();

    /**
     * Hace saber al usuario que la opción que introdujo fue incorrecta.
     */
    public void opcionIncorrecta();

    /**
     * Hace saber al usuario que la opción no existe.
     */
    public void opcionInexistente();

    /**
     * Obtiene el nombre de la región.
     * 
     * @return nombre de la reguión
     */
    public String getRegion();

    /**
     * Avisa al usuario para que introduzca un número de barras
     * 
     * @return aviso a usuario de introducir código de barras
     */
    public String introduceNumBarras();

    /**
     * Avisa al usuario que el producto ha sido añadido con exito.
     * 
     * @return aviso al usuario que el producto se añadió con éxito.
     */
    public String productoAnniadido();

    /**
     * Avisa al usuario que el código de barras que introdujo es incorrecto.
     * 
     * @return aviso codigo de barras incorrecto.
     */
    public String codigoBarrasIncorrecto();

    /**
     * Hace saber al usuario que su ticket se está imprimiendo
     * 
     * @return aviso de impresión de ticket
     */
    public String imprimiendoTicket();

    /**
     * Hace saber al usuario cuando será su entregra programada.
     * 
     * @return cuando será su entrega programada.
     */
    public String entregaProgramada();

    /**
     * Hace saber al usuario las opciones de compra.
     * 
     * @return opciones de compra
     */
    public String opcionesEnCompra();

    /**
     * Hace saber al usuario que debe introducir su nip
     * 
     * @return aviso introducir no de cuenta.
     */
    public String introduceNip();

    /**
     * Hace saber al usuario que introduzca su num de cuenta
     * 
     * @return aviso de introducir no de Cuenta
     */
    public String introduceNoCuenta();

    /**
     * Asigna la probabilidad reduciendo/aumentando la probabilidad entre
     * departamentos de adquirir un desciento dependiendo la región,
     */
    public Departamento asignaProbabilidadesDescuentos();

    /**
     * Devuelve las probabilidades de que el departamento consiga descuento o no
     * 
     * @return lista de departamentos, cada una representa un elemento en el espacio
     *         muestral de obtener probabilidad mayor o menor.
     */
    LinkedList<Departamento> getProbabilidades();

    /**
     * Avisa al usuario que sus fondos son insuficientes.
     * 
     * @return aviso de fondos insuficientes
     */
    public String fondosInsuficientes();

    /**
     * Imprime el estado de cuenta del usuario
     * 
     * @param antesCompra   fondos antes de la compra
     * @param despuesCompra fondos despues de la compra
     * @return estado de cuenta
     */
    public String saldoFinal(double antesCompra, double despuesCompra);
}
