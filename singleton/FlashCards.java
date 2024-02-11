package singleton;

import java.util.ArrayList;
import java.util.Random;

/**
 * Class that represents the Flashcards
 * @author Genar Villalva
 */
public class FlashCards {

  private Random rand = new Random();
  private static FlashCards flashCards;
  private ArrayList<Word> words;
  private Word currentWord;

  /**
   * sets the flashcards by populating the words arraylist
   */
  private FlashCards() {
    words = FileReader.getWords();
  }

  /**
   * gets an instance of the static flashcards object
   * and initializes it if it doesn't exist yet
   * @return FlashCards
   */
  public static FlashCards getInstance() {
    if (flashCards == null) {
      flashCards = new FlashCards();
    }
    return flashCards;
  }

  /**
   * randomly gets a word and its definition from words arraylist
   * @return word
   */
  public Word getWord() {
    int randomInt = rand.nextInt(words.size());
    currentWord = words.get(randomInt);
    words.remove(randomInt);
    return currentWord;
  }
}
