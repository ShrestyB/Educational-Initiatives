package Concerete;

import Base.User;

public class Teacher implements User {
    @Override
    public void login() {
        System.out.println("Teacher logged in.");
    }

    @Override
    public void logout() {
        System.out.println("Teacher logged out.");
    }

    @Override
    public void createAssignment() {

    }
}
