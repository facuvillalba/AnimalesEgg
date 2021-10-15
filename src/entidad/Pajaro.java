
package entidad;


public class Pajaro {
    private String nombre;
    private int edad;
    private String direccion;
    private String duenio;

    public Pajaro(String nombre, int edad, String direccion, String duenio) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.duenio = duenio;
    }
    

    public Pajaro() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    @Override
    public String toString() {
        return "Pajaro{" + "nombre=" + nombre + ", edad=" + edad + ", direccion=" + direccion + ", duenio=" + duenio + '}';
    }
    
}
