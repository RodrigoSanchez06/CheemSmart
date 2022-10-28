package idiomas;

import catalogo.electronicos.Electronicos;
import catalogo.electrodomesticos.Electrodomesticos;
import catalogo.alimentos.Alimentos;
import java.util.LinkedList;
import catalogo.Departamento;

/**
 * Clase que Representa al idioma Inglés del sistema CheemSmart.
 */
public class Ingles implements Idioma{

    private LinkedList<Departamento> probabilidadesDepartamentos = new LinkedList<>();

    public Ingles(){
        asignaProbabilidadesDescuentos();
    }

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
    public void descuentoPropaganda(boolean existePropaganda) {
        System.out.println("today's deals");
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

        
    /**
     * Hace saber al usuario que la opción no existe.
     */
    @Override
    public void opcionInexistente() {
        System.out.println("Sorry, this option does not exist");
    }

    /**
     * Obtiene el nombre de la región.
     * @return nombre de la reguión
     */
    @Override
    public String getRegion() {
        return "EUA";
    }

    /**
     * Asigna la probabilidad reduciendo/aumentando la probabilidad entre 
     * departamentos de adquirir un desciento dependiendo la región,
     */
    @Override
    public void asignaProbabilidadesDescuentos() {
        probabilidadesDepartamentos.add(new Electrodomesticos());
        probabilidadesDepartamentos.add(new Alimentos());
        probabilidadesDepartamentos.add(new Electronicos());
        probabilidadesDepartamentos.add(new Electronicos());
        
    }

    /**
     * Devuelve las probabilidades de que el departamento consiga descuento o no
     * @return lista de departamentos, cada una representa un elemento en el espacio 
     * muestral de obtener probabilidad mayor o menor.
     */
    @Override
    public LinkedList<Departamento> getProbabilidades(){
        return this.probabilidadesDepartamentos;
    }
}
