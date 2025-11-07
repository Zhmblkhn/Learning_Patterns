package AbstractFactoryPattern.CarPartsFactory.SpecificProducts;

import AbstractFactoryPattern.CarPartsFactory.ProductInterfaces.Tire;

public class ElectricTire implements Tire {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing electric tire");
    }
}
