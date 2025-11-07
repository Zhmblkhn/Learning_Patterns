package AbstractFactoryPattern.CarPartsFactory.Factories;

import AbstractFactoryPattern.CarPartsFactory.ProductInterfaces.Engine;
import AbstractFactoryPattern.CarPartsFactory.ProductInterfaces.Tire;
import AbstractFactoryPattern.CarPartsFactory.SpecificProducts.GasEngine;
import AbstractFactoryPattern.CarPartsFactory.SpecificProducts.GasTire;

public class GasCarFactory implements CarPartsFactory {
    public Engine createEngine() {
        return new GasEngine();
    }

    public Tire createTire() {
        return new GasTire();
    }
}
