/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectojava.proyecto.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *
 * @author zandibel
 */

@Configuration
@EnableWebMvc
@ComponentScan("com.proyectojava.proyecto.controller")

public class WebAppHibernate extends WebMvcConfigurerAdapter{
    
}
