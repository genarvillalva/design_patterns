package strategy;

/**
 * A goalie
 * @author Genar Villalva
 */
public class Goalie extends Player{
    /*
     * Creates a new Goalie with the indicated name 
     * @param the first and last name of the goalie
     */
    public Goalie(String firstName, String lastName){
        super(firstName, lastName);
        setDefenceBehavior();
        setOffenceBehavior();
    }
    /*
     * sets the offence behavior of the goalie to blocking goal behavior
     */
    public void setOffenceBehavior() {
        offenceBehavior = new BlockGoalBehavior();
    }
    /*
     * sets the defence behavior of the goalie to blocking goal behavior
     */
    public void setDefenceBehavior() {
        defenceBehavior = new BlockGoalBehavior();
    }
    /*
     * creates a String representation of the goalie
     * @return a string representation of the goalie 
     */
    public String toString() {
        return super.toString() + " plays the position: Goalie";
    }
}
