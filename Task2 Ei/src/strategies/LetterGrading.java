package strategies;

public class LetterGrading implements GradingStrategy {
    @Override
    public String grade(double score) {
        score=score/25;
        if (score >= 3.5) {
            return "A";
        } else if (score >= 3.0) {
            return "B";
        } else if (score >= 2.5) {
            return "C";
        } else if (score >= 2.0) {
            return "D";
        } else {
            return "F";
        }
    }
}
