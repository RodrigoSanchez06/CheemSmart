package idiomas;

/**
 * Clase que Representa al idioma español (LATAM) del sistema CheemSmart.
 */
public class EspanniolLatm implements Idioma{

    /**
     * Saluda al usuario en el idioma actual.
     */
    @Override
    public void saludo(){
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
    public void descuentoPropaganda() {
        System.out.println("estas son las ofertas del día de hoy: ");
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
        System.out.println("Muchas gracias por su compra en un momento se imprimirá su ticket");
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
}
