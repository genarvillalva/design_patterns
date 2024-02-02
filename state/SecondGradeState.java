package state;

/**
 * A class that represents the second grade state
 * @author Genar Villalva
 */
public class SecondGradeState extends State {

  /**
   * Constructs a second grade state object with its own spellingList
   * @param spellingList the spellingList for second grade
   */
  public SecondGradeState(SpellingList spellingList) {
    super(spellingList);
    words = FileReader.getWords("state/txt/second.txt");
  }

  /**
   * increases the grade to third grade
   */
  public void increaseGrade() {
    spellingList.setState(spellingList.getThirdGradeState());
}

  /**
   * decreases the grade to first grade
   */
  public void decreaseGrade() {
    spellingList.setState(spellingList.getFirstGradeState());
}
}
