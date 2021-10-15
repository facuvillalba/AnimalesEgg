package e4animal.entidad;

import java.util.Date;

/**
 *
 * @author leonahuel
 */
public class Tigre {
    
    private String nombre;
    private String dueno;
    private String color;
    private Date edad;
    private String direccion;

    public Tigre() {
    }

    public Tigre(String nombre, String dueno, String color, Date edad, String direccion) {
        this.nombre = nombre;
        this.dueno = dueno;
        this.color = color;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getEdad() {
        return edad;
    }

    public void setEdad(Date edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Tigre{" + "nombre=" + nombre + ", dueno=" + dueno + ", color=" + color + ", edad=" + edad + ", direccion=" + direccion + '}';
    }
    
    
    
}
