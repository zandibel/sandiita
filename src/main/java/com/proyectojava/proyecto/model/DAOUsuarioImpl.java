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
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author zandibel
 */

@Controller
@RequestMapping("/")

public class DAOUsuarioImpl {
    /*public String obtenerTodos() throws Exception{
        SessionFactory factory=HibernateUtil.getSessionFactory();
        Session session= factory.openSession();
        Transaction tranza= session.beginTransaction();
 Criteria cri=session.createCriteria(Usuario.class);
 
 
 
 ArrayList<Usuario> usuarios= (ArrayList<Usuario>)cri.list();
 Map<String, ArrayList<Usuario>> singletonMap = Collections.singletonMap("usuarios", usuarios);
 
 
 
 ObjectMapper mapper= new ObjectMapper();
 
 tranza.commit();
 session.close();
 
 return mapper.writeValueAsString(singletonMap);
    }
   public String obtenerUsuarioPorId(Integer Id) throws Exception{
        SessionFactory factory=HibernateUtil.getSessionFactory();
        Session session= factory.openSession();
        Transaction tranza= session.beginTransaction();
 Criteria cri=session.createCriteria(Usuario.class).add(Restrictions.idEq(Id));
    Usuario u = (Usuario) cri.uniqueResult();
    Query cuerito=  session.createQuery("from Usuario as usuario where id=?");
    Usuario u2= (Usuario) cuerito.setInteger(0, Id).uniqueResult();
  ObjectMapper mapper= new ObjectMapper();
  
  
 
 tranza.commit();
 session.close();
 
 return mapper.writeValueAsString(u);
    }*/
    
    public String obtenerPorNombre(String nombre) throws Exception{
        SessionFactory factory=HibernateUtil.getSessionFactory();
        Session session= factory.openSession();
        Transaction tranza= session.beginTransaction();
        Criteria cri=session.createCriteria(Usuario.class).add(Restrictions.like("nombre",nombre+"%"));
        Criteria cri2=session.createCriteria(Usuario.class).add(Restrictions.eq("nombre",nombre));
        Criteria cri3=session.createCriteria(Usuario.class).add(Restrictions.between("edad", 18, 40)).addOrder(Order.asc("nombre"));
        Criteria cri4=session.createCriteria(Usuario.class).add(Restrictions.lt("sueldo", new Integer(4000)));
        Criteria cri5=session.createCriteria(Usuario.class).add(Restrictions.gt("sueldo", new Integer (4000)));
        Criteria cri6=session.createCriteria(Usuario.class).add(Restrictions.ge("sueldo", new Integer (4000)));
  
  ArrayList<Usuario> usuarios=(ArrayList<Usuario>) cri.list();
  
  ObjectMapper mapper=new ObjectMapper();
  Map<String, ArrayList<Usuario>> singletomMap=Collections.singletonMap("usuario", usuarios);
 
 tranza.commit();
 session.close();
 
 return mapper.writeValueAsString(usuarios);
    
}
     public  String obtenerTodos () throws  Exception {
    SessionFactory f�brica =  HibernateUtil . getSessionFactory ();
    Session sesion = f�brica . openSession ();
    Transaction tranza = sesion . beginTransaction ();
    
      Criteria cri = sesion . createCriteria ( Usuario . class);
      ArrayList  < Usuario > Usuarios =   ( ArrayList  < Usuario > ) cri . list ();
      Map < String , ArrayList  <Usuario> > singletonMap =  Collections . singletonMap ( " Usuarios " , Usuarios);    
    
      ObjectMapper mapper =  new  ObjectMapper ();
      
      tranza . commit ();
      sesion . close ();
      return mapper . writeValueAsString (singletonMap);
    }
    
    
    public  String  obtenerUsuarioPorId ( Integer id ) throws  Exception{
    SessionFactory f�brica =  HibernateUtil . getSessionFactory ();
    Session sesion = f�brica . openSession ();
    Transaction tranza = sesion . beginTransaction ();
    
        
      Criteria cri = sesion . createCriteria ( Usuario . class) . add ( Restrictions . idEq ( 1 ));
      Usuario u = ( Usuario ) cri . uniqueResult (); // Criterios estafadores
   
      // HQL
      Query cuerito = sesion . createQuery ( " de Usuario como usuario donde id =? " );
      Usuario u2 = ( Usuario ) cuerito . setInteger ( 0 , id) . uniqueResult ();
     
      tranza . commit ();
      sesion . close ();
      
      ObjectMapper mapper =  new  ObjectMapper ();
      return mapper . writeValueAsString (u);
}
    
}
