package fuel;

public abstract class Car implements CarFunctionalities{
    protected int distance;

    double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }

    public Car(int distance) {
        this.distance = distance;
    }
}
