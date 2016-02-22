package ru.lesson.lessons.lesson_12;

/**
 * TODO: comment.
 */
public class Counter {
    private int amount;

    public synchronized int increase() {
        amount++;
        return amount;
    }

    public static synchronized void echo() {
    }
}
