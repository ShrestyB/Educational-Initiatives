package factory;

import java.util.Scanner;

public class MultipleChoiceQuestion extends QuizQuestion {
    private String[] options;
    private int correctOption; // Optional for feedback or validation

    public MultipleChoiceQuestion(String questionText, String[] options, int correctOption) {
        super(questionText);
        this.options = options;
        this.correctOption = correctOption;
    }

    @Override
    public void displayQuestion() {
        System.out.println("Multiple Choice Question: " + questionText);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    @Override
    public void captureResponse() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.print("Select an option (1-" + options.length + "): ");
            choice = scanner.nextInt();
            if (choice >= 1 && choice <= options.length) {
                userResponse = options[choice - 1];
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        System.out.println("You selected: " + userResponse);

        // Optional: feedback for correct answer
        if (choice == correctOption) {
            System.out.println("Correct answer!");
        } else {
            System.out.println("Incorrect answer.");
        }
    }
}
