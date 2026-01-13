package com.pranav.exam;

public class Timer extends Thread {

    private int seconds;
    private boolean timeUp = false;

    public Timer(int seconds) {
        this.seconds = seconds;
    }

    public void run() {
        try {
            while (seconds > 0) {
                Thread.sleep(1000);
                seconds--;
            }
            timeUp = true;
        } catch (InterruptedException ignored) {}
    }

    public boolean isTimeUp() {
        return timeUp;
    }
}
