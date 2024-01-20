package strategy;
import java.util.Random;
/**
 * A forward
 * @author Genar Villalva
 */
public class Forward extends Player{
    /*
     * Creates a new Forward with the indicated name 
     * @param the first and last name of the forward
     */
    public Forward(String firstName, String lastName) {
        super(firstName, lastName); 
        setDefenceBehavior();
        setOffenceBehavior();
    }
    /*
     * Sets Offence behavior to either passing or shooting with an equal chance for both
     */
    public void setOffenceBehavior() {
        Random rand1 = new Random();
        int randomIndex = rand1.nextInt(2);
        if(randomIndex == 0)
        {
            this.offenceBehavior = new PassBehavior();
        }
        else if(randomIndex == 1)
        {
            this.offenceBehavior = new ShootBehavior();
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
     * Creates a string representation of the forward
     * @return a string representation of the forward
     */
    public String toString() {
        return super.toString() + " plays the position: Forward";
    }
}
