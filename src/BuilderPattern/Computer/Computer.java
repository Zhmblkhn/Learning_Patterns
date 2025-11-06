package BuilderPattern.Computer;

public class Computer {
    private String CPU;
    private int RAM;
    private int storage;
    private String graphicsCard;

    public Computer(String CPU, int RAM, int storage, String graphicsCard) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + "\'" +
                ", RAM='" + RAM + "\'" +
                ", storage='" + storage + "\'" +
                "graphicsCard='" + graphicsCard + "'}";
    }

}
