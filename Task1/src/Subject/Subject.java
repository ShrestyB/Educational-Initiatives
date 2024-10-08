package Subject;

import observers.Observers;

public interface Subject {
   

    void addObservers(Observers observer);
    void removeObservers(Observers observer);
    void notifyObservers(String message);
}
