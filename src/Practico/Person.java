/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practico;

/**
 *
 * @author JoseLuis
 */
public abstract class Person {
    protected String nombre;
    protected String apellido;
    protected double salario;

    public Person(String nombre, String apellido, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Person{" + "nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + '}';
    }
    
    public abstract double datosSalario();
}
