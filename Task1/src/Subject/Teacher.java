package Subject;

import observers.Observers;

import utils.LoggingUtility;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements Subject {
    private List<Observers> students = new ArrayList<>();
    private String deadline;

    @Override
    public void addObservers(Observers Observers) {
        if (Observers != null) {
            students.add(Observers);
            LoggingUtility.logInfo("Added student: " + ((observers.Student) Observers).getName());
        } else {
            LoggingUtility.logError("Failed to add Observers: null", new IllegalArgumentException());
        }
    }

    @Override
    public void removeObservers(Observers Observers) {
        if (students.remove(Observers)) {
            LoggingUtility.logInfo("Removed student: " + ((observers.Student) Observers).getName());
        } else {
            LoggingUtility.logError("Failed to remove Observers: Not found", new IllegalArgumentException());
        }
    }

    @Override
    public void addObserver(Observers observer) {

    }

    @Override
    public void removeObserver(Observers observer) {

    }

    @Override
    public void notifyObservers(String message) {
        for (Observers student : students) {
            student.update(message);
        }
    }

    public void setDeadline(String newDeadline) {
        this.deadline = newDeadline;
        LoggingUtility.logInfo("New deadline set: " + newDeadline);
        notifyObservers("The new assignment deadline is: " + newDeadline);
    }

    public String getDeadline() {
        return deadline;
    }
}
