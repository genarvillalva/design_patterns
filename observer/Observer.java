package observer;

import java.util.ArrayList;

/**
 * An interface class that has the update and getLog function
 *
 * @author Genar Villalva
 */
public interface Observer {
  /**
   * Updates the location, description and accomplices of an observer
   *
   * @param location the location to be updated
   * @param description the description to be updated
   * @param accomplices the accomplices to be updated
   */
  public void update(
    String location,
    String description,
    ArrayList<String> accomplices
  );

  /**
   * Returns a string representation of what the observer saw
   *
   * @return A string representation of what the observer saw
   */
  public String getLog();
}
