package observer;

import java.util.ArrayList;

/**
 * A subject class that represents the cartel
 *
 * @author Genar Villalva
 */
public class Cartel implements Observer {

  private Subject cook;
  private ArrayList<Sighting> sightings = new ArrayList<Sighting>();

  /**
   * Creates cartel object that registers cook as the subject
   *
   * @param cook the cook to be registered as the subject of the cartel
   */
  public Cartel(Subject cook) {
    this.cook = cook;
    cook.registerObserver(this);
  }

  /**
   * updates the cartel's sightings with new locations, descriptions, and accomplice(s)
   *
   * @param location the location of where heizenberg was seen
   * @param description the description of what they were doing
   * @param accomplices the accomplices that was seen at the scene
   */
  public void update(
    String location,
    String description,
    ArrayList<String> accomplices
  ) {
    Sighting temp = new Sighting(location, description, accomplices);
    sightings.add(temp);
  }

  /**
   * Prints out the cartel's notes
   *
   * @returns the notes of the police regarding locations, descriptions, and accomplices
   */
  public String getLog() {
    String log = "";
    for (Sighting s : sightings) {
      log += (s.getLocation() + s.getDetails() + s.getAccomplices());
    }
    return log;
  }
}
