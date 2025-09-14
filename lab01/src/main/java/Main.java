import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Hero hero = new Hero("Герой", "Деревня");

    public static void main(String[] args) {
    System.out.println("==============================");
    System.out.println("ДЕМОНСТРАЦИЯ ПАТТЕРНА STRATEGY");
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
                    System.out.println("Спасибо за игру! До свидания!");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }

    private static void showMainMenu() {
        System.out.println("\n=== ГЛАВНОЕ МЕНЮ ===");
        System.out.println("1. Сменить стратегию передвижения");
        System.out.println("2. Переместиться в локацию");
        System.out.println("3. Показать статус героя");
        System.out.println("4. Выход");
        System.out.print("Выберите действие (1-4): ");
    }

    private static int getUserChoice() {
        return Integer.parseInt(scanner.nextLine());
    }

    private static void changeMovementStrategy() {
    System.out.println("\n=== ВЫБОР СТРАТЕГИИ ПЕРЕДВИЖЕНИЯ ===");
    System.out.println("1. Пешком");
    System.out.println("2. Верхом на лошади");
    System.out.println("3. Полёт");
    System.out.println("4. Телепортация");
    System.out.print("Выберите стратегию (1-4): ");

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
        System.out.println("Неверный выбор.");
                return;
        }

        hero.setMovementStrategy(newStrategy);
    }

    private static void moveToLocation() {
    System.out.println("\n=== ВЫБОР ЛОКАЦИИ ===");
    System.out.println("1. Деревня");
    System.out.println("2. Лес");
    System.out.println("3. Гора");
    System.out.println("4. Замок");
    System.out.print("Выберите локацию (1-4): ");

        int choice = getUserChoice();
        String destination = null;

        switch (choice) {
            case 1:
                destination = "Деревня";
                break;
            case 2:
                destination = "Лес";
                break;
            case 3:
                destination = "Гора";
                break;
            case 4:
                destination = "Замок";
                break;
            default:
                System.out.println("Неверный выбор.");
                return;
        }

        hero.moveTo(destination);
    }

    private static void showHeroStatus() {
        System.out.println("\n=== СТАТУС ГЕРОЯ ===");
        System.out.println("Текущая локация: " + hero.getCurrentLocation());
        System.out.println("Стратегия передвижения: " + hero.getCurrentStrategy().getStrategyName());
    }
}