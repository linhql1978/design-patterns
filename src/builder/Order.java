package builder;

import builder.type.BreadType;
import builder.type.OrderType;
import builder.type.SauceType;
import builder.type.VegetableType;

public class Order {
    private OrderType orderType;
    private BreadType breadType;
    private SauceType sauceType;
    private VegetableType vegetableType;

    public OrderType getOrderType() {
        return orderType;
    }

    public BreadType getBreadType() {
        return breadType;
    }

    public SauceType getSauceType() {
        return sauceType;
    }

    public VegetableType getVegetableType() {
        return vegetableType;
    }

    public Order(OrderType orderType, BreadType breadType, SauceType sauceType, VegetableType vegetableType) {
        this.orderType = orderType;
        this.breadType = breadType;
        this.sauceType = sauceType;
        this.vegetableType = vegetableType;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderType=" + orderType +
                ", breadType=" + breadType +
                ", sauceType=" + sauceType +
                ", vegetableType=" + vegetableType +
                '}';
    }
}
