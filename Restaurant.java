package codeAlong1;

public class Restaurant {

    public Restaurant(Chef myChef) {
        this.openRestaurant();
        this.prepareOrders(myChef);
    }

    public void openRestaurant(){
        System.out.println("Open for business!");
    }


    public void prepareOrders(Chef myChef) {
        System.out.println("Taking orders");
        myChef.makePizza("pepperoni");
        myChef.cutPizza(8);
    }
}
