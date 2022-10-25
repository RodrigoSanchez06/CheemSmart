package idiomas;

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
    public void descuentoPropaganda();

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
}
