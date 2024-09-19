
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
}
