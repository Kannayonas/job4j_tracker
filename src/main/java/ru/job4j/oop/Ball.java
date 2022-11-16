package ru.job4j.oop;

public class Ball {
    public void tryRun(boolean condition) {
        if (condition == true) {
            System.out.println("Ball eaten");
        }
        System.out.println("Ball run");
    }
}
