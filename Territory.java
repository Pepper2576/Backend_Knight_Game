package WYWM_Java_Project;

import java.util.ArrayList;
import java.util.List;

public class Territory {
    // This is a private member variable which stores the name of the territory.
    private String name;

    // This is a private member variable which stores a list of all the buildings in
    // the territory.
    private List<Building> buildings = new ArrayList<>();

    // This is a private member variable which stores a list of all the villagers in
    // the territory.
    private List<Villager> villagers = new ArrayList<>();

    // This is a constructor method for creating a new territory with a given name.
    public Territory(String name) {
        this.name = name;
    }

    // This method returns the name of the territory.
    public String getName() {
        return name;
    }

    // This method returns a list of all the buildings in the territory.
    public List<Building> getBuildings() {
        return buildings;
    }

    // This method adds a new building to the list of buildings in the territory.
    public void addBuilding(Building building) {
        buildings.add(building);
    }

    // This method returns a list of all the villagers in the territory.
    public List<Villager> getVillagers() {
        return villagers;
    }

    // This method adds a new villager to the list of villagers in the territory.
    public void addVillager(Villager villager) {
        villagers.add(villager);
    }

    // This method assigns a villager to a building in the territory.
    // It takes a villager and a building as arguments.
    public void assignVillagerToBuilding(Villager villager, Building building) {
        building.addVillager(villager);
    }

    public void printStructure() {
        System.out.println("Territory: " + name);

        // Iterate over all the buildings in the territory.
        for (Building building : buildings) {
            // Print the name of the building.
            System.out.println("- Building: " + building.getName());

            // Get a list of villagers assigned to the building.
            List<Villager> villagers = building.getVillagers();

            // If there are no villagers assigned to the building, print a message to
            // indicate this.
            if (villagers.isEmpty()) {
                System.out.println("  - No villagers assigned to this building");
            }
            // Otherwise, print a list of all the villagers assigned to the building,
            // including their name and profession.
            else {
                System.out.println("  - Villagers assigned to this building:");
                for (Villager villager : villagers) {
                    System.out.println("    - " + villager.getName() + " (" + villager.getProfession() + ")");
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Territory: " + name + "\n");

        // Add the name of the territory to the string.
        sb.append("Territory: " + name + "\n");

        // Add the list of buildings in the territory to the string.
        sb.append("Buildings:\n");
        for (Building building : buildings) {
            // Add the name and type of the building to the string.
            sb.append("- " + building.getName() + " (" + building.getBuildingType() + ")");

            // Get the list of villagers assigned to the building.
            List<Villager> villagers = building.getVillagers();

            // If there are no villagers assigned to the building, add a message to the
            // string indicating this.
            if (villagers.isEmpty()) {
                sb.append(" (no villagers assigned)");
            }
            // Otherwise, add a list of the names and professions of all the villagers
            // assigned to the building.
            else {
                sb.append(" (villagers assigned: ");
                for (int i = 0; i < villagers.size(); i++) {
                    sb.append(villagers.get(i).getName() + " (" + villagers.get(i).getProfession() + ")");
                    if (i != villagers.size() - 1) {
                        sb.append(", ");
                    }
                }
                sb.append(")");
            }
            sb.append("\n");
        }

        // Add the label for the list of villagers to the string.
        sb.append("Villagers:\n");

        // Iterate through the list of villagers.
        for (Villager villager : villagers) {
            // Add the name and profession of the villager to the string.
            sb.append("- " + villager.getName() + " (" + villager.getProfession() + ")");

            // Check if the villager is assigned to a building.
            Building assignedBuilding = villager.getAssignedBuilding();
            if (assignedBuilding != null) {
                // If the villager is assigned to a building, add the name and type of the
                // building to the string.
                sb.append(" assigned to " + assignedBuilding.getName() + " (");
                sb.append(assignedBuilding.getBuildingType() + ")");
            }

            // Add a newline character to the string to separate each villager's
            // information.
            sb.append("\n");
        }

        // Return the final string representation of the list of villagers.
        return sb.toString();

    }
}
