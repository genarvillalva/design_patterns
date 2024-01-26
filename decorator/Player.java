package decorator;

import java.util.ArrayList;

/**
 * A video game character interface
 * @author Genar Villalva
 */
public abstract class Player {

  protected String name;
  protected ArrayList<String> lines;

  /**
   * Creates a player object that with lines and a name
   * @param lines the lines to be printed
   * @param name the name of the player
   */
  public Player(ArrayList<String> lines, String name) {
    this.lines = lines;
    this.name = name;
  }

  /**
   * returns player's name
   * @return name of player
   */
  public String getName() {
    return name;
  }

  /**
   * Creates a String representation of the warrior
   * @returns a string representation of the warrior
   */
  public String toString() {
    String linesToBePrinted = new String();
    linesToBePrinted += "##### " + getName() + " ##### \n";
    for (String line : lines) {
      linesToBePrinted += (line + "\n");
    }
    return linesToBePrinted;
  }
}
