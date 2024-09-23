package adapter;

import model.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentAdapter implements ModernStudentDatabase {

    private LegacyStudentDatabase legacyStudentDatabase;

    public StudentAdapter(LegacyStudentDatabase legacyStudentDatabase) {
        this.legacyStudentDatabase = legacyStudentDatabase;
    }

    @Override
    public List<Student> getStudents() {
        List<String> legacyStudents = legacyStudentDatabase.getStudentsData();
        List<Student> modernStudents = new ArrayList<>();

        // Convert legacy format (String) to modern Student object
        for (String legacyStudent : legacyStudents) {
            String[] parts = legacyStudent.split(", ");
            int id = Integer.parseInt(parts[0]);
            String name = parts[1];
            String email = parts[2];
            modernStudents.add(new Student(id, name, email));
        }

        return modernStudents;
    }
}
