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
public abstract class Employee extends Person {
    protected int oficina;
    protected String fechaContrato;

    public Employee(int oficina, String fechaContrato, String nombre, String apellido, double salario) {
        super(nombre, apellido, salario);
        this.oficina = oficina;
        this.fechaContrato = fechaContrato;
    }
    
    @Override
    public double datosSalario() {
         return this.salario;
    }  
}
