package idiomas;

import java.util.LinkedList;
import java.util.Random;

import catalogo.alimentos.Alimentos;
import catalogo.electrodomesticos.Electrodomesticos;
import catalogo.electronicos.Electronicos;
import catalogo.Departamento;

/**
 * Clase que Representa al idioma español (España) del sistema CheemSmart.
 */
public class EspanniolEsp implements Idioma {

    private LinkedList<Departamento> probabilidadesDepartamentos = new LinkedList<>();

    public EspanniolEsp() {
        asignaProbabilidadesDescuentos();
    }

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
    public void descuentoPropaganda(Departamento departamentoDescuento, Double porcentajeDescuento) {
        System.out.println("Felicidades tio estas son las gangas de hoy: ");
        System.out.println(porcentajeDescuento + "%" + "Descuento en el departamento de: "
                + departamentoDescuento.obtenerDepartamento());
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
        System.out.println("Su compra ha sido completadada con éxito" +
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

    /**
     * Hace saber al usuario que la opción no existe.
     */
    @Override
    public void opcionInexistente() {
        System.out.println("Madre mia wilirex esa opción es inexistente.");
    }

    /**
     * Obtiene el nombre de la región.
     * 
     * @return nombre de la reguión
     */
    @Override
    public String getRegion() {
        return "ESP";
    }

    /**
     * Asigna la probabilidad reduciendo/aumentando la probabilidad entre
     * departamentos de adquirir un desciento dependiendo la región,
     */
    @Override
    public Departamento asignaProbabilidadesDescuentos() {
        Random azar = new Random();
        probabilidadesDepartamentos.add(new Alimentos());
        probabilidadesDepartamentos.add(new Electrodomesticos());
        probabilidadesDepartamentos.add(new Electronicos());
        probabilidadesDepartamentos.add(new Electrodomesticos());
        Departamento d = probabilidadesDepartamentos.get(azar.nextInt(probabilidadesDepartamentos.size()));
        d.aplicarDescuentoDepartamento((azar.nextInt(2) + 1) / 10);
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
        return "digita el codigo de barras chaval.";
    }

    /**
     * Avisa al usuario que el producto ha sido añadido con exito.
     * 
     * @return aviso al usuario que el producto se añadió con éxito.
     */
    @Override
    public String productoAnniadido() {
        return "El producto ha sido añadido al carrito de la compra";
    }

    /**
     * Avisa al usuario que el código de barras que introdujo es incorrecto.
     * 
     * @return aviso codigo de barras incorrecto.
     */
    @Override
    public String codigoBarrasIncorrecto() {
        return "Ostia no he visto ese codigo de barras en mi vida, intentalo de nuevo!!!";
    }
}
