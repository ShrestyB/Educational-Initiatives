package Concerete;

import Base.User;

public class Admin implements User {
    @Override
    public void login() {
        System.out.println("Admin logged in.");
    }

    @Override
    public void logout() {
        System.out.println("Admin logged out.");
    }

    @Override
    public void createAssignment() {

    }
}
