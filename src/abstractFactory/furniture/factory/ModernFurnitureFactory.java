package abstractFactory.furniture.factory;

import abstractFactory.furniture.chair.Chair;
import abstractFactory.furniture.chair.ChairModern;
import abstractFactory.furniture.coffeeTable.CoffeeTable;
import abstractFactory.furniture.coffeeTable.CoffeeTableModern;
import abstractFactory.furniture.sofa.Sofa;
import abstractFactory.furniture.sofa.SofaModern;

public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ChairModern();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new CoffeeTableModern();
    }

    @Override
    public Sofa createSofa() {
        return new SofaModern();
    }
}
