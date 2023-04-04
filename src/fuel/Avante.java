package fuel;

public class Avante extends Car {

    public Avante(int distance) {
        super(distance);
    }

    @Override
    double getDistancePerLiter() {
        return 15;
    }

    @Override
    double getTripDistance() {
        return distance;
    }

    @Override
    String getName() {
        return "Avante";
    }
}
