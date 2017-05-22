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
public class Faculty extends Employee{
    private String rango;

    public Faculty(String rango, int oficina, String fechaContrato, String nombre, String apellido, double salario) {
        super(oficina, fechaContrato, nombre, apellido, salario);
        this.rango = rango;
    }
   
    
    @Override
    public double datosSalario() {
        return this.salario;
    }  

    @Override
    public String toString() {
        return "Faculty{" + "rango=" + rango + ", oficina=" + oficina + ", fechaContrato=" + fechaContrato +
                ", nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + '}';
    }
    
    
}
