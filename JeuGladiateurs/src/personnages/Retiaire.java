
package personnages;

import java.util.Random;



public class Retiaire extends Personnage {
    
    private boolean filetEnMain;

    public Retiaire(String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
        this.filetEnMain = true;
    }

    public boolean isFiletEnMain() {
        return filetEnMain;
    }
    
    
    @Override
    public void afficherInfosPersonnage() {
        System.out.println();
        System.out.println("\t" + getNom() + " Rétiaire");
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

    @Override
    public void frapperPersonnage(Personnage personnageCible) {
        int dommages;
        if (filetEnMain) {
        System.out.println(nom + " lance son filet ");
            Random rand = new Random();
            int minValue = 1;
            int maxValue = 10;
            int lancerFilet = rand.nextInt(maxValue - minValue) + minValue;

            if (lancerFilet == 1) { //CHANGER VALEUR ICI
                System.out.println("Son filet attrape " + personnageCible.getNom() + " et il l'empale avec sa lance ! \n");
                personnageCible.setPointsDeVie(0);
                filetEnMain = false;
            } else {
                System.out.println("Le filet n'a pas atteint sa cible. \n");
            }
        }
        else {
        System.out.println(nom + " ramasse son filet et en profite pour attaquer.");
        filetEnMain = true;
                
        do {            
       
            dommages = attaqueCalcul() - personnageCible.valeurDefense;

        } while (dommages < 0);

        personnageCible.pointsDeVie -= dommages;

        if (personnageCible.pointsDeVie < 0) {
            personnageCible.pointsDeVie = 0;
        }
                
        System.out.println();
        System.out.println(this.nom + " attaque avec une puissance de : " + attaqueCalcul());
        System.out.println(personnageCible.nom + " a une défense de : " + personnageCible.valeurDefense);
        System.out.println("Les dommages sont donc de : " + dommages);
   
        }
    }
}