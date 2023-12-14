/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
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
    
    
    public Etudiant getEtudiant(Integer id){
        Etudiant e = null;
        try{
         e = em.getReference(Etudiant.class, id);
         e.getId();
         String req = "SELECT e FROM Etudiant e ";
         Query q = em.createQuery(req);
        }catch(Exception ex){
            e=null;
        }
        return e;
    }
    public ArrayList<Etudiant> getAllEtudiant(){
        ArrayList<Etudiant> students=null;
        try{
          String sql = " select e( (*) (e.id) ) from `etudiant` e";
            Query q = em.createQuery(sql);
         students = (ArrayList<Etudiant>) q.getResultList();
        }catch(Exception ex){
            students = null;
        }
        //students = ( ArrayList<Etudiant> ) q.getResultList();
        return students;/*
        
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Etudiant.class));
        Query q = em.createQuery(cq);
        return q.getResultList();*/
        
    }
    
}
