package abstractFactory.furniture.factory;

import abstractFactory.furniture.chair.Chair;
import abstractFactory.furniture.chair.ChairArtDeco;
import abstractFactory.furniture.coffeeTable.CoffeeTable;
import abstractFactory.furniture.coffeeTable.CoffeeTableArtDeco;
import abstractFactory.furniture.sofa.Sofa;
import abstractFactory.furniture.sofa.SofaArtDeco;

public class ArtDecoFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ChairArtDeco();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new CoffeeTableArtDeco();
    }

    @Override
    public Sofa createSofa() {
        return new SofaArtDeco();
    }
}
