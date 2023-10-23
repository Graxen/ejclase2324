/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej14Table;

/**
 *
 * @author DAM2Alu5
 */
public class Cliente {
    String nombre, apellido, provincia;
    int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Cliente(String nombre, String apellido, String provincia, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.provincia = provincia;
        this.edad = edad;
    }

    public Cliente() {
    }

    
    
    public String[] getCampos(){
        String campos[]={"Nombre","Apellido","Provincia","edad"};
        return campos;
    }
    
    public String[] getValores(){
        String valores[]={nombre,apellido,provincia,String.valueOf(edad)};
        return valores;
    }
            
    
    
    
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", provincia=" + provincia + ", edad=" + edad + '}';
    }

   
      
    
    
    
    
}
