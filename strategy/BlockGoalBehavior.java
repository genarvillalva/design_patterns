package strategy;
import java.util.Random;
/**
 * Behavior when the player blocks a goal on defence
 * @author Genar Villalva
 */
public class BlockGoalBehavior implements DefenceBehavior, OffenceBehavior {
    /*
     * Randomly chooses a string from an array of three strings representing players blocking the puck from going into the goal 
     * @return A String that represents an action blocking a goal from happening
     */
    public String play() {
        String[] blockGoalBehaviors = {"blocks puck with stick", "hand blocks the puck", "catches the puck"};
        Random random = new Random();
        int randomIndex = random.nextInt(3);
        return blockGoalBehaviors[randomIndex];
    }
}
