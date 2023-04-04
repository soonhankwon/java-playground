package fuel;

public class K5 extends Car {

    public K5(int distance) {
        super(distance);
    }

    @Override
    double getDistancePerLiter() {
        return 13;
    }

    @Override
    double getTripDistance() {
        return distance;
    }

    @Override
    String getName() {
        return "K5";
    }
}
