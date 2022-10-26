package idiomas;

/**
 * Clase que Representa al idioma español (España) del sistema CheemSmart.
 */
public class EspanniolEsp implements Idioma{

    /**
     * Saluda al usuario en el idioma actual.
     */
    @Override
    public void saludo() {
        System.out.println("Muy buenas chaval bienvenido a CheemsEsmart.");
    }

    /**
     * Despide al usuario en el idioma actual.
     */
    @Override
    public void despedida() {
        System.out.println("Hasta pronto tío, vuelve pronto.");
    }

    /**
     * Da a conocer los descuentos disponibles en la región
     * en el idioma actual.
     */
    @Override
    public void descuentoPropaganda() {
        System.out.println("Ostia, aqui te presentamos las ofertas de hoy.");
    }

    /**
     * Da a conocer las opciones disponibles en el idioma actual.
     */
    @Override
    public void opciones() {
        System.out.println("Seleccione alguna de las siguientes opciones."
                + "\n 1. Ver catálogo."
                + "\n 2. Hacer la compra."
                + "\n 3. Salir.");
    }

    /**
     * Hace saber al cliente que su compra fue completada con éxito.
     */
    @Override
    public void compraCompletada() {
        System.out.println("Su compra ha sido completadada con éxito"+
        " en un momento le imprimermos su recibo.");
    }

    /**
     * Hace saber al usuario que sus datos bancarios son incorrectos.
     */
    @Override
    public void datosIncorrectos() {
        System.out.println("Ostia!! al parecer los datos bancarios son incorrectos.");
    }

    /**
     * Hace saber al usuario que la opción que introdujo fue incorrecta.
     */
    @Override
    public void opcionIncorrecta() {
        System.out.println("Vaya, te has equivocado de opción tío :(.");      
    }
 

}
