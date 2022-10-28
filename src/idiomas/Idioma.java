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
    public void descuentoPropaganda(boolean existePropaganda);

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
     * @return nombre de la reguión
     */
    public String getRegion();

    /**
     * Asigna la probabilidad reduciendo/aumentando la probabilidad entre 
     * departamentos de adquirir un desciento dependiendo la región,
     */
    public void asignaProbabilidadesDescuentos();

    /**
     * Devuelve las probabilidades de que el departamento consiga descuento o no
     * @return lista de departamentos, cada una representa un elemento en el espacio 
     * muestral de obtener probabilidad mayor o menor.
     */
    LinkedList<Departamento> getProbabilidades();
}
