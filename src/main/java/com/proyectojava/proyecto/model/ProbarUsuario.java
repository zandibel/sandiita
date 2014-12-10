/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectojava.proyecto.model;

/**
 *
 * @author zandibel
 */
public class ProbarUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{ 
    DAOUsuarioImpl du=new DAOUsuarioImpl();
    System.out.println(du.obtenerTodos());
    }
    
}
