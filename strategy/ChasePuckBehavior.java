package strategy;
/**
 * Behavior when the player is chasing the puck on defence
 * @author Genar Villalva
 */
public class ChasePuckBehavior implements DefenceBehavior {
    /**
     * Creates a string representation of a player chasing the puck  
     * @return A String that represents the player chasing the puck
     */
    public String play() {
        return "Chases the puck";
    }
}