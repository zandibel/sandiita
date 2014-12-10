/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectojava.proyecto.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author zandibel
 */
public class ControladorHola {
    
   
    @RequestMapping(value="/servicios1", method=RequestMethod.GET, headers={"Accept=text/html"})
    public @ResponseBody String holaConGet(){
        return "Este es mi primer controller con un get";
    }
    
    
   @RequestMapping(value="/usuario2", method=RequestMethod.GET, headers={"Accept=Application/json"})
    public @ResponseBody String obtenerTodos()throws Exception{
        
   
        return GenararUsuarios.obtenerUsuarios();
    }
    
}
