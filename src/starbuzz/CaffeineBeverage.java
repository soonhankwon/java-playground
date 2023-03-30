package starbuzz;

public abstract class CaffeineBeverage {
    abstract void prepareRecipe();

    protected void boilWater() {
        System.out.println("물을 끓인다.");
    }

    protected void pourInCup() {
        System.out.println("컵에 붓는다.");
    }

    abstract void addCondiments();
    abstract void brew();
}
