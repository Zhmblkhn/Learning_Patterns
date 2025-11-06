package BuilderPattern.Computer;

public class Main {
    public static void main(String[] args) {
        ComputerBuilder builder = new ComputerBuilder("Intel i7");
        Computer computer = builder.setRAM(32).setStorage(1000).setGraphicsCard("NVIDIA RTX 4080").build();

        System.out.println(computer);
    }
}
