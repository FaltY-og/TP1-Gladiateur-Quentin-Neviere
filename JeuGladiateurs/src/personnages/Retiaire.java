
package personnages;



public class Retiaire extends Personnage {

    public Retiaire(String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
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
    
}
