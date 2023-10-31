/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej18TableAvanzado.logic;

import java.util.Date;


/**
 *
 * @author DAM2Alu5
 */
public class Cliente {

String nombre,apellido,provincia,correo;
Date fechaAlta;
int edad;

    public Cliente(String nombre, String apellido, String provincia, String correo, Date fechaAlta, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.provincia = provincia;
        this.correo = correo;
        this.fechaAlta=new Date();
        this.fechaAlta = fechaAlta;
        this.edad = edad;
    }

    Cliente(String n, String a, String p, String c, String d, int ed) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
      public static String[] getCampos(){
        String campos[]={"Nombre","Apellido","Provincia","Correo","fecha alta","edad"};
        return campos;
    }
    
    public String[] getValores(){
        String valores[]={nombre,apellido,provincia,correo,(""+fechaAlta),String.valueOf(edad)};
        return valores;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", provincia=" + provincia + ", correo=" + correo + ", fechaAlta=" + fechaAlta + ", edad=" + edad + '}';
    }



    
}
