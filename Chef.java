package codeAlong1;

public class Chef {

    //This is sol. Make the solution.
    public Chef() {
    }

    public void makePizza(String topping) {
        System.out.println("Making pizza with " + topping);
    }

    public void cutPizza(int numPieces){
        System.out.println("Cutting up " + numPieces + " slices!");
    }

    public int howManySlices(int numPizza, int numSlices){
        return numPizza * numSlices;
    }
}
