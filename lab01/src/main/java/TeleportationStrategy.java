public class TeleportationStrategy implements MovementStrategy {

    public void move(String from, String to) {
        System.out.println("Teleporting from " + from + " to " + to);
        System.out.println("   *FLASH*");
        System.out.println("   Instantly appeared!");
    }

    public String getStrategyName() {
        return "Teleportation";
    }
}