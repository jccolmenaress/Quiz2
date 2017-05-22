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
public class Staff extends Employee{
    private String titulo;

    public Staff(String titulo, int oficina, String fechaContrato, String nombre, String apellido, double salario) {
        super(oficina, fechaContrato, nombre, apellido, salario);
        this.titulo = titulo;
    }

    @Override
    public double datosSalario() {
        return this.salario;
    }  

    @Override
    public String toString() {
        return "Staff{" + "titulo=" + titulo + ", oficina=" + oficina + ", fechaContrato=" + fechaContrato +
                ", nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + '}';

    }

    public String getTitulo() {
        return titulo;
    }
    
    
    
    
}
