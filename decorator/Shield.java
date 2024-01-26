package decorator;

/**
 * A shield
 * @author Genar Villalva
 */
public class Shield extends PlayerDecorator {

  /**
   * creates a shield object for the player
   * @param player the player who will get the shield
   */
  Shield(Player player) {
    super(player);
    integrateDecor(FileReader.getLines("decorator/txt/shield.txt"));
  }
}
