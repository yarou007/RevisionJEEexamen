/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;
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
    
    public boolean Ajouter(Etudiant e){
         
        try{
            em.getTransaction().begin();
            em.persist(e);
            em.getTransaction().commit();
            return true;
        }catch(Exception ex){
            System.err.println(ex.getMessage());
            return false;
        }finally {
            if (em != null) {
                em.close();
            }
        
    }
    }
    public boolean Edit(Etudiant e){
        try{
            em.getTransaction().begin();
            em.merge(e);
            em.flush();
            em.getTransaction().commit();
            return true;
        }catch(Exception ex){
            System.err.println(ex.getMessage());
            return false;
        }finally {
            if (em != null) {
                em.close();
            }
    }
    }
    public boolean Supprimer(Integer id){
              Etudiant e = em.getReference(Etudiant.class, id);
               e.getId();
      
        try{
            em.getTransaction().begin();
            em.remove(e);
              em.flush();
            em.getTransaction().commit();
            return true;
        }catch(Exception ex){
            System.err.println(ex.getMessage());
            return false;
        }finally {
            if (em != null) {
                em.close();
            }
    }
    }
    public ArrayList<Etudiant> getAllEtudiant(){
        ArrayList<Etudiant> students ;
        String req = "SELECT e FROM Etudiant e ";
        Query q = em.createQuery(req);
        
        students = ( ArrayList<Etudiant> ) q.getResultList();
        return students;/*
        
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Etudiant.class));
        Query q = em.createQuery(cq);
        return q.getResultList();*/

       
    }
    
}
