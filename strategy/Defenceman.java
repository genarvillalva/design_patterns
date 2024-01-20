package strategy;

import java.util.Random;

/**
 * A defenceman
 * @author Genar Villalva
 */
public class Defenceman extends Player{
     /*
     * Creates a new Defenceman with the indicated name 
     * @param the first and last name of the defenceman
     */
    public Defenceman(String firstName, String lastName) {
        super(firstName, lastName);
        setDefenceBehavior();
        setOffenceBehavior();
    }
    /*
     * Sets Offence behavior to passing 90% of the time and shoot 10%
     */
    public void setOffenceBehavior() {
        Random rand1 = new Random();
        int randomIndex = rand1.nextInt(10);
        if(randomIndex == 0)
        {
            this.offenceBehavior = new SlapShotBehavior();
        }
        else {
            this.offenceBehavior = new PassBehavior();
        }
    }
    /*
     * Sets Defence behavior to either chasing or blocking the puck with an equal chance for both
     */
    public void setDefenceBehavior() {
        Random rand2 = new Random();
        int randomIndex = rand2.nextInt(2);
        if(randomIndex == 0)
        {
            this.defenceBehavior = new ChasePuckBehavior();
        }
        else if(randomIndex == 1)
        {
            this.defenceBehavior = new BlockBehavior();
        }
    }
    /*
     * Creates a string representation of the defenceman
     * @return a string representation of the defenceman
     */
    public String toString() {
        return super.toString() + " plays the position: Defenceman";
    }
}
