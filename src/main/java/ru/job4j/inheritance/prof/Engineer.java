package ru.job4j.inheritance.prof;

public class Engineer extends Profession {

    private int projects;

    public Engineer(String name, String surname, String education, String birthday, int projects) {
        super(name, surname, education, birthday);
        this.projects = projects;
    }

    public void makeProject(Project project) {
        if (!project.isCompleted()) {
            project.setCompleted(true);
            this.projects++;
        }
    }
}
