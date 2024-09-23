package ConcreteDecorators;

import Base.User;
import Decorator.UserDecorator;

public class GradingPermissions extends UserDecorator {
    public GradingPermissions(User user) {
        super(user);
    }

    public void gradeAssignment() {
        System.out.println("Assignment graded.");
    }

    @Override
    public void login() {

    }

    @Override
    public void logout() {

    }
}
