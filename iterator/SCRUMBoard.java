package iterator;

/**
 * SCRUMBoard Class
 * @author Genar Villalva
 */
public class SCRUMBoard {

  private String projectName;
  private TaskList todo;
  private TaskList doing;
  private TaskList done;

  /**
   * creates SCRUMBoard constructor with a name
   * @param projectName the name of the SCRUMBoard
   */
  public SCRUMBoard(String projectName) {
    this.projectName = projectName;
    this.todo = new TaskList(projectName);
    this.doing = new TaskList(projectName);
    this.done = new TaskList(projectName);
  }

  /**
   * adds a ticket to the todolist tasklist
   * @param name name of the task
   * @param teamMember name of the team member
   * @param difficulty difficulty
   */
  public void addTicket(String name, String teamMember, int difficulty) {
    todo.addTicket(name, teamMember, difficulty);
  }

  /**
   * removes ticket from todo and adds it to doing
   * @param name name of the ticket
   * @return boolean
   */
  public boolean startTicket(String name) {
    Ticket s = todo.getTicket(name);
    if (s == null) {
      return false;
    }
    doing.addTicket(s);
    return true;
  }

  /**
   * removes ticket from doing and adds it to done
   * @param name name of the ticket
   * @return boolean
   */
  public boolean finishTicket(String name) {
    Ticket s = doing.getTicket(name);
    if (s == null) {
      return false;
    }
    done.addTicket(s);
    return true;
  }

  /**
   * String representation of the scrum board
   */
  public String toString() {
    return (
      "*****" +
      projectName +
      "*****\n" +
      "ToDo:\n" +
      todo.toString() +
      "\n" +
      "Doing\n" +
      doing.toString() +
      "\n" +
      "Done:\n" +
      done.toString()
    );
  }
}
