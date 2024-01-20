package strategy;

/**
 * Behavior when the player is passing the puck on offence
 * @author Genar Villalva
 */
public class PassBehavior implements OffenceBehavior {
     /*
     * Creates a string representation of a player passing the puck  
     * @return A String that represents the player passing the puck
     */
    public String play() {
        return "Passes to a forward";
    }
}
