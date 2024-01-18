package observer;

import java.util.ArrayList;

/**
 * A subject class that represents whenever Heizenberg cooks
 * @author Genar Villalva
 */
public class Cook implements Subject{
    private ArrayList<Observer> observers;
    private String name = "";
    private String location;
    private String description;
    private String accomplices;
    /**
     * Creates a cook with the indicated name 
     * @param name of the cook 
     */
    public Cook(String name) {
        observers = new ArrayList<Observer>();
    }
    /**
     * Registers an observer to the observers ArrayList
     * @param Observer observer to be registered 
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    /**
     * Removes an observer from observer ArrayList
     * @param observer observer to be removed from the observers ArrayList
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    /**
     * notifies Observers whenever location, description, or accomplies gets added or changed
     * @param location the location that was added/changed
     * @param description the description that was added/changed
     * @param accomplices the accomplices that was added/changed
     */
    public void notifyObservers(String location, String description, ArrayList<String> accomplices) {
        for(Observer observer: observers) {
            observer.update(location, description, accomplices);
        }
    }
    
    public void enterSighting(String location, String description, String accomplices) {
        this.location = location;
        this.description = description;
        this.accomplices = accomplices;
        notifyObservers(location, description, accomplices);
    }


}
