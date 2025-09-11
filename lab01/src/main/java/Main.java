import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Hero hero = new Hero("Hero", "Village");

    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("STRATEGY PATTERN DEMO");
        System.out.println("==============================\n");

        showGameLoop();
    }

    private static void showGameLoop() {
        boolean playing = true;

        while (playing) {
            showMainMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    changeMovementStrategy();
                    break;
                case 2:
                    moveToLocation();
                    break;
                case 3:
                    showHeroStatus();
                    break;
                case 4:
                    playing = false;
                    System.out.println("Thanks for playing! Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void showMainMenu() {
        System.out.println("\n=== MAIN MENU ===");
        System.out.println("1. Change movement strategy");
        System.out.println("2. Move to location");
        System.out.println("3. Show hero status");
        System.out.println("4. Exit");
        System.out.print("Choose action (1-4): ");
    }

    private static int getUserChoice() {
        return Integer.parseInt(scanner.nextLine());
    }

    private static void changeMovementStrategy() {
        System.out.println("\n=== CHOOSE MOVEMENT STRATEGY ===");
        System.out.println("1. Walking");
        System.out.println("2. Horse riding");
        System.out.println("3. Flying");
        System.out.println("4. Teleportation");
        System.out.print("Choose strategy (1-4): ");

        int choice = getUserChoice();
        MovementStrategy newStrategy = null;

        switch (choice) {
            case 1:
                newStrategy = new WalkingStrategy();
                break;
            case 2:
                newStrategy = new HorseRidingStrategy();
                break;
            case 3:
                newStrategy = new FlyingStrategy();
                break;
            case 4:
                newStrategy = new TeleportationStrategy();
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        hero.setMovementStrategy(newStrategy);
    }

    private static void moveToLocation() {
        System.out.println("\n=== CHOOSE DESTINATION ===");
        System.out.println("1. Village");
        System.out.println("2. Forest");
        System.out.println("3. Mountain");
        System.out.println("4. Castle");
        System.out.print("Choose destination (1-4): ");

        int choice = getUserChoice();
        String destination = null;

        switch (choice) {
            case 1:
                destination = "Village";
                break;
            case 2:
                destination = "Forest";
                break;
            case 3:
                destination = "Mountain";
                break;
            case 4:
                destination = "Castle";
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        hero.moveTo(destination);
    }

    private static void showHeroStatus() {
        System.out.println("\n=== HERO STATUS ===");
        System.out.println("Current location: " + hero.getCurrentLocation());
        System.out.println("Movement strategy: " + hero.getCurrentStrategy().getStrategyName());
    }
}