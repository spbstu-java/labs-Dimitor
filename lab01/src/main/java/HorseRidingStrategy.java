public class HorseRidingStrategy implements MovementStrategy {

    public void move(String from, String to) {
        System.out.println("Riding horse from " + from + " to " + to);
        System.out.println("   Fast and elegant...");
        try {
            Thread.sleep(600);
            System.out.println("   Horse arrived!");
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public String getStrategyName() {
        return "Horse riding";
    }
}