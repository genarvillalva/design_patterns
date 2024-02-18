package iterator;

import java.util.Iterator;

/**
 * A class representing the TaskList made of tickets
 * @author Genar Villalva
 */
public class TaskList {

  private Ticket[] tickets;
  private int count;
  private String name;

  /**
   * TaskList constructor "todo", "doing", or "done"
   * @param name
   */
  public TaskList(String name) {
    this.name = name;
    count = 0;
    this.tickets = new Ticket[100];
  }

  /**
   * adds a ticket to tickets array if it is not full
   * @param name the name of the ticket
   * @param teamMember the name of the team member
   * @param difficulty the difficulty of the task
   */
  public void addTicket(String name, String teamMember, int difficulty) {
    if (count == 100) {
      System.out.println(
        "Can't add task because there is too many tasks in Task List!"
      );
    } else {
      tickets[count] = (new Ticket(name, teamMember, difficulty));
      count++;
    }
  }

  /**
   * adds already existing ticket to tickets
   * @param ticket ticket to be added
   */
  public void addTicket(Ticket ticket) {
    if (count == 100) {
      System.out.println(
        "Can't add task because there is too many tasks in Task List!"
      );
    } else {
      tickets[count] = ticket;
      count++;
    }
  }

  /**
   * finds a ticket with matching name, returns it, removes it from the array, and decreases count by 1
   * @param name name of the ticket to be searched for
   * @return a ticket with the name if it was found, otherwise null
   */
  public Ticket getTicket(String name) {
    for (int i = 0; i < count; i++) {
      if (tickets[i].getName().toLowerCase().equals(name.toLowerCase())) {
        Ticket foundTicket = tickets[i];
        tickets = deleteItem(tickets, i);
        count--;
        return foundTicket;
      }
    }
    return null;
  }

  /**
   * removes a ticket from the tickets array
   * @param tickets tickets array
   * @param position position of the ticket to be removed
   * @return tickets array
   */

  private Ticket[] deleteItem(Ticket[] tickets, int position) {
    Ticket[] newTickets = new Ticket[100];
    for (int i = 0; i < position; i++) {
      newTickets[i] = tickets[i];
    }
    for (int i = position + 1; i < tickets.length && tickets[i] != null; i++) {
      newTickets[i - 1] = tickets[i];
    }
    return newTickets;
  }

  /**
   * creates an iterator object
   * @return a task list iterator object
   */
  public Iterator<Ticket> createIterator() {
    return new TaskListIterator(tickets);
  }

  /**
   * returns the string version of all of the tasks in a task list
   */
  public String toString() {
    String s = "";
    Iterator<Ticket> iterator = createIterator();
    //TaskList hello = iterator.next();
    while (iterator.hasNext()) {
      Ticket t = iterator.next();

      s = s + ("- " + t.toString() + "\n");
    }
    Ticket t = iterator.next();
    s = s + ("- " + t.toString() + "\n");
    return s;
  }
}
