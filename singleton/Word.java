package singleton;

/**
 * A class that represents a word and its description
 * @author Genar Villalva
 */
public class Word {

  private String word;
  private String type;
  private String definition;
  private String sentence;

  /**
   * Constructs Word object
   * @param word a word
   * @param type the word's type
   * @param definition the word's definition
   * @param sentence the word's sentnece
   */
  public Word(String word, String type, String definition, String sentence) {
    this.word = word;
    this.type = type;
    this.definition = definition;
    this.sentence = sentence;
  }

  /**
   * returns word
   * @return word
   */
  public String getWord() {
    return word;
  }

  /**
   * returns the word's description
   * @return word's description
   */
  public String getDescription() {
    return (
      "Part of speech: " +
      type +
      "\nDefinition: " +
      definition +
      "\n" +
      sentence
    );
  }
}
