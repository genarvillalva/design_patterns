package strategy;

/**
 * Behavior when the player is shooting the puck on offence
 * @author Genar Villalva
 */
public class ShootBehavior implements OffenceBehavior {
     /*
     * Creates a string representation of a player shooting the puck  
     * @return A String that represents the player shooting the puck
     */
    public String play() {
        return "Shoots at the goal";
    }
}
