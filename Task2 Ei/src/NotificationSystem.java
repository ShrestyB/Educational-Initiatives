import strategies.PercentageGrading;
import strategies.LetterGrading;

public class NotificationSystem {

    public static void main(String[] args) {
        GradingContext context = new GradingContext(new PercentageGrading());

        Student student1 = new Student("Raj", 85.0, context);
        Student student2 = new Student("Simran", 65.0, context);

        // Display grades using Percentage Grading
        student1.displayGrade();
        student2.displayGrade();

        // Change grading strategy to Letter Grading
        student1.changeGradingStrategy(new LetterGrading());
        student2.changeGradingStrategy(new LetterGrading());

        // Display grades using Letter Grading
        student1.displayGrade();
        student2.displayGrade();

    }
}
