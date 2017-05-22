/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practico;

import java.util.ArrayList;

/**
 *
 * @author JoseLuis
 */
public class Universidad {
    private ArrayList<Person> personas;

    public Universidad() {
        this.personas = new ArrayList<>();
    }
    
    public void addPersonas(Person a){
        personas.add(a);
    }

    public double datosSalarioGerente() {
    double salarioT = 0;
        for (Person persona : personas) {
            if(persona instanceof Staff){
                Staff a = (Staff) persona;
                if("GERENTE".equals(a.getTitulo())){
                    salarioT+=a.datosSalario();
                }
            }
        }
    return salarioT;
    }
  
    public double calcularSalarioTotal(){
    double salarioTotal = 0;
        for (Person persona : personas) {
            salarioTotal+=persona.datosSalario();
        }
    return salarioTotal;    
    }
}
     
     
    
    

