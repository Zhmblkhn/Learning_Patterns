package AbstractFactoryPattern.CarPartsFactory.SpecificProducts;

import AbstractFactoryPattern.CarPartsFactory.ProductInterfaces.Engine;

public class ElectricEngine implements Engine {
    @Override
    public void design() {
        System.out.println("Designing electric engine");
    }
}
