public class Car {
    private final CarModel model;
    private Engine engine;

    public Car(CarModel model) {
        this.model = model;
        this.engine = new Engine();
    }

    public CarModel getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void startMove(int distance) {
        while (distance >= 0 && engine.getDurability() > 0) {
            distance -= 1000;
            engine.setDurability(engine.getDurability() - 10); // не стала брать проценты от числа, чтобы не кастить double в int + c болью в душе не стала учитывать остатки км на износ
        }
        if (engine.getDurability() == 0) {
            System.out.println("полный износ двигателя, движение остановлено. осталось проехать " + Math.abs(distance) + "км");
        }
    }
}
