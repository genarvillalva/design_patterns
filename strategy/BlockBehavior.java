package strategy;
import java.util.Random;

/**
 * Blocking actions when the players are on defence
 * @author Genar Villalva 
 */
public class BlockBehavior implements DefenceBehavior {
    /*
     * Randomly Chooses a string from an array of three strings representing blocking actions  
     * @return A String that represents a blocking action
     */
    public String play() {
        String[] blockBehaviors = {"blocks player from passing", "blocks player from shooting", "checks player with puck"};
        Random random = new Random();
        int randomIndex = random.nextInt(3);
        return blockBehaviors[randomIndex];
    }
    
}
