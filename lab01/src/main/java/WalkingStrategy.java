public class WalkingStrategy implements MovementStrategy {

    public void move(String from, String to) {
        System.out.println("Walking from " + from + " to " + to);
        System.out.println("   Slow walking...");
        try {
            Thread.sleep(1000);
            System.out.println("   Arrived safely!");
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public String getStrategyName() {
        return "Walking";
    }
}