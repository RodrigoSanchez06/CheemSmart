package cliente;

import cuentasBancarias.Cuenta;
import cuentasBancarias.Icuenta;
import cuentasBancarias.ProxyCuenta;
import idiomas.Idioma;

/**
 * Clase que representa a un Cliente del supermercado CheemSmart.
 */
public class Cliente {

    private String nombreUsuario;
    private String contraseña;
    private String nombre;
    private int telefono;
    private String direccion;
    private Icuenta cuentaAsociada;
    private Idioma paisDeOrigen;
    private int id;

    /**
     * Constructor de Cliente que recibe la información necesaria de registro.
     * 
     * @param nombreUsuario  nombre de usuario del cliente.
     * @param contraseña     contraseña de sesión del cliente.
     * @param nombre         nombre del cliente.
     * @param telefono       teléfono del cliente.
     * @param direccion      dirección del cliente.
     * @param cuentaAsociada cuenta bancaria asociada del cliente.
     * @param paisDeOrigen   pais de origen del cliente.
     * @param id             identificador único del cliente.
     */
    public Cliente(String nombreUsuario, String contraseña, String nombre, int telefono, String direccion,
            Icuenta cuentaAsociada, Idioma paisDeOrigen, int id) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cuentaAsociada = cuentaAsociada;
        this.paisDeOrigen = paisDeOrigen;
        this.id = id;
    }

    /**
     * Constructor vacío (default) de Cliente
     */
    public Cliente() {
        this.nombreUsuario = "Username";
        this.contraseña = "admin1234";
        this.nombre = "name";
        this.telefono = 0000000;
        this.direccion = "SD";
        this.cuentaAsociada = null;
        this.paisDeOrigen = null;
        this.id = -1;
    }

    /**
     * devuelve el nombre de usuario del cliente.
     * 
     * @return nombre de usuario.
     */
    public String getNombreDeUsuario() {
        return this.nombreUsuario;
    }

    /**
     * devuelve el nombre del cliente.
     * 
     * @return nombre del cliente.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * devuelve la contraseña del cliente.
     * 
     * @return contraseña del cliente.
     */
    public String getContraseña() {
        return this.contraseña;
    }

    /**
     * devuelve el teléfono del cliente.
     * 
     * @return teléfono del cliente.
     */
    public int getTelefono() {
        return this.telefono;
    }

    /**
     * devuelve la dirección del cliente
     * 
     * @return dirección del cliente
     */
    public String getDireccion() {
        return this.direccion;
    }

    /**
     * devuelve el pais de origen del cliente.
     * 
     * @return pais de origen del cliente.
     */
    public Idioma getPaisDeOrigen() {
        return this.paisDeOrigen;
    }

    /**
     * Devuelve el Identificador único del CLiente
     * 
     * @return identificador único del cliente
     */
    public int getId() {
        return this.id;
    }

    /**
     * Asigna un nombre de usuario al cliente
     * 
     * @param nombreUsuario
     */
    public void setNombreDeUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * Asigna un nombre al cliente
     * 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * asigna una contraseña al cliente.
     * 
     * @param contraseña
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * asigna un número de teléfono al cliente.
     * 
     * @param telefono
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * asigna una dirección al cliente.
     * 
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Asigna un país de origen al cliente.
     * 
     * @param paisDeOrigen
     */
    public void setPaisDeOrigen(Idioma paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    /**
     * asigna una cuenta bancaria asociada
     * 
     * @param cuentaAsociada
     */
    public void setCuentaAsociada(Icuenta cuentaAsociada) {
        this.cuentaAsociada = cuentaAsociada;
    }

    /**
     * asigna un identificador único al cliente.
     * 
     * @param id
     */
    public void getId(int id) {
        this.id = id;
    }
}
