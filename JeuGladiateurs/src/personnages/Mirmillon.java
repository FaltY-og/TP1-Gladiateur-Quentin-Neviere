
package personnages;

import java.util.Random;


public class Mirmillon extends Personnage {

    public Mirmillon(String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
    }

    
    @Override
    public void setNewInitiativeRandom() {
        Random rand = new Random();
        
        int minValue = 0;
        int maxValue = 30;
        this.initiative = rand.nextInt(maxValue - minValue) + minValue;
    }
    
    
    @Override
    public void frapperPersonnage(Personnage personnageCible) {
        int dommages;
      
        for (int i = 1; i < 3; i++) {
            do {            
       
                dommages = super.attaqueCalcul() - personnageCible.valeurDefense;
            
            } while (dommages < 0);
            
            personnageCible.pointsDeVie -= dommages;
            
            System.out.println();
            System.out.println(this.nom + " attaque avec une puissance de : " + attaqueCalcul());
            System.out.println(personnageCible.nom + " a une défense de : " + personnageCible.valeurDefense);
            System.out.println("Les dommages sont donc de : " + dommages + "\n");
            
            if (personnageCible.pointsDeVie < 0) {
                personnageCible.pointsDeVie = 0;
                System.out.println(nom + " décapite " + personnageCible.getNom() + " !");
                break;
            } else if (i >= 1) {
                System.out.println(nom + " attaque une deuxième fois fois !\n");
            }
            
            
        }
                        
    }
    
    @Override
    public void afficherInfosPersonnage() {
        System.out.println();
        System.out.println("\t" + getNom() + " Mirmillon");
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
    
}

