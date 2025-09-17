public interface MovementStrategy {
    /**
     * Выполнить перемещение между двумя точками
     * @param from точка отправления
     * @param to точка назначения
     */
    void move(String from, String to);

    /**
     * Возвращает название метода передвижения
     * @return название стратегии
     */
    String getStrategyName();
}