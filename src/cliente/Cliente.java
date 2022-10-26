package cliente;

import cuentasBancarias.Cuenta;

public class Cliente {

    private String nombreUsuario;
    private String contraseña;
    private String nombre;
    private int telefono;
    private String direccion;
    private Cuenta cuentaAsociada; // AUN NO VEMOS CUENTA BANCARIA, FALTA!!
    private Object paisDeOrigen; // hay que ver que rollo aqui con las regiones. FALTA!!
    private int id;

    public Cliente(String nombreUsuario, String contraseña, String nombre, int telefono, String direccion, Cuenta cuentaAsociada, Object paisDeOrigen, int id) {
        this.nombreUsuario=nombreUsuario;
        this.contraseña=contraseña;
        this.nombre=nombre;
        this.telefono=telefono;
        this.direccion=direccion;
        this.cuentaAsociada=cuentaAsociada;
        this.paisDeOrigen=paisDeOrigen;
        this.id=id;
    }
  
    public String getNombreDeUsuario(){
        return this.nombreUsuario;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getContraseña(){
        return this.contraseña;
    }

    public int getTelefono(){
        return this.telefono;
    }

    public String getDireccion(){
        return this.direccion;
    }

    public Object getPaisDeOrigen(){
        return this.paisDeOrigen;
    }

    public Cuenta getCuentaAsociada(){
        return this.cuentaAsociada;
    }

    public int getId(){
        return this.id;
    }

    public void setNombreDeUsuario(String nombreUsuario){
        this.nombreUsuario=nombreUsuario;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setContraseña(String contraseña){
        this.contraseña=contraseña;
    }

    public void setTelefono(int telefono){
        this.telefono=telefono;
    }

    public void setDireccion(String direccion){
        this.direccion=direccion;
    }

    public void setPaisDeOrigen(Object paisDeOrigen){
        this.paisDeOrigen=paisDeOrigen;
    }

    public void setCuentaAsociada(Cuenta cuentaAsociada){
        this.cuentaAsociada=cuentaAsociada;
    }

    public void getId(int id){
        this.id=id;
    }
}
