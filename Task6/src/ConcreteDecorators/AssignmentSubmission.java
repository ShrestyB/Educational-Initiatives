package ConcreteDecorators;

import Base.User;
import Decorator.UserDecorator;

public class AssignmentSubmission extends UserDecorator {
    public AssignmentSubmission(User user) {
        super(user);
    }

    public void submitAssignment() {
        System.out.println("Assignment submitted.");
    }

    @Override
    public void login() {

    }

    @Override
    public void logout() {

    }
}
