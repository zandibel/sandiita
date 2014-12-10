/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectojava.proyecto.controller;

import com.proyectojava.proyecto.model.DAODireccionImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author zandibel
 */

@Controller
@RequestMapping("/")

public class ControladorDireccion {
     
   @RequestMapping(value="/direccion3", method=RequestMethod.GET, headers={"Accept=Applicaction/json"})
    public @ResponseBody String todos()throws Exception{
      DAODireccionImpl di=new DAODireccionImpl();
     
return di.obtenerTodos();
    }
    
    
}
