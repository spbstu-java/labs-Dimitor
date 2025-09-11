public interface MovementStrategy {
    /**
     * Execute movement between two points
     * @param from starting point
     * @param to destination point
     */
    void move(String from, String to);

    /**
     * Returns the name of the movement method
     * @return strategy name
     */
    String getStrategyName();
}