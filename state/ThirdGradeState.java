package state;
/**
 * A class that represents the second grade state
 * @author Genar Villalva
 */
public class ThirdGradeState extends State{
    /**
     * constructs a third grade state object with its own spellingList
     * @param spellingList spellingList of the third grade
     */
    public ThirdGradeState(SpellingList spellingList) {
        super(spellingList);
        words = FileReader.getWords("state/txt/third.txt");
    }
    /**
     * Prints out an exception 
     */
    public void increaseGrade() {
        System.out.println("Sorry, we currently only have up to third grade in our system...");
    }
    public void decreaseGrade() {
        spellingList.setState(spellingList.getSecondGradeState());

    }
}
