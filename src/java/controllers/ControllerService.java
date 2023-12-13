/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import models.Etudiant;

/**
 *
 * @author 21655
 */
public class ControllerService {
    EntityManagerFactory emf;
    EntityManager em;
    
    public ControllerService(){
        this.emf = Persistence.createEntityManagerFactory("Exemple_coursPU");
        this.em = emf.createEntityManager();
    }
    
    public Boolean Ajouter(Etudiant e){
         
        try{
            em.getTransaction().begin();
            em.persist(e);
            em.getTransaction().commit();
            return true;
        }catch(Exception ex){
            System.err.println(ex.getMessage());
            return false;
        }
        
    }
    
    public Boolean Edit(Etudiant e){
        try{
            em.getTransaction().begin();
            em.merge(e);
            em.flush();
            em.getTransaction().commit();
            return true;
        }catch(Exception ex){
            System.err.println(ex.getMessage());
            return false;
        }
    }
    public Boolean Supprimer(Etudiant e){
        
        try{
            em.getTransaction().begin();
            em.remove(e);
              em.flush();
            em.getTransaction().commit();
            return true;
        }catch(Exception ex){
            System.err.println(ex.getMessage());
            return false;
        }
    }
    public List<Etudiant> getAllEtudiant(){
        List<Etudiant> students = new ArrayList<Etudiant>();
        String req = "SELECT e FROM etudiant e";
        Query q = em.createQuery(req);
        students = (ArrayList<Etudiant> ) q.getResultList();
        return students;
       
    }
    
}
