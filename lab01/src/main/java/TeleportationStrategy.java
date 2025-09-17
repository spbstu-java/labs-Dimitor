public class TeleportationStrategy implements MovementStrategy {

    public void move(String from, String to) {
        System.out.println("Телепортируемся из " + from + " в " + to);
        System.out.println("   *ВЖУХ*");
        System.out.println("   Добрались мгновенно!");
    }

    public String getStrategyName() {
        return "Телепортация";
    }
}