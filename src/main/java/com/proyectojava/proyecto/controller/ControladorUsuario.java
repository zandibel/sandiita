/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectojava.proyecto.controller;

import com.proyectojava.proyecto.model.DAOUsuarioImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author zandibel
 */

@Controller
@RequestMapping("/")

public class ControladorUsuario {
    @RequestMapping(value="/usuario2", method=RequestMethod.GET,headers={"Accept=Application/json"})
    public @ResponseBody String hola2()throws Exception{
        DAOUsuarioImpl d=new DAOUsuarioImpl();
        
        return d.obtenerTodos();
    }
    
    @RequestMapping(value="/usuario/{id}",method=RequestMethod.GET,headers={"Accept=Application/json"})
    public @ResponseBody String hola3(@PathVariable Integer id) throws Exception{
    DAOUsuarioImpl du=new DAOUsuarioImpl();
    
        return du.obtenerUsuarioPorId(id);
    }
    
       @RequestMapping(value="/usuario/nombre/{nombre}", method=RequestMethod.GET, headers={"Accept=Application/json"})
    public @ResponseBody String obtenerPorNombre(@PathVariable String nombre)throws Exception{
    DAOUsuarioImpl d=new DAOUsuarioImpl();
    
   
        return d.obtenerPorNombre(nombre);
    }
}
