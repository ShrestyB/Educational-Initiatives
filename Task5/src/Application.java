import factory.*;
import utils.LoggerUtility;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Welcome to the Quiz System!");

            // Create and display a Multiple Choice Question
            String[] mcqOptions = {"1", " 2", "3", " 4"};
            QuizQuestion multipleChoice = QuizQuestionFactory.createQuestion("multiplechoice", "What is 2 + 2?", mcqOptions, 4, false);
            multipleChoice.displayQuestion();
            multipleChoice.captureResponse(); // Capture and validate the user response

            // Create and display a True/False Question
            QuizQuestion trueFalse = QuizQuestionFactory.createQuestion("truefalse", "The Earth is flat.", null, 0, false);
            trueFalse.displayQuestion();
            trueFalse.captureResponse(); // Capture and validate the user response

            // Create and display a Short Answer Question
            QuizQuestion shortAnswer = QuizQuestionFactory.createQuestion("shortanswer", "Explain the theory of relativity.", null, 0, false);
            shortAnswer.displayQuestion();
            shortAnswer.captureResponse(); // Capture user input for short answer question

            // Log that the quiz was successfully completed
            LoggerUtility.logInfo("Quiz questions were answered successfully.");

        } catch (Exception e) {
            // Log any errors that occur during quiz creation or answering
            LoggerUtility.logError("Error occurred while creating or answering quiz questions.", e);
        }
    }
}
