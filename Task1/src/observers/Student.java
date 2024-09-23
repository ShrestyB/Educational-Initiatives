package observers;

import utils.LoggingUtility;

public class Student implements Observers {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        LoggingUtility.logInfo(name + " received update: " + message);
        System.out.println(name + " received update: " + message);
    }

    public String getName() {
        return name;
    }
}
