package observer;

import java.util.ArrayList;

/**
 * A subject interface class
 *
 * @author Genar Villalva
 */
public interface Subject {
  /**
   * Registers an observer into the observers ArrayList
   *
   * @param observer The observer to be registered
   */
  public void registerObserver(Observer observer);

  /**
   * Removes an observer from the observers ArrayList
   */
  public void removeObserver(Observer observer);

  /**
   * Notifies every observer when a location, description, and/or the accomplices gets added
   *
   * @param location the location that gets added
   * @param description the description that gets added
   * @param accomplices the accomplices that gets added
   */
  public void notifyObservers(
    String location,
    String description,
    ArrayList<String> accomplices
  );
}
