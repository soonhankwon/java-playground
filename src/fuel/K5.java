package fuel;

public class K5 extends Car {

    public K5(int distance) {
        super(distance);
    }

    @Override
    public double getDistancePerLiter() {
        return 13;
    }

    @Override
    public double getTripDistance() {
        return distance;
    }

    @Override
    public String getName() {
        return "K5";
    }
}
