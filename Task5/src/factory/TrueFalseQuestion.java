package factory;

import java.util.Scanner;

public class TrueFalseQuestion extends QuizQuestion {
    private boolean correctAnswer; // Optional for feedback or validation

    public TrueFalseQuestion(String questionText, boolean correctAnswer) {
        super(questionText);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void displayQuestion() {
        System.out.println("True/False Question: " + questionText);
        System.out.println("1. True");
        System.out.println("2. False");
    }

    @Override
    public void captureResponse() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.print("Select an option (1 for True, 2 for False): ");
            choice = scanner.nextInt();
            if (choice == 1) {
                userResponse = "True";
                break;
            } else if (choice == 2) {
                userResponse = "False";
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        System.out.println("You selected: " + userResponse);

        // Optional: feedback for correct answer
        boolean userAnswer = userResponse.equals("True");
        if (userAnswer == correctAnswer) {
            System.out.println("Correct answer!");
        } else {
            System.out.println("Incorrect answer.");
        }
    }
}
