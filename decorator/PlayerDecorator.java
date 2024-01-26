package decorator;

import java.util.ArrayList;

/**
 * Player Decorator Absract Class
 * @author Genar Villalva
 */
public abstract class PlayerDecorator extends Player {

  private Player player;

  /**
   * Constructs a player decorator object
   * @param player the player that is being decorated
   */
  public PlayerDecorator(Player player) {
    super(player.lines, player.getName());
  }

  /**
   * adds decor to lines
   * @param decor decor to be added to lines
   */
  protected void integrateDecor(ArrayList<String> decor) {
    for (int i = 0; i < decor.size(); i++) {
      String decorString = decor.get(i);
      String linesString = lines.get(i);
      lines.set(i, combineString(linesString, decorString));
    }
  }

  /**
   * combines the non space characters of decor onto lines
   * @param lines string lines
   * @param decor string decor
   * @return a string that is the combination of lines and decor
   */
  private String combineString(String line, String decor) {
    StringBuilder combinedString = new StringBuilder(line);
    int minLength = Math.min(line.length(), decor.length());
    for (int i = 0; i < minLength; i++) {
      if ((line.charAt(i) != decor.charAt(i)) && decor.charAt(i) != ' ') {
        combinedString.setCharAt(i, decor.charAt(i));
      }
    }
    if (decor.length() > line.length()) {
      combinedString.append(decor.substring(line.length()));
    }
    return combinedString + "";
  }
}
