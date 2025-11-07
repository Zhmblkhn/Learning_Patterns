package AbstractFactoryPattern.CarPartsFactory.SpecificProducts;

import AbstractFactoryPattern.CarPartsFactory.ProductInterfaces.Engine;

public class GasEngine implements Engine {
    @Override
    public void design() {
        System.out.println("Designing gas Engine");
    }
}
