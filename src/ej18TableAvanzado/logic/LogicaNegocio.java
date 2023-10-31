/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej18TableAvanzado.logic;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DAM2Alu5
 */
public class LogicaNegocio {
    
    
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();
    
    public static void añadirCliente(Cliente cliente){
        listaClientes.add(cliente);
    }
    
    
    public static ArrayList<Cliente> getListaClientes(){
        return listaClientes;
    }
    
    
    
}
