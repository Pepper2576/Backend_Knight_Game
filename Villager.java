package WYWM_Java_Project;

public class Villager {
    private String name;
    private String profession;
    private Building assignedBuilding;

    public Villager(String name, String profession) {
        this.name = name;
        this.profession = profession;
    }

    // This is a getter method that returns the name of the villager
    public String getName() {
        return name;
    }

    // This is a getter method that returns the profession of the villager
    public String getProfession() {
        return profession;
    }

    // This is a getter method that returns the assigned building of the villager
    public Building getAssignedBuilding() {
        return assignedBuilding;
    }

    // This is a setter method that sets the assigned building of the villager
    public void setAssignedBuilding(Building building) {
        assignedBuilding = building;
    }
}
