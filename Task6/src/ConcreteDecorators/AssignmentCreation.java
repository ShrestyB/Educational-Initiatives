package ConcreteDecorators;

import Base.User;
import Decorator.UserDecorator;

public class AssignmentCreation extends UserDecorator {
    public AssignmentCreation(User user) {
        super(user);
    }

    public void createAssignment() {
        System.out.println("Assignment created.");
    }

    @Override
    public void login() {

    }

    @Override
    public void logout() {

    }
}
