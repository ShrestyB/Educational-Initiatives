package factory;

import java.util.Scanner;

public abstract class QuizQuestion {
    protected String questionText;
    protected String userResponse;

    public QuizQuestion(String questionText) {
        this.questionText = questionText;
    }

    public abstract void displayQuestion();

    // Method for capturing user response
    public abstract void captureResponse();

    public String getQuestionText() {
        return questionText;
    }

    public String getUserResponse() {
        return userResponse;
    }
}
