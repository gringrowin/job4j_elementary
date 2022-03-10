package ru.job4j.inheritance.prof;

public class Surgeon extends Doctor {

    private int operations;

    public Surgeon(String name, String surname, String education, String birthday,
                   int curedPatients, int operations) {
        super(name, surname, education, birthday, curedPatients);
        this.operations = operations;
    }

    public void operation(Patient patient) {
        this.operations++;
        patient.setHealthy(true);
    }
}
