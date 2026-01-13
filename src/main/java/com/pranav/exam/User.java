package com.pranav.exam;

import java.util.Scanner;

public class User {

    private String username;
    private String password;

    public User(String u, String p) {
        username = u;
        password = p;
    }

    public boolean authenticate(String u, String p) {
        return username.equals(u) && password.equals(p);
    }

    public void updateProfile(Scanner sc) {
        System.out.print("Enter new username: ");
        username = sc.nextLine();
        System.out.println("Profile updated.");
    }

    public void changePassword(Scanner sc) {
        System.out.print("Enter new password: ");
        password = sc.nextLine();
        System.out.println("Password updated.");
    }
}
