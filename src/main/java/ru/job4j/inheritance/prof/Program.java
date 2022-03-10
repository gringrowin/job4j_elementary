package ru.job4j.inheritance.prof;

public class Program {
    private String name;
    private boolean completed;

    public Program(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
