
import controllers.ControllerService;
import java.util.ArrayList;
import java.util.List;
import models.Etudiant;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 21655
 */
public class ex {

    public static void main(String arg[]) {
        System.out.println("Liste des personnes");
        Etudiant e = null;
        ControllerService cs = new ControllerService();
        List<Etudiant> le =  cs.getAllEtudiant();
        for (Etudiant ps : le) {
            e = (Etudiant) ps;
            System.out.println(e.getId()+ " "
                    + e.getNom() + " "
                    + e.getPrenom());
        }
    }
}
