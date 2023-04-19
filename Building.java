package WYWM_Java_Project;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private String name;
    private String buildingType;
    private List<Villager> villagers;

    // This is a constructor method that initializes a new Building object with the
    // given name and building type
    public Building(String name, String buildingType) {
        this.name = name;
        this.buildingType = buildingType;
        this.villagers = new ArrayList<>(); // Initialize the list of villagers with an empty ArrayList
    }

    // This is a constructor method that initializes a new Building object with a
    // default "generic" building type
    public Building(String name) {
        this(name, "generic"); // Calls the constructor above with "generic" as the default building type
    }

    // This is a getter method that returns the name of the building
    public String getName() {
        return name;
    }

    // This is a getter method that returns the building type of the building
    public String getBuildingType() {
        return buildingType;
    }

    // This is a getter method that returns the list of villagers that reside in the
    // building
    public List<Villager> getVillagers() {
        return villagers;
    }

    // This is a method that adds a new villager to the list of villagers that
    // reside in the building
    public void addVillager(Villager villager) {
        villagers.add(villager);
    }
}
