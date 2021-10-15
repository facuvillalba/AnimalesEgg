/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author agust
 */
public class ConejoAgus {
    private String nombre;
    private String duenio;
    private Boolean cola;
    private String color;
    private String tamanio;
    private Integer edad;
    private Long dniDuenio;

    public ConejoAgus() {
    }

    public ConejoAgus(String nombre, String duenio, Boolean cola, String color, String tamanio, Integer edad, Long dniDuenio) {
        this.nombre = nombre;
        this.duenio = duenio;
        this.cola = cola;
        this.color = color;
        this.tamanio = tamanio;
        this.edad = edad;
        this.dniDuenio = dniDuenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public Boolean getCola() {
        return cola;
    }

    public void setCola(Boolean cola) {
        this.cola = cola;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Long getDniDuenio() {
        return dniDuenio;
    }

    public void setDniDuenio(Long dniDuenio) {
        this.dniDuenio = dniDuenio;
    }

    @Override
    public String toString() {
        return "ConejoAgus{" + "nombre=" + nombre + ", duenio=" + duenio + ", cola=" + cola + ", color=" + color + ", tamanio=" + tamanio + ", edad=" + edad + ", dniDuenio=" + dniDuenio + '}';
    }
    
}
