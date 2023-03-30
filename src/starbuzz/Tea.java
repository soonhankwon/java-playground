package starbuzz;

public class Tea extends CaffeineBeverage{
    void prepareRecipe() {
        super.boilWater();
        brew();
        super.pourInCup();
        addCondiments();
    }

    void addCondiments() {
        System.out.println("레몬을 추가한다.");
    }

    void brew() {
        System.out.println("티백을 담근다.");
    }
}
