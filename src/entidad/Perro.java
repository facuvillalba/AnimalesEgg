
package entidad;

import java.util.Date;

public class Perro {
    
//ATRIBUTOS----------------------------------------------------------------------
    private String nombre;
    private String apodo;
    private String raza;
    private String color;
    private String usuario;
    private boolean cola;
    private Date nacimiento;
    
//METODOS----------------------------------------------------------------------    

    public Perro() {
    }

    public Perro(String nombre, String apodo, String raza, String color, String usuario, boolean cola, Date nacimiento) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.raza = raza;
        this.color = color;
        this.usuario = usuario;
        this.cola = cola;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", apodo=" + apodo + ", raza=" + raza + ", color=" + color + ", usuario=" + usuario + ", cola=" + cola + ", nacimiento=" + nacimiento + '}';
    }
    
    
    
    
    
    
}
