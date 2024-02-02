package state;

import java.util.ArrayList;
import java.util.Random;

/**
 * A class that represents abstract for the grade states
 * @author Genar Villalva
 */
public abstract class State {

  protected SpellingList spellingList;
  protected ArrayList<String> words = new ArrayList<>();
  private Random rand = new Random();

  /**
   * Sets the spelling list
   * @param spellingList spelling list to be set
   */
  public State(SpellingList spellingList) {
    this.spellingList = spellingList;
  }

  /**
   * returns the next word from the words list
   * @return the next word
   */
  public String getNextWord() {
    return words.get(rand.nextInt(words.size()));
  }

  /**
   * increases grade
   */
  public abstract void increaseGrade();

  /**
   * decreases grade
   */
  public abstract void decreaseGrade();
}
