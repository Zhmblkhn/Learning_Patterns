package BuilderPattern.Car;

public class CarBuilder {
    private String engine;  // обязательный
    private String color;
    private boolean gps;
    private boolean autopilot;

    public CarBuilder(String engine) {
        this.engine = engine;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setGps(boolean gps) {
        this.gps = gps;
        return this;
    }

    public CarBuilder setAutopilot(boolean autopilot) {
        this.autopilot = autopilot;
        return this;
    }

    public Car build() {
        return new Car(engine, color, gps, autopilot);
    }

    public void reset() {
        this.color = null;
        this.gps = false;
        this.autopilot = false;
    }
}
