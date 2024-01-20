package strategy;

/**
 * Behavior when the player slapshots the puck on offence
 * @author Genar Villalva
 */
public class SlapShotBehavior implements OffenceBehavior {
    /*
     * Creates a string representation of a player shooting the puck from the blue line  
     * @return A String that represents the player shooting the puck from the blue line 
     */
    public String play() {
        return "Shoots the puck from the blue line";
    }
}
