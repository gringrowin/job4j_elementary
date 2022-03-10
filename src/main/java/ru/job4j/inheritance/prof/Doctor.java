package ru.job4j.inheritance.prof;

public class Doctor extends Profession {

    private int curedPatients;

    public Doctor(String name, String surname, String education, String birthday, int curedPatients) {
        super(name, surname, education, birthday);
        this.curedPatients = curedPatients;
    }

    public void heal(Patient patient) {
        if (!patient.isHealthy()) {
            patient.setHealthy(true);
            this.curedPatients++;
        }
    }
}
