public class Engine {
    private int durability;

    public Engine() {
        durability = 100;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public void showEngineInfo() {
        System.out.println("Износ двигателя = " + this.getDurability() + "%");
    }

}
