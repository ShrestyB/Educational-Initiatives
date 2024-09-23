import strategies.GradingStrategy;
import utils.LoggerUtility;

public class GradingContext {
    private GradingStrategy strategy;

    public GradingContext(GradingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(GradingStrategy strategy) {
        this.strategy = strategy;
        LoggerUtility.logInfo("Grading strategy changed to: " + strategy.getClass().getSimpleName());
    }

    public String executeStrategy(double score) {
        return strategy.grade(score);
    }
}
