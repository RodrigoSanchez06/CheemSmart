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
        System.out.println("See you later!!! :)");
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
        System.out.println("Choose one of the following options: "
        + "\n 1. Read catalogue"
        + "\n 2. Purchase"
        + "\n 3. Exit");
    }

    /**
     * Hace saber al cliente que su compra fue completada con éxito.
     */
    @Override
    public void compraCompletada() {
        System.out.println("Thank you so much, your ticket will be printed soon");
    }

    /**
     * Hace saber al usuario que sus datos bancarios son incorrectos.
     */
    @Override
    public void datosIncorrectos() {
        System.out.println("Sorry but your account number or pin doesn't match");
    }

    /**
     * Hace saber al usuario que la opción que introdujo fue incorrecta.
     */
    @Override
    public void opcionIncorrecta() {
        System.out.println("Incorrect option, try again!");
    }
}
