package com.pranav.exam;

import java.util.*;

public class ExamSystem {

    private final Scanner sc = new Scanner(System.in);
    private final User user = new User("pranav", "1234");
    private final List<Question> questions = new ArrayList<>();

    public ExamSystem() {
        questions.add(new Question(
                "Java is ___ language?",
                new String[]{"Low-level", "High-level", "Machine", "Assembly"},
                2
        ));
        questions.add(new Question(
                "Which keyword is used to inherit a class?",
                new String[]{"this", "super", "extends", "implements"},
                3
        ));
    }

    public void start() {
        System.out.println("=== ONLINE EXAMINATION SYSTEM ===");

        if (login()) {
            menu();
        } else {
            System.out.println("Invalid login. Exiting...");
        }
    }

    private boolean login() {
        System.out.print("Enter Username: ");
        String u = sc.nextLine();
        System.out.print("Enter Password: ");
        String p = sc.nextLine();
        return user.authenticate(u, p);
    }

    private void menu() {
        int choice;
        do {
            System.out.println("\n1. Update Profile");
            System.out.println("2. Change Password");
            System.out.println("3. Start Exam");
            System.out.println("4. Logout");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> user.updateProfile(sc);
                case 2 -> user.changePassword(sc);
                case 3 -> startExam();
                case 4 -> System.out.println("Logged out successfully.");
                default -> System.out.println("Invalid option.");
            }
        } while (choice != 4);
    }

    private void startExam() {
        Timer timer = new Timer(60); // 60 seconds
        timer.start();

        int score = 0;

        for (Question q : questions) {
            if (timer.isTimeUp()) break;
            q.display();
            int ans = sc.nextInt();
            if (q.isCorrect(ans)) score++;
        }

        timer.stop();
        System.out.println("\nExam Auto-Submitted!");
        System.out.println("Your Score: " + score + "/" + questions.size());
    }
}
