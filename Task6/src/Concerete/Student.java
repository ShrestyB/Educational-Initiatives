package Concerete;

import Base.User;

public abstract class Student implements User {
    @Override
    public void login() {
        System.out.println("Student logged in.");
    }

    @Override
    public void logout() {
        System.out.println("Student logged out.");
    }
}
