public class WalkingStrategy implements MovementStrategy {

    public void move(String from, String to) {
        System.out.println("Идём пешком из " + from + " в " + to);
        System.out.println("   Идём не спеша...");
        try {
            Thread.sleep(1000);
            System.out.println("   Прибыли благополучно!");
        } catch (InterruptedException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public String getStrategyName() {
        return "Пешком";
    }
}