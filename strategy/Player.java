package strategy;
import java.util.Random;
/**
 * A Hockey Player
 * @author Genar Villalva
 */
public abstract class Player {
    private String firstName;
    private String lastName;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;
    protected Random rand;
    /**
     * Creates a new player with said first and last name  
     * @param firstName first name of the player
     * @param lastName last name of the player
     */
    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public abstract void setDefenceBehavior();
    public abstract void setOffenceBehavior();
    /**
     * Creates a string representation of an offencive or a defencive play 
     * @param possession boolean that says if team has possesion of puck 
     * @return A string that represents a either a defencive or an offensive play 
     */
    public String play(boolean possession) {
        if(this.offenceBehavior == null){
            return null;
        }
        else {
            if(possession == true){
                setOffenceBehavior();
                return this.offenceBehavior.play();
            }
            else {
                setDefenceBehavior();
                return this.defenceBehavior.play();
            }
        }
    }
    /**
     * Creates a string representation of the hockey player 
     * @return A string version of the hockey player letting them know of their first and last name 
     */
    public String toString() {
        return firstName +" " + lastName;
    }
}
