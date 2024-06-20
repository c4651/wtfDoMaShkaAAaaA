public class CarManager {

    public static void repairEngine(Car car) {
        car.getEngine().setDurability(100);
    }

    public static Engine getMinDurabilityEngine(Car[] cars) {
        int min = cars[0].getEngine().getDurability();
        Engine result = cars[0].getEngine();
        for (Car car : cars) {
            if (car.getEngine().getDurability() < min) {
                min = car.getEngine().getDurability();
                result = car.getEngine();
            }
        }
        return result;
    }

}
