package factory;

public class QuizQuestionFactory {

    public static QuizQuestion createQuestion(String type, String questionText, String[] options, int correctOption, boolean correctAnswer) {
        switch (type.toLowerCase()) {
            case "multiplechoice":
                return new MultipleChoiceQuestion(questionText, options, correctOption);
            case "truefalse":
                return new TrueFalseQuestion(questionText, correctAnswer);
            case "shortanswer":
                return new ShortAnswerQuestion(questionText);
            default:
                throw new IllegalArgumentException("Unknown question type: " + type);
        }
    }
}
