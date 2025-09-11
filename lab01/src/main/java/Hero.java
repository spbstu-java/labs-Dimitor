public class Hero {
    private MovementStrategy movementStrategy;
    private String currentLocation;

    public Hero(String name, String startLocation) {
        this.currentLocation = startLocation;
        this.movementStrategy = new WalkingStrategy();
    }

    public void setMovementStrategy(MovementStrategy strategy) {
        this.movementStrategy = strategy;
        System.out.println("Now using: " + strategy.getStrategyName());
    }

    public void moveTo(String destination) {
        if (currentLocation.equals(destination)) {
            System.out.println("Already at " + destination);
            return;
        }

        System.out.println("\n--- Movement started ---");
        movementStrategy.move(currentLocation, destination);
        currentLocation = destination;
        System.out.println("Successfully arrived at " + destination);
        System.out.println("--- Movement finished ---\n");
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public MovementStrategy getCurrentStrategy() {
        return movementStrategy;
    }
}