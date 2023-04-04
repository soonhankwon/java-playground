package fuel;

public abstract class Car {
    protected int distance;

    abstract double getDistancePerLiter();
    abstract double getTripDistance();
    abstract String getName();
    double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }

    public Car(int distance) {
        this.distance = distance;
    }
}
