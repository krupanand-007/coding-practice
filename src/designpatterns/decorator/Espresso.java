package designpatterns.decorator;

public class Espresso implements Coffee{
    @Override
    public double getCost() {
        return 100;
    }

    @Override
    public String getIngredients() {
        return "Espresso";
    }
}
