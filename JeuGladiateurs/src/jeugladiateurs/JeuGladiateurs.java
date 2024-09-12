package jeugladiateurs;

import personnages.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;

public class JeuGladiateurs {

    public static void main(String[] args) {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="expanded" desc="Instanciation des objets">
    CompteurDeTour tour = new CompteurDeTour();
    AffichageEcran affichage = new AffichageEcran();
    Personnage Bob = new Personnage("Bob l'Éponge", 15, 15, 70 , 15);
    Personnage Igor = new Personnage("Igor l'empaleur", 25, 5, 5, 30);
    // </editor-fold>
    
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    Bob.afficherInfosPersonnage();
    Igor.afficherInfosPersonnage();
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de combat">
    affichage.afficherDebutCombat();
    
        Bob.frapperPersonnage(Igor);
        Bob.frapperPersonnage(Igor);
        System.out.println();
        Igor.frapperPersonnage(Bob);
        Igor.frapperPersonnage(Bob);
    
    }

}
