package codeAlong1;

public class Restaurant {

    public Restaurant(Chef myChef) {
    }


    public void prepareOrders(Chef myChef) {
        System.out.println("Taking orders");
        myChef.makePizza("pepperoni");
    }
}
