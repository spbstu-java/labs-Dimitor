public class FlyingStrategy implements MovementStrategy {

    public void move(String from, String to) {
        System.out.println("Flying from " + from + " to " + to);
        System.out.println("   Soaring through the sky...");
        try {
            Thread.sleep(300);
            System.out.println("   Landed successfully!");
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public String getStrategyName() {
        return "Flying";
    }
}