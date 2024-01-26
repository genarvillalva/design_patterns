package decorator;

/**
 * A warrior
 * @author Genar Villalva
 */
public class Warrior extends Player {

  /**
   * Creates a warrior with said lines and a name
   * @param name name of the warrior
   */
  public Warrior(String name) {
    super(FileReader.getLines("decorator/txt/warrior.txt"), name);
  }
}
