package Subject;

import observers.Observers;

public interface Subject {
    void addObservers(Observers Observers);

    void removeObservers(Observers Observers);

    void addObserver(Observers observer);
    void removeObserver(Observers observer);
    void notifyObservers(String message);
}
