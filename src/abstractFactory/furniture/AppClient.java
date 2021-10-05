package abstractFactory.furniture;

import abstractFactory.furniture.chair.Chair;
import abstractFactory.furniture.coffeeTable.CoffeeTable;
import abstractFactory.furniture.factory.FurnitureFactory;
import abstractFactory.furniture.factory.ModernFurnitureFactory;
import abstractFactory.furniture.sofa.Sofa;

public class AppClient {
    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = new ModernFurnitureFactory();

        Chair chair = furnitureFactory.createChair();
        Sofa sofa = furnitureFactory.createSofa();
        CoffeeTable coffeeTable = furnitureFactory.createCoffeeTable();

        System.out.println(chair);
        System.out.println(sofa);
        System.out.println(coffeeTable);
    }
}
