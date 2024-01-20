package observer;

import java.util.ArrayList;

/**
 * Class that represents the Police
 *
 * @author Genar Villalva
 */
public class Police implements Observer {

  private Subject cook;
  private ArrayList<String> locations = new ArrayList<String>();
  private String notes = "";
  private ArrayList<String> people = new ArrayList<String>();

  /**
   * Creates a police object that is registered to receive updates from the cook
   *
   * @param cook The cook is the subject of the police
   */
  public Police(Subject cook) {
    this.cook = cook;
    cook.registerObserver(this);
  }

  /**
   * updates the police log with new locations, descriptions, and accomplices
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
    locations.add(location);
    notes = notes.concat("- " + description + "\n");
    ArrayList<String> uniqueList = new ArrayList<String>();
    ArrayList<String> peopleList = new ArrayList<String>();
    // SPLIT THROUGH THE INPUT ARRAYLIST BY , AND PUT IT IN peopleList araylist
    for (String acc : accomplices) {
      String[] temp = acc.split(", ");
      for (String t : temp) {
        peopleList.add(t);
      }
    }
    // PARSE THROUGH THE PEOPLE ARRAY LIST CHECK IF ITEM IN uniqueLIST is THERE AND IF NOT ADD
    // IT TO PEOPLE LIST
    for (String s : peopleList) {
      if (!(people.contains(s))) {
        uniqueList.add(s);
      }
    }
    people.addAll(uniqueList);
  }

  /**
   * Prints out the police's notes
   *
   * @returns the notes of the police regarding locations, descriptions, and accomplices
   */
  public String getLog() {
    String log = "Locations:\n";
    for (String location : locations) {
      log = log + "- " + location + "\n";
    }
    log = log + "\n " + "Notes: \n" + notes + "\n" + "Accomplices: \n";
    for (String person : people) {
      log = log + "- " + person + "\n";
    }
    return log;
  }
}
