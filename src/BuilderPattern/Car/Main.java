package BuilderPattern.Car;

public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder("V8");
        Car car = builder.setColor("black").setGps(true).setAutopilot(false).build();

        System.out.println(car);
    }
}
