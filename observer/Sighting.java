package observer;

import java.util.ArrayList;

/**
 * Class that represents the cartel's sightings
 *
 * @author Genar Villalva
 */
public class Sighting {

  private String location;
  private String details;
  private ArrayList<String> accomplices = new ArrayList<String>();

  /**
   * Creates a sighting object with location, details, and accomplices
   *
   * @param location the location of the sighting
   * @param details what they did
   * @param accomplices the accomplice(s)
   */
  public Sighting(
    String location,
    String details,
    ArrayList<String> accomplices
  ) {
    this.location = location;
    this.details = details;
    this.accomplices = accomplices;
  }

  public String getLocation() {
    return location + " ";
  }

  public String getDetails() {
    return "(" + details + "), ";
  }

  public String getAccomplices() {
    String acc = "";
    for (String s : accomplices) {
      acc += s;
    }
    return "with " + acc + "\n";
  }
}
