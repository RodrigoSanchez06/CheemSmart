
import java.util.Scanner;

import cliente.Cliente;

public class CheemSmart {

    /**
     * Clase principal de CheemSmart
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Tienda tienda = new Tienda();
        boolean salir = false;

        System.out.println("\n******Bienvenido a CheemSmart******\n");
        int opcionInicial = -1;
        while (!salir) {
            while (true) {
                try {
                    System.out.println("Selecciona alguna de las siguientes opciones.");

                    System.out.println("1. Iniciar Sesión.\n"
                            + "2. Salir del programa.");
                    String entradaInicial = entrada.nextLine();
                    opcionInicial = Integer.parseInt(entradaInicial);
                    if (opcionInicial == 1 || opcionInicial == 2)
                        break;
                    System.out.println("Opción no existente, intenta de nuevo");
                } catch (NumberFormatException nfe) {
                    System.out.println("Entrada inválida, intenta de nuevo");
                }
            }
            if (opcionInicial == 1) {
                System.out.println("Para entrar a la tienda virtual Inicia Sesión.\n");
                boolean credencialesCorrectas = false;
                Cliente clienteActual = new Cliente(); // Creamos el un espacio para el cliente al que estemos
                                                       // atendiendo

                while (!credencialesCorrectas) { // LOGIN (validacion)
                    System.out.println("Introduce tu Nombre de usuario: ");
                    String nombreUsuario = (entrada.nextLine()).trim();
                    System.out.println("Introduce la contraseña: ");
                    String pass = (entrada.nextLine()).trim();

                    for (Cliente c : tienda.getListaClientes()) { // Checa cliente por cliente.
                        if (c.getNombreDeUsuario().equals(nombreUsuario) && c.getContraseña().equals(pass)) {
                            credencialesCorrectas = true;
                            clienteActual = c;
                            break;
                        }
                    }
                    if (credencialesCorrectas == true)
                        break;
                    System.out.println("Lo siento, nombre de usuario o contraseña son incorrectos, intentalo de nuevo");
                }

                tienda.cambioIdioma(clienteActual.getPaisDeOrigen()); // Cambia el idioma al del cliente.
                tienda.getIdioma().saludo();
                tienda.getIdioma().asignaProbabilidadesDescuentos();
                tienda.getIdioma().descuentoPropaganda(null, null);
                int opcionUsuario;

                while (true) { // Valida las opciones del usuario.
                    try {
                        tienda.getIdioma().opciones();
                        String entradaUsuario = entrada.nextLine();
                        opcionUsuario = Integer.parseInt(entradaUsuario);

                        if (opcionUsuario >= 1 && opcionUsuario <= 3) {
                            switch (opcionUsuario) {
                                case 1:
                                    tienda.getCatalogo().imprimirCatalogo();
                                    break;
                                case 2:
                                    tienda.getCatalogo().imprimirCatalogo();
                                    System.out.println(tienda.hacerCompra());
                                    break;
                                case 3:
                                    tienda.getIdioma().despedida();
                                    salir = true;
                                    break;
                                default:
                                    throw new IllegalStateException("ISE No existen mas opciones");
                            }
                            if (opcionUsuario == 3)
                                break;
                        } else {
                            tienda.getIdioma().opcionInexistente();
                        }
                    } catch (NumberFormatException e) {
                        tienda.getIdioma().opcionIncorrecta();
                    }
                }
            } else {
                System.out.println("Vuelva pronto.");
                salir = true;
            }
        }
    }
}