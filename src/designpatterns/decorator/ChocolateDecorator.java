package designpatterns.decorator;

public class ChocolateDecorator extends Decorator {

    public ChocolateDecorator(Coffee coffee) {
        super(coffee);
    }

    public double getCost() {
        return coffee.getCost() + 30;
    }

    public String getIngredients() {
        return coffee.getIngredients() + ", Chocolate";
    }
}
