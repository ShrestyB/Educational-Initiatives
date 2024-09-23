package adapter;

import model.Student;
import java.util.List;

public interface ModernStudentDatabase {
    List<Student> getStudents();
}
