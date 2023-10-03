/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosclase;

import ej1InterfazSwing.JFrameHolaAlumnos;
import javax.swing.JFrame;

/**
 *
 * @author DAM2Alu5
 */
public class MuestraAlumno {
   
    public static void main(String[] args) {
         Alumno alu1 = new Alumno("Juan", "Perez", 2);
        System.out.println(alu1.mayorEdad());
        System.out.println(alu1.rangoEdad());
        
  
       
    }
}
