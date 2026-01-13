package com.pranav.exam;

public class Question {

    private final String question;
    private final String[] options;
    private final int correct;

    public Question(String q, String[] opt, int correctOption) {
        question = q;
        options = opt;
        correct = correctOption;
    }

    public void display() {
        System.out.println("\n" + question);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
        System.out.print("Answer: ");
    }

    public boolean isCorrect(int ans) {
        return ans == correct;
    }
}
