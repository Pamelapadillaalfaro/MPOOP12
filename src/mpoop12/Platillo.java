/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop12;

/**
 * Método que crea un platillo
 * @author alumno
 */
public class Platillo {
    String nombre,ingredientes;
    double precio;
    /**
     * Constructor vacío
     */
    public Platillo() {
    }
    /**
     * Constructor con atributos
     * @param nombre Nombre del platillo
     * @param ingredientes Nombre de los ingredientes que tiene el platillo
     * @param precio Precio del platillo
     */
    public Platillo(String nombre, String ingredientes, double precio) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    /**
     * Método que imprime los atributos de la clase
     * @return regresa una cadena con todos los atributos
     */
    @Override
    public String toString() {
        return "Platillo{" + "Nombre=" + nombre + ", Ingredientes=" + ingredientes + ", precio=" + precio + '}';
    }
    
    
}
