package ru.job4j.inheritance.prof;

public class Patient {

    private String name;
    private String diagnosis;
    private boolean healthy;

    public Patient(String name, String diagnosis, boolean healthy) {
        this.name = name;
        this.diagnosis = diagnosis;
        this.healthy = healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    public String getName() {
        return name;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public boolean isHealthy() {
        return healthy;
    }
}
