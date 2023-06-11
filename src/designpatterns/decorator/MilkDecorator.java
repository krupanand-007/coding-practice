package designpatterns.decorator;

public class MilkDecorator extends Decorator{

    public MilkDecorator(Coffee coffee){
        super(coffee);
    }

    public double getCost(){
        return coffee.getCost()+50;
    }

    @Override
    public String getIngredients() {
        return coffee.getIngredients()+", Milk";
    }
}
