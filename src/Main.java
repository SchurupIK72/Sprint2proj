import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        // Создаём продукты
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, "red");
        Apple greenApple = new Apple(8, 60, "green");

        // Создаём массив Food
        Food[] items = {meat, redApple, greenApple};

        // Создаём ShoppingCart
        ShoppingCart cart = new ShoppingCart(items);

        // Выводим результаты
        System.out.println("Общая сумма без скидки: " + cart.getTotalWithoutDiscount());
        System.out.println("Общая сумма со скидкой: " + cart.getTotalWithDiscount());
        System.out.println("Сумма вегетарианских продуктов: " + cart.getVegetarianTotal());
    }
}
