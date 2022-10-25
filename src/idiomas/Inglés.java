package idiomas;

/**
 * Clase que Representa al idioma Inglés del sistema CheemSmart.
 */
public class Inglés implements Idioma{

    /**
     * Saluda al usuario en el idioma actual.
     */
    @Override
    public void saludo() {
        System.out.println("Welcome to CheemSmart!!!.");
    }

    /**
     * Despide al usuario en el idioma actual.
     */
    @Override
    public void despedida() {
        System.out.println("");
    }

    /**
     * Da a conocer los descuentos disponibles en la región
     * en el idioma actual.
     */
    @Override
    public void descuentoPropaganda() {
        System.out.println("");
    }

    /**
     * Da a conocer las opciones disponibles en el idioma actual.
     */
    @Override
    public void opciones() {
        System.out.println("");
    }

    /**
     * Hace saber al cliente que su compra fue completada con éxito.
     */
    @Override
    public void compraCompletada() {
        System.out.println("");
    }

    /**
     * Hace saber al usuario que sus datos bancarios son incorrectos.
     */
    @Override
    public void datosIncorrectos() {
        System.out.println("");
    }

    /**
     * Hace saber al usuario que la opción que introdujo fue incorrecta.
     */
    @Override
    public void opcionIncorrecta() {
        System.out.println("");
    }
}
