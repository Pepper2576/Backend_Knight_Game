package WYWM_Java_Project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the name of the territory from the user
        System.out.print("Enter the name of your territory: ");
        String territoryName = scanner.nextLine();

        // Create a new Territory object with the given name
        Territory territory = new Territory(territoryName);

        // Create two new Building objects and add them to the territory
        Building building1 = createBuilding(scanner);
        territory.addBuilding(building1);

        Building building2 = createBuilding(scanner);
        territory.addBuilding(building2);

        // Create two new Villager objects and add them to the territory
        Villager villager1 = createVillager(scanner);
        territory.addVillager(villager1);

        Villager villager2 = createVillager(scanner);
        territory.addVillager(villager2);

        // Assign each villager to a building
        assignVillagerToBuilding(scanner, territory, villager1);
        assignVillagerToBuilding(scanner, territory, villager2);

        // Print out the structure of the territory
        territory.printStructure();
    }

    private static Building createBuilding(Scanner scanner) {
        // Get the name of the building from the user
        System.out.print("Enter the name of the building: ");
        String buildingName = scanner.nextLine();

        // Create a new Building object with the given name
        return new Building(buildingName);
    }

    private static Villager createVillager(Scanner scanner) {
        // Get the name of the villager from the user
        System.out.print("Enter the name of the villager: ");
        String villagerName = scanner.nextLine();

        // Get the profession of the villager from the user
        String profession;
        do {
            System.out.print("Enter the profession of " + villagerName + " (Knight, Blacksmith, Farmer): ");
            profession = scanner.nextLine();
        } while (!isValidProfession(profession));

        // Create a new Villager object with the given name and profession
        return new Villager(villagerName, profession);
    }

    private static boolean isValidProfession(String profession) {
        // Check if the given profession is valid (i.e., Knight, Blacksmith, or Farmer)
        return profession.equals("Knight") || profession.equals("Blacksmith") || profession.equals("Farmer");
    }

    private static void assignVillagerToBuilding(Scanner scanner, Territory territory, Villager villager) {
        // Ask the user to assign the villager to a building
        System.out.println("Assign " + villager.getName() + " to a building:");

        // Print out a list of available buildings
        int i = 1;
        for (Building building : territory.getBuildings()) {
            System.out.println(i + ". " + building.getName());
            i++;
        }

        // Get the index of the selected building from the user
        int buildingIndex;
        do {
            System.out.print("Enter the number of the building: ");
            buildingIndex = scanner.nextInt();
            scanner.nextLine(); // consume newline
        } while (buildingIndex < 1 || buildingIndex > territory.getBuildings().size());

        // Get the building object from the territory and assign the villager to it
        Building building = territory.getBuildings().get(buildingIndex - 1);
        territory.assignVillagerToBuilding(villager, building);
    }

}
