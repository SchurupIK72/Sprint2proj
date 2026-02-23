package service;

import model.Discountable;
import model.Food;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            total += item.getAmount() * item.getPrice();
        }
        return total;
    }

    public double getTotalWithDiscount() {
        double total = 0;
        for (Food item : items) {
            double cost = item.getAmount() * item.getPrice();
            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                cost = cost * (1 - discountable.getDiscount() / 100);
            }
            total += cost;
        }
        return total;
    }

    public double getVegetarianTotal() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total += item.getAmount() * item.getPrice();
            }
        }
        return total;
    }
}
