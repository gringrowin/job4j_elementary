package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private int programsCompleted;

    public Programmer(String name, String surname, String education, String birthday,
                      int projects, int programsCompleted) {
        super(name, surname, education, birthday, projects);
        this.programsCompleted = programsCompleted;
    }

    public Program makeProgram(Project project) {
        Program program = new Program(project.getName());
        program.setCompleted(true);
        programsCompleted++;
        return program;
    }
}
