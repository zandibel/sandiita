/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectojava.proyecto.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author zandibel
 */
public class DAODireccionImpl {
    
     public String obtenerTodos()throws Exception{
        
    
     SessionFactory factory= HibernateUtil.getSessionFactory();
   Session sesion=    factory.openSession();
  Transaction tranza= sesion.beginTransaction();
 
Criteria cri=sesion.createCriteria(Direccion.class);
ArrayList<Direccion> usuarios= (ArrayList<Direccion>)cri.list();

ObjectMapper mapper=new ObjectMapper();
Map<String, ArrayList<Direccion>> singletonMap= Collections.singletonMap("direccion", usuarios);


  
  tranza.commit();
  sesion.close();
  System.out.println(mapper.writeValueAsString(singletonMap));
  return mapper.writeValueAsString(singletonMap);
    
    }
    
}
