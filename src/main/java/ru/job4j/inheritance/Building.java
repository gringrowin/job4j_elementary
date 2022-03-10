package ru.job4j.inheritance;

public class Building {
    private String name;
    private boolean completed;

    public Building(String name) {
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
