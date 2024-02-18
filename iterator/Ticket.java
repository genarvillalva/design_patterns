package iterator;

/**
 * A class that represents a Ticket of a task
 * @author Genar Villalva
 */
public class Ticket {

  private String name;
  private String teamMember;
  private int difficulty;

  /**
   * Ticket constructor that takes in name, teamMember, and difficulty as parameters
   * @param name the name of the task
   * @param teamMember the name of the team member
   * @param difficulty the difficulty of the task
   */
  public Ticket(String name, String teamMember, int difficulty) {
    this.name = name;
    this.teamMember = teamMember;
    this.difficulty = difficulty;
  }

  /**
   * returns the name of the task
   * @return the name of the task
   */
  public String getName() {
    return name;
  }

  /**
   * returns the ticket with the task name, difficulty, and team member
   */
  public String toString() {
    return name + "(" + difficulty + ") - " + teamMember;
  }
}
