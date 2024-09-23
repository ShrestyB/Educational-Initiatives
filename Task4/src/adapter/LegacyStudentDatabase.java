package adapter;

import java.util.ArrayList;
import java.util.List;

public class LegacyStudentDatabase {

    public List<String> getStudentsData() {
        // Simulate getting student data in an older format (e.g., a list of strings)
        List<String> legacyStudents = new ArrayList<>();
        legacyStudents.add("1, Shresty Bohra, shresty73@mail.com");
        legacyStudents.add("2, XYZ, xyz@mail.com");
        return legacyStudents;
    }
}
