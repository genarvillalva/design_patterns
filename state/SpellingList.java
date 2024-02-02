package state;

/**
 * A class that represents different lists of words to spell
 * @author Genar Villalva
 */
public class SpellingList {

  private State state;
  private FirstGradeState firstGradeState;
  private SecondGradeState secondGradeState;
  private ThirdGradeState thirdGradeState;

  /**
   * changes state accordingly
   */
  public SpellingList() {
    firstGradeState = new FirstGradeState(this);
    secondGradeState = new SecondGradeState(this);
    thirdGradeState = new ThirdGradeState(this);
    state = firstGradeState;
  }

  /**
   * returns the next word
   * @return the next word
   */
  public String getNextWord() {
    return state.getNextWord();
  }
  /*
   * increases grade level 
   */
  public void increaseGrade() {
    state.increaseGrade();
  }
  /*
   * decreases grade level
   */
  public void decreaseGrade() {
    state.decreaseGrade();
  }
  /**
   * returns firstGradeState 
   * @return firstGradeState
   */
  public State getFirstGradeState() {
    return firstGradeState;
  }
  /**
   * returns secondGradeState
   * @return secondGradeState
   */
  public State getSecondGradeState() {
    return secondGradeState;
  }
  /**
   * returns thirdGradeState
   * @return thirdGradeState
   */
  public State getThirdGradeState() {
    return thirdGradeState;
  }
  /*
   * sets state  
   */
  public void setState(State state) {
    this.state = state;
  }
}
