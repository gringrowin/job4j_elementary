package ru.job4j.inheritance.prof;

public class Builder extends Engineer {

    private int buildingsBuilt;

    public Builder(String name, String surname, String education, String birthday,
                   int projects, int buildingsBuilt) {
        super(name, surname, education, birthday, projects);
        this.buildingsBuilt = buildingsBuilt;
    }

    public Building build(Project project) {
        Building building = new Building(project.getName());
        buildingsBuilt++;
        building.setCompleted(true);
        return building;
    }
}
