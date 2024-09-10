package combat;

public class CompteurDeTour {

    int cptrTour;
    
    
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public CompteurDeTour() {
        cptrTour = 1;
    }
    // </editor-fold>

    public int getCptrTour() {
        return cptrTour;
    }

    public void setCptrTour(int cptrTour) {
        this.cptrTour = cptrTour;
    }

    

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void augmenteTour() {
        cptrTour++;
    }

    public void afficheTour() {
        // TODO : Afficher le tour actuel, tel que montré dans l'énoncé
    }
    // </editor-fold>
}
