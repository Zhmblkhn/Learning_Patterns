package AbstractFactoryPattern.CarPartsFactory.SpecificProducts;

import AbstractFactoryPattern.CarPartsFactory.ProductInterfaces.Tire;

public class GasTire implements Tire {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing gas tire");
    }
}
