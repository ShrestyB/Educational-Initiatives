import observers.Student;
import Subject.Teacher;
import utils.LoggingUtility;

public class Notification {

    public static void main(String[] args) {
        try {
            Teacher teacher = new Teacher();

            Student student1 = new Student("Shresty");
            Student student2 = new Student("Bohra");

            // Add observers
            teacher.addObserver(student1);
            teacher.addObserver(student2);

            // Set deadline
            teacher.setDeadline("21th Sept, 2024");

            // Remove one observer
            teacher.removeObserver(student2);

            // Update the deadline again
            teacher.setDeadline("23th Sept, 2024");

        } catch (Exception e) {
            LoggingUtility.logError("Error in notification system: ", e);
        }
    }
}
