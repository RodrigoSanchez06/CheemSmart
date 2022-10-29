package idiomas;

import java.util.LinkedList;
import java.util.Random;

import catalogo.Departamento;
import catalogo.alimentos.Alimentos;
import catalogo.electrodomesticos.Electrodomesticos;
import catalogo.electronicos.Electronicos;

/**
 * Clase que Representa al idioma Inglés del sistema CheemSmart.
 */
public class Ingles implements Idioma {

    private LinkedList<Departamento> probabilidadesDepartamentos = new LinkedList<>();

    public Ingles() {
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
    public void descuentoPropaganda(Departamento departamentoDescuento, Double porcentajeDescuento) {
        System.out.println("today's deals");
        System.out.println(porcentajeDescuento + "%" + "discount on "
                + departamentoDescuento.obtenerDepartamento());
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
     * 
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
    public Departamento asignaProbabilidadesDescuentos() {
        Random azar = new Random();
        probabilidadesDepartamentos.add(new Alimentos());
        probabilidadesDepartamentos.add(new Electronicos());
        probabilidadesDepartamentos.add(new Electronicos());
        probabilidadesDepartamentos.add(new Electrodomesticos());
        Departamento d = probabilidadesDepartamentos.get(azar.nextInt(probabilidadesDepartamentos.size()));
        d.aplicarDescuentoDepartamento(((double) azar.nextInt(3) + 1) / 10);
        return d;
    }

    /**
     * Devuelve las probabilidades de que el departamento consiga descuento o no
     * 
     * @return lista de departamentos, cada una representa un elemento en el espacio
     *         muestral de obtener probabilidad mayor o menor.
     */
    @Override
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
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Avisa al usuario que el producto ha sido añadido con exito.
     * 
     * @return aviso al usuario que el producto se añadió con éxito.
     */
    @Override
    public String productoAnniadido() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Avisa al usuario que el código de barras que introdujo es incorrecto.
     * 
     * @return aviso codigo de barras incorrecto.
     */
    @Override
    public String codigoBarrasIncorrecto() {
        // TODO Auto-generated method stub
        return null;
    }
}
