/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectojava.proyecto.controller;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * @author zandibel
 */
public class WebApp extends AbstractAnnotationConfigDispatcherServletInitializer{
    
     @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println(">>>>>>>>>>>>> Cargando Configuracion Clases de Config <<<<<<<<<<<<<<<<<");
        return new Class<?>[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println(">>>>>>>>>>>>>Cargando Configuracion de Servlet <<<<<<<<<<<<<<<<<<");
       return new Class<?>[]{WebAppConfig.class,WebAppHibernate.class}; 
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println(">>>>>>>>>>>>>Cargando Configuracion de Servicio <<<<<<<<<<<<<<<<");
        return new String[]{"/servicios1/*"};
    }
    
    
}
