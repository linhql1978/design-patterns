package abstractFactory.furniture.factory;

import abstractFactory.furniture.chair.Chair;
import abstractFactory.furniture.coffeeTable.CoffeeTable;
import abstractFactory.furniture.sofa.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    CoffeeTable createCoffeeTable();
    Sofa createSofa();
}
