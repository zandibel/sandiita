/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectojava.proyecto.controller;

import com.proyectojava.proyecto.model.DAOUsuarioImpl;

/**
 *
 * @author zandibel
 */
public class GenararUsuarios {
    public static String obtenerUsuarios()throws Exception{
        DAOUsuarioImpl du=new DAOUsuarioImpl();
        return du.obtenerTodos();
    }
    
}
