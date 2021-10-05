package builder;

import builder.type.BreadType;
import builder.type.OrderType;
import builder.type.SauceType;
import builder.type.VegetableType;

public class AppClient {
    public static void main(String[] args) {
        OrderBuilder orderBuilder = new FastFoodOrderBuilder();
        Order order = orderBuilder.orderType(OrderType.ON_SITE).orderBread(BreadType.BEEF)
                .orderSauce(SauceType.SOY_SAUCE).orderVegetable(VegetableType.TOMATO).build();

        System.out.println(order);
    }
}
