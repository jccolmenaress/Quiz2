/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practico;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
 
/**
 *
 * @author Jose Luis Pinzon Y Camilo Colmenares
 */
public class Main {

    public static void main (String[] args){ 
        Universidad nacho = new Universidad();
        leerArchivo("datos.txt", nacho);
        System.out.println("");
        System.out.println("El salario total de los empleados es: " + nacho.calcularSalarioTotal());
        System.out.println("El salario de los gerentes es: " + nacho.datosSalarioGerente()); 
    }

    public static char convertToLetter(int b){
        return (char)(b+65); //Por la relacion con ASCCI
    }
    
    public static int convertToNumber(char a){
        return a-65; //Por la relacion con ASCCI.
    }
    
    public static String descifrar(String token){ 
        int a;
        String b="";
        for (int i = 0; i < token.length(); i++) {
            a = convertToNumber(token.charAt(i));
            a = (26+(a-3))%26;
            b = b+convertToLetter(a); 
        }
    return b;         
    }
        
    public static Person parsePersona(String personaString){
        String caracteristicas[]=personaString.split(",");
        String tipo=caracteristicas[0];
        
        switch(tipo){
            case "STUDENT":{
                return new Student(descifrar(caracteristicas[1]), descifrar(caracteristicas[2]),
                        (descifrar(caracteristicas[3])), Double.parseDouble(caracteristicas[4]));
               
                
            }
            case "FACULTY":{
                return new Faculty (descifrar(caracteristicas[1]), Integer.parseInt(caracteristicas[2])
                        ,(caracteristicas[3]), descifrar(caracteristicas[4]), descifrar(caracteristicas[5])
                        ,Double.parseDouble(caracteristicas[6]));
            }
            case "STAFF":{
                return new Staff(descifrar(caracteristicas[1]), Integer.parseInt(caracteristicas[2])
                        ,(caracteristicas[3]), descifrar(caracteristicas[4]), descifrar(caracteristicas[5])
                        ,Double.parseDouble(caracteristicas[6]));
                
            }
            default:{
                return null;
            }
        }    
    }
    
    public static void leerArchivo(String archivo, Universidad n){
        File f = new File (archivo);
        try{
            Scanner entrada = new Scanner (f);
            while(entrada.hasNextLine()){
                String token = entrada.nextLine();
                   n.addPersonas( parsePersona(token));
                    System.out.println("");
                    if ( parsePersona(token) instanceof Student )
                        System.out.print(((Student) parsePersona(token)).toString());
                    else if( parsePersona(token) instanceof Staff )
                        System.out.print(((Staff) parsePersona(token)).toString());     
                    else if( parsePersona(token) instanceof Faculty)
                        System.out.print(((Faculty) parsePersona(token)).toString());   
            } 
        }
        catch(FileNotFoundException e){
            System.out.println("No se encontro el archivo");
        }
    }
    
}
