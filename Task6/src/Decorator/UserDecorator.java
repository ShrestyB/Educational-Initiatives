package Decorator;

import Base.User;

public abstract class UserDecorator implements User {
    protected User user;

    public UserDecorator(User user) {
        this.user = user;
    }

    @Override
    public void createAssignment() {
        user.createAssignment();
    }
}
