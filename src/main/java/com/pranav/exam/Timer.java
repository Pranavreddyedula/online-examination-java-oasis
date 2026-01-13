package com.pranav.exam;

public class Timer extends Thread {

    private int seconds;
    private volatile boolean timeUp = false;

    public Timer(int seconds) {
        this.seconds = seconds;
    }

    public void run() {
        try {
            while (seconds > 0 && !isInterrupted()) {
                Thread.sleep(1000);
                seconds--;
            }
            if (seconds == 0) {
                timeUp = true;
            }
        } catch (InterruptedException e) {
            // Thread stopped safely
        }
    }

    public boolean isTimeUp() {
        return timeUp;
    }
}
