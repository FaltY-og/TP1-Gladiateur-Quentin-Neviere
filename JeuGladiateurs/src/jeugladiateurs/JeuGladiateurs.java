package jeugladiateurs;


import combat.CompteurDeTour;
import combat.AffichageEcran;
import personnages.Mirmillon;
import personnages.Retiaire;

public class JeuGladiateurs {

    public static void main(String[] args) {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="expanded" desc="Instanciation des objets">
    CompteurDeTour tour = new CompteurDeTour();
    AffichageEcran affichage = new AffichageEcran();
    //Personnage Bob = new Personnage("Bob l'Éponge", 15, 15, 70 , 15);
    //Personnage Igor = new Personnage("Igor l'empaleur", 25, 5, 100, 30);
    Mirmillon Bob = new Mirmillon("Bob l'Éponge", 15, 15, 70 , 15);
    Retiaire Igor = new Retiaire("Igor l'empaleur", 25, 5, 100, 30);
    
    
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
    
    
    
        do {
            tour.afficheTour();
            
            for (int i = 0; i <= 100; i++) {
                if (Bob.getInitiative() == i) {
                    Bob.frapperPersonnage(Igor);
                }
                if (Igor.getInitiative() == i) {
                    Igor.frapperPersonnage(Bob);
                }
            }
            
            affichage.afficherSeparateurInfosPerso();
            
            Bob.afficherInfosPersonnage();
            Igor.afficherInfosPersonnage();
            
            Bob.setNewInitiativeRandom();
            Igor.setNewInitiativeRandom();
            
            tour.augmenteTour();
            
            affichage.afficherSeparateurDeTour();
        } while (Bob.getPointsDeVie() > 0 && Igor.getPointsDeVie() > 0);
        
        affichage.afficheVictoire(Bob, Igor);
    
    }

}
