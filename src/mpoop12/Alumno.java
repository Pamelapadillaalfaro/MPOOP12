/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop12;

/**
 * Clase que crea un alumno
 * @author alanm
 */
public class Alumno {
    private String nombre,apPaterno,apMaterno;
    private double numCuenta,edad;
    /**
     * Metodo constructor vacio
     */
    public Alumno() {
    }
    /**
     * Metodo constructor con atributos
     * @param nombre nombre del alumno
     * @param apPaterno Apellido paterno del alumno
     * @param apMaterno Apellido materno del alumno
     * @param numCuenta numero de cuenta del alumno
     * @param edad edade del alumno
     */
    public Alumno(String nombre, String apPaterno, String apMaterno, double numCuenta, double edad) {
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.numCuenta = numCuenta;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public double getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(double numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }
    /**
     * Metodo que te da los atributos
     * @return regresa una cadena con todos los atributos
     */
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apPaterno=" + apPaterno + ", apMaterno=" + apMaterno + ", numCuenta=" + numCuenta + ", edad=" + edad + '}';
    }
    
}
