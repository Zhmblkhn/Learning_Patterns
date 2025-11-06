package BuilderPattern.Car;

public class Car {
    private String engine;
    private String color;
    private boolean gps;
    private boolean autopilot;

    public Car(String engine, String color, boolean gps, boolean autopilot) {
        this.engine = engine;
        this.color = color;
        this.gps = gps;
        this.autopilot = autopilot;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", gps='" + gps + '\'' +
                ", autopilot'" +  autopilot +
                "'}";
    }
}
