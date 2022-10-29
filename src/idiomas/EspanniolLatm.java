package idiomas;

import java.util.LinkedList;
import java.util.Iterator;
import catalogo.Departamento;
import cliente.ICatalogo;

/**
 * Clase que Representa al idioma español (LATAM) del sistema CheemSmart.
 */
public class EspanniolLatm implements Idioma{

    private LinkedList<Departamento> probabilidadesDepartamentos = new LinkedList<>();

    public EspanniolLatm(ICatalogo c){
        asignaProbabilidadesDescuentos(c);
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
    public void asignaProbabilidadesDescuentos(ICatalogo c) {
        Iterator<Departamento> i = c.iteradorDepartamentos();
        while(i.hasNext()){
            Departamento d = i.next();
            probabilidadesDepartamentos.add(d);
            if(d.obtenerDepartamento().equals("Alimentos"));
                probabilidadesDepartamentos.add(d);
        }
    }

    /**
     * Devuelve las probabilidades de que el departamento consiga descuento o no
     * @return lista de departamentos, cada una representa un elemento en el espacio 
     * muestral de obtener probabilidad mayor o menor.
     */
    public LinkedList<Departamento> getProbabilidades(){
        return this.probabilidadesDepartamentos;
    }

   
}
