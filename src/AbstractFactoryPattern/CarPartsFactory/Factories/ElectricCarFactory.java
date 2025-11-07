package AbstractFactoryPattern.CarPartsFactory.Factories;

import AbstractFactoryPattern.CarPartsFactory.ProductInterfaces.Engine;
import AbstractFactoryPattern.CarPartsFactory.ProductInterfaces.Tire;
import AbstractFactoryPattern.CarPartsFactory.SpecificProducts.ElectricEngine;
import AbstractFactoryPattern.CarPartsFactory.SpecificProducts.ElectricTire;

public class ElectricCarFactory implements CarPartsFactory {
    public Engine createEngine() {
        return new ElectricEngine();
    }

    public Tire createTire() {
        return new ElectricTire();
    }
}
