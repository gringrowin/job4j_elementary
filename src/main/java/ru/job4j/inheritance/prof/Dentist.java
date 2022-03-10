package ru.job4j.inheritance.prof;

public class Dentist extends Doctor {

    private int teethRemoved;

    public Dentist(String name, String surname, String education, String birthday,
                   int curedPatients, int teethRemoved) {
        super(name, surname, education, birthday, curedPatients);
        this.teethRemoved = teethRemoved;
    }

    public void removed(Patient patient) {
        this.teethRemoved++;
        patient.setHealthy(true);
    }
}
