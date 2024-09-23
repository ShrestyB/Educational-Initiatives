import adapter.LegacyStudentDatabase;
import adapter.StudentAdapter;
import model.Student;
import utils.LoggerUtility;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        // Create an instance of the legacy student database
        LegacyStudentDatabase legacyDB = new LegacyStudentDatabase();

        // Use the adapter to integrate legacy data into the modern system
        StudentAdapter adapter = new StudentAdapter(legacyDB);

        // Get the modern student data through the adapter
        List<Student> students = adapter.getStudents();

        // Log and display the student data
        for (Student student : students) {
            LoggerUtility.logInfo(student.toString());
            System.out.println(student);
        }
    }
}
