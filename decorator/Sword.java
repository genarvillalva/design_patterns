package decorator;

/**
 * A sword
 * @author Genar Villalva
 */
public class Sword extends PlayerDecorator {

  /**
   * creates a sword object for the player
   * @param player the player who will get the shield
   */
  Sword(Player player) {
    super(player);
    integrateDecor(FileReader.getLines("decorator/txt/sword.txt"));
  }
}
