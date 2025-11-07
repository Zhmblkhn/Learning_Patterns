package AbstractFactoryPattern.CarPartsFactory.Factories;

import AbstractFactoryPattern.CarPartsFactory.ProductInterfaces.Engine;
import AbstractFactoryPattern.CarPartsFactory.ProductInterfaces.Tire;

public interface CarPartsFactory {
    Engine createEngine();
    Tire createTire();
}
