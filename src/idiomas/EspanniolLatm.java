package idiomas;

import java.util.LinkedList;

import catalogo.Departamento;
import catalogo.alimentos.Alimentos;
import catalogo.electrodomesticos.Electrodomesticos;
import catalogo.electronicos.Electronicos;

/**
 * Clase que Representa al idioma español (LATAM) del sistema CheemSmart.
 */
public class EspanniolLatm implements Idioma{

    private LinkedList<Departamento> probabilidadesDepartamentos = new LinkedList<>();

    public EspanniolLatm(){
        asignaProbabilidadesDescuentos();
    }

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
    public void descuentoPropaganda(boolean existePropaganda) {
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

     /**
     * Hace saber al usuario que la opción no existe.
     */
    @Override
    public void opcionInexistente() {
        System.out.println("Lo siento esta opción no existe.");
    }

    /**
     * Obtiene el nombre de la región.
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
    public void asignaProbabilidadesDescuentos() {
        probabilidadesDepartamentos.add(new Electrodomesticos());
        probabilidadesDepartamentos.add(new Alimentos());
        probabilidadesDepartamentos.add(new Alimentos());
        probabilidadesDepartamentos.add(new Electronicos());
    }

    public LinkedList<Departamento> getProbabilidades(){
        return this.probabilidadesDepartamentos;
    }

   
}
