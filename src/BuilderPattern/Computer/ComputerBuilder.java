package BuilderPattern.Computer;

public class ComputerBuilder {
    private String CPU;
    private int RAM;
    private int storage;
    private String graphicsCard;

    public ComputerBuilder (String SPU) {
        this.CPU = SPU;
    }

    public ComputerBuilder setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    public ComputerBuilder setRAM(int RAM) {
        this.RAM = RAM;
        return this;
    }

    public ComputerBuilder setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    public ComputerBuilder setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    public Computer build() {
        return new Computer(CPU, RAM, storage, graphicsCard);
    }
}
