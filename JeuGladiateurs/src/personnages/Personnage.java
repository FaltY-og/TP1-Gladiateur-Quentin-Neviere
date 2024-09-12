package personnages;

import java.util.Random;

public class Personnage {

    String nom;
    int pointsDeVie;
    int valeurMaxAttaque;
    int valeurDefense;
    int initiative;
    

    
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
        this.nom = nom;
        this.pointsDeVie = pvs;
        this.valeurMaxAttaque = attaqueMax;
        this.valeurDefense = defense;
        this.initiative = ini;
    }

    public Personnage() {
        nom = "";
        pointsDeVie = 0;
        valeurMaxAttaque = 0;
        valeurDefense = 0;
        initiative = 0;
    }
   

    public String getNom() {
        return nom;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public int getValeurMaxAttaque() {
        return valeurMaxAttaque;
    }

    public int getValeurDefense() {
        return valeurDefense;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public void setValeurMaxAttaque(int valeurMaxAttaque) {
        this.valeurMaxAttaque = valeurMaxAttaque;
    }

    public void setValeurDefense(int valeurDefense) {
        this.valeurDefense = valeurDefense;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }
    
    

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void afficherInfosPersonnage() {
        System.out.println();
        System.out.println("\t" + getNom());
        System.out.println("\t Attaque : " + getValeurMaxAttaque());
        System.out.println("\t Défense : " + getValeurDefense());
        System.out.println("\t Points de vie : " + getPointsDeVie());
        System.out.println("\t Initiative : " + getInitiative());
        if (pointsDeVie >= 1) {
            System.out.println("\t Satut : Vivant");
        } else {
            System.out.println("\t Satut : Mort");
        }
        
    }

    private int attaqueCalcul() {
        
        Random rand = new Random();
        
        int minValue = 0;
        int maxValue = valeurMaxAttaque;
        int attaque = rand.nextInt(maxValue - minValue) + minValue;
        
        return attaque;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        int dommages;
        do {            
            do {            
       
            dommages = attaqueCalcul() - personnageCible.valeurDefense;
            
        } while (dommages < 0);
        
        personnageCible.pointsDeVie -= dommages;
        
            if (personnageCible.pointsDeVie < 0) {
                personnageCible.pointsDeVie += dommages;
            }
            
        } while (personnageCible.pointsDeVie < 0);
        
        System.out.println();
        System.out.println(this.nom + " attaque avec une puissance de : " + attaqueCalcul());
        System.out.println(personnageCible.nom + " a une défense de : " + personnageCible.valeurDefense);
        System.out.println("Les dommages sont donc de : " + dommages);
        
        
    }

    public void setNewInitiativeRandom() {
        Random rand = new Random();
        
        int minValue = 0;
        int maxValue = 100;
        this.initiative = rand.nextInt(maxValue - minValue) + minValue;
        
    }
    // </editor-fold>
    
}
