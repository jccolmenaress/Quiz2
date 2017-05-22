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
public class Student extends Person{
    private String status;

    public Student(String nombre, String apellido, String status, double salario) {
        super(nombre, apellido, salario);
        this.status = status;
    }

    @Override
    public double datosSalario() {
        return this.salario;
        }

    @Override
    public String toString() {
        return "Student{" + "nombre=" + nombre + ", apellido=" + apellido + ", status=" + status + ", salario=" + salario + '}';
    }  
}
