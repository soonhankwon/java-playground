package starbuzz;

public class App {
    public static void main(String[] args) {
        CaffeineBeverage beverage1 = new Coffee();
        CaffeineBeverage beverage2 = new Tea();

        beverage1.prepareRecipe();
        System.out.println("-------------------");
        beverage2.prepareRecipe();

        CaffeineBeverage beverage3 = new Coffee();
        if (beverage3 instanceof Coffee) {
            Coffee coffee = (Coffee) beverage3;
            System.out.println("-------------------");
            coffee.prepareRecipe();
        }
    }
}
