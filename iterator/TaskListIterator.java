package iterator;

import java.util.Iterator;

/*
 * A class that represents a task list iterator
 * @author Genar Villalva
 */
public class TaskListIterator implements Iterator {

  private Ticket[] tickets;
  private int position = 0;

  /**
   * task list iterator contstructor
   */
  public TaskListIterator(Ticket[] tickets) {
    this.tickets = tickets;
  }

  /**
   * returns if the next item in an array is null or not
   * @return boolean
   */
  public boolean hasNext() {
    return position < tickets.length && tickets[position + 1] != null;
  }

  /**
   * returns the next ticket in tickets arraylist
   * @return next ticket
   */
  public Ticket next() {
    Ticket t = tickets[position];
    position++;
    return t;
  }
}
