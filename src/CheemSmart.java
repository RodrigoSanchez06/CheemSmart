import java.util.LinkedList;
import java.util.Scanner;

import cliente.Cliente;
import cuentasBancarias.Cuenta;
import idiomas.EspanniolEsp;
import idiomas.EspanniolLatm;
import idiomas.Idioma;
import idiomas.Ingles;

public class CheemSmart{

    private static Idioma idioma;
    public static void main(String[] args) {

        LinkedList<Cliente> listaClientes = agregaClientes();
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n******Bienvenido a CheemSmart******\n");
        System.out.println("Para entrar a la tienda virtual Inicia Sesión.\n");
        boolean credencialesCorrectas = false;
        Cliente clienteActual = new Cliente();
        while (!credencialesCorrectas) {
                System.out.println("Introduce tu Nombre de usuario: ");
                String nombreUsuario = entrada.nextLine();
                System.out.println("Introduce la contraseña: ");
                String pass = entrada.nextLine();
            for (Cliente c : listaClientes) {
                if (c.getNombreDeUsuario().equals(nombreUsuario) && c.getContraseña().equals(pass)) {    
                    credencialesCorrectas = true;
                    clienteActual = c;
                    break;
                } 
            } 
            if(credencialesCorrectas == true ) break;
            System.out.println("Lo siento, nombre de usuario o contraseña son incorrectos, intentalo de nuevo");  
        }
        cambioIdioma(clienteActual.getPaisDeOrigen());
        idioma.saludo();
        int opcionUsuario;
        while (true) {
            try {
                idioma.opciones();
                String entradaUsuario = entrada.nextLine();
                opcionUsuario = Integer.parseInt(entradaUsuario);
                if (opcionUsuario >= 1 && opcionUsuario <= 3) break;
                idioma.opcionInexistente();;
            } catch (NumberFormatException e) {
                idioma.opcionIncorrecta();
            }   
        }

        switch (opcionUsuario) {
            case 1:
                //
                break;
            case 2:

                break;
            case 3:
                idioma.despedida();
                break;
            default:
                throw new IllegalStateException("ISE No existen mas opciones");
        }
    }

    private static void cambioIdioma(Idioma idiomaActual){
        idioma = idiomaActual;
    }

    public static LinkedList<Cliente> agregaClientes(){
        LinkedList<Cliente> listaClientes = new LinkedList<Cliente>();  
        EspanniolLatm latm = new EspanniolLatm();
        EspanniolEsp esp = new EspanniolEsp();
        Ingles ing = new Ingles();
        int id = 0;

        Cliente clienteUno = new Cliente("JuanitoPro777", "juan1234", "Juan Perez",
            552509051, "Nativitas CDMX", null,latm , id);
        clienteUno.setCuentaAsociada(crearAsociarCuenta(20000, 1234, clienteUno, 22060325));

        Cliente clienteDos = new Cliente("Maria1721", "mar1a_12", "María Fernanda",
             23123625, "Barcelona España", null, esp, ++id);
        clienteDos.setCuentaAsociada(crearAsociarCuenta(12500, 1721, clienteDos, 17118123));

        Cliente clienteTres = new Cliente("Fred12", "fr3di_21", "Frederick Town",
            7853255, "Texas 5th AV.", null, ing, ++id);
        clienteDos.setCuentaAsociada(crearAsociarCuenta(125, 0001, clienteTres, 31922257));
        listaClientes.add(clienteUno);
        listaClientes.add(clienteDos);
        listaClientes.add(clienteTres);

        return listaClientes;
    }

    public static Cuenta crearAsociarCuenta(double fondos, int nip, Cliente clienteAsociado, int numCuenta){
        return new Cuenta(fondos, numCuenta, nip, clienteAsociado);    
    }
}