public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(CarModel.SEDAN);
        Car car2 = new Car(CarModel.TRUCK);
        Car car3 = new Car(CarModel.MINIVAN);

        car1.startMove(2000);
        car1.getEngine().showEngineInfo();
        car2.startMove(8000);
        car2.getEngine().showEngineInfo();
        car3.startMove(9005);
        car3.getEngine().showEngineInfo();
        System.out.println("-------------------------");

        CarManager.repairEngine(car3);
        car3.getEngine().showEngineInfo();
        System.out.println("-------------------------");

        Car[] cars = {car1, car2, car3};
        CarManager.getMinDurabilityEngine(cars).showEngineInfo();
    }
}