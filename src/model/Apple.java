package model;

public class Apple extends Food implements Discountable {
    private String colour;

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public double getDiscount() {
        if ("red".equals(colour)) {
            return 60.0;
        }
        return 0;
    }
}
