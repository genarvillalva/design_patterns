package decorator;

/**
 * An armor
 * @author Genar Villalva
 */
public class Armor extends PlayerDecorator {

  /**
   * creates an armor object for the player
   * @param player the player who will get the armor
   */
  Armor(Player player) {
    super(player);
    integrateDecor(FileReader.getLines("decorator/txt/armor.txt"));
  }
}
