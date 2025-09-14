public class FlyingStrategy implements MovementStrategy {

    public void move(String from, String to) {
        System.out.println("Летим из " + from + " в " + to);
        System.out.println("   Парим в небесах...");
        try {
            Thread.sleep(300);
            System.out.println("   Успешно приземлились!");
        } catch (InterruptedException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public String getStrategyName() {
        return "Полёт";
    }
}