package state;
/**
 * A class that represents the first grade state 
 * @author Genar Villalva 
 */
public class FirstGradeState extends State{
    public FirstGradeState(SpellingList spellingList) {
        super(spellingList);
        words = FileReader.getWords("state/txt/first.txt");
    }
    @Override
    public void increaseGrade() {
        spellingList.setState(spellingList.getSecondGradeState());
    }
    /**
     * throws an exception
     */
    public void decreaseGrade() {
        System.out.print("You can't go below First Grade...");
    }
    
}
