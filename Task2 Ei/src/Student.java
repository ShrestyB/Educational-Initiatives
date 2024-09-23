import strategies.LetterGrading;
import utils.LoggerUtility;

public class Student {
    private String name;
    private double score;
    private GradingContext gradingContext;

    public Student(String name, double score, GradingContext gradingContext) {
        this.name = name;
        this.score = score;
        this.gradingContext = gradingContext;
    }

    public void displayGrade() {
        String grade = gradingContext.executeStrategy(score);
        LoggerUtility.logInfo(name + "'s grade is: " + grade);
        System.out.println(name + "'s grade is: " + grade);
    }

    public void changeGradingStrategy(LetterGrading newStrategy) {
        gradingContext.setStrategy(newStrategy);
    }
}
