/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosclase;

import com.sun.source.tree.WhileLoopTree;

/**
 *
 * @author DAM2Alu5
 */
public class Alumno {
    String nombre,apellidos;
    int edad;
    
        public Alumno(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Alumno(){
    }
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + '}';
    }

    public boolean mayorEdad(){
        return edad>17;
       
    }
    
    public String rangoEdad() {
    

    if (edad > 65) {
        return "mayor";
    } else if (edad > 18) {
        return "adulto";
    } else if (edad > 12) {
        return "adolescente";
    } else {
        return "niño";
    }
}
    
    
    
    
    
    
}
