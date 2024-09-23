package factory;

import java.util.Scanner;

public class ShortAnswerQuestion extends QuizQuestion {

    public ShortAnswerQuestion(String questionText) {
        super(questionText);
    }

    @Override
    public void displayQuestion() {
        System.out.println("Short Answer Question: " + questionText);
    }

    @Override
    public void captureResponse() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your answer: ");
        userResponse = scanner.nextLine();
        System.out.println("You answered: " + userResponse);
    }
}
