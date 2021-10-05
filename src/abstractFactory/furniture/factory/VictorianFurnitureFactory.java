package abstractFactory.furniture.factory;

import abstractFactory.furniture.chair.Chair;
import abstractFactory.furniture.chair.ChairVictorian;
import abstractFactory.furniture.coffeeTable.CoffeeTable;
import abstractFactory.furniture.coffeeTable.CoffeeTableVictorian;
import abstractFactory.furniture.sofa.Sofa;
import abstractFactory.furniture.sofa.SofaVictorian;

public class VictorianFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ChairVictorian();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new CoffeeTableVictorian();
    }

    @Override
    public Sofa createSofa() {
        return new SofaVictorian();
    }
}
