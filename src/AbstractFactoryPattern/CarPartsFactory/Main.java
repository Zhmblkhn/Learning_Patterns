package AbstractFactoryPattern.CarPartsFactory;

import AbstractFactoryPattern.CarPartsFactory.Factories.CarPartsFactory;
import AbstractFactoryPattern.CarPartsFactory.Factories.ElectricCarFactory;
import AbstractFactoryPattern.CarPartsFactory.ProductInterfaces.Engine;
import AbstractFactoryPattern.CarPartsFactory.ProductInterfaces.Tire;

public class Main {
    public static void main(String[] args) {
        CarPartsFactory factory = new ElectricCarFactory();
        Engine engine = factory.createEngine();
        Tire tire = factory.createTire();

        engine.design();
        tire.manufacture();
    }
}
