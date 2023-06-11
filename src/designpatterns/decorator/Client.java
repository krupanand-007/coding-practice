package designpatterns.decorator;

public class Client {

    public static void main(String[] args) {
        Coffee espresso = new Espresso();
        System.out.println("Cost: " + espresso.getCost() + "; Ingredients: " + espresso.getIngredients());

        Coffee espressoWithMilk = new MilkDecorator(new Espresso());
        System.out.println("Cost: " + espressoWithMilk.getCost() + "; Ingredients: " + espressoWithMilk.getIngredients());

        Coffee espressoWithChocolate = new ChocolateDecorator(new Espresso());
        System.out.println("Cost: " + espressoWithChocolate.getCost() + "; Ingredients: " + espressoWithChocolate.getIngredients());

        Coffee espressoWithMilkAndChocolate = new ChocolateDecorator(new MilkDecorator(new Espresso()));
        System.out.println("Cost: " + espressoWithMilkAndChocolate.getCost() + "; Ingredients: " + espressoWithMilkAndChocolate.getIngredients());
    }
}
