import Base.User;
import Concerete.Admin;
import Concerete.Teacher;
import ConcreteDecorators.AssignmentCreation;
import ConcreteDecorators.AssignmentSubmission;
import ConcreteDecorators.GradingPermissions;
import utils.LoggerUtility;
import Concerete.Student;

public class Application {

    public static void main(String[] args) {
        try {
            System.out.println("Welcome to the Role-Based Access Control System");

            // Create a basic student user
            User student = new Student() {
                @Override
                public void createAssignment() {

                }
            };
            student.login();

            // Add assignment submission functionality to student
            AssignmentSubmission studentWithSubmission = new AssignmentSubmission(student);
            studentWithSubmission.submitAssignment();
            student.logout();

            System.out.println("\n-----------------------------\n");

            // Create a basic teacher user
            User teacher = new Teacher();
            teacher.login();

            // Add assignment creation and grading functionality to teacher
            AssignmentCreation teacherWithCreation = new AssignmentCreation(teacher);
            teacherWithCreation.createAssignment();

            GradingPermissions teacherWithGrading = new GradingPermissions(teacherWithCreation);
            teacherWithGrading.gradeAssignment();
            teacher.logout();

            System.out.println("\n-----------------------------\n");

            User admin = new Admin();
            admin.login();
            admin.logout();

            LoggerUtility.logInfo("Role-based actions were performed successfully.");

        } catch (Exception e) {
            LoggerUtility.logError("Error occurred in the role-based access control system.", e);
        }
    }
}
