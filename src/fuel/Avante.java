package fuel;

public class Avante extends Car {

    public Avante(int distance) {
        super(distance);
    }

    @Override
    public double getDistancePerLiter() {
        return 15;
    }

    @Override
    public double getTripDistance() {
        return distance;
    }

    @Override
    public String getName() {
        return "Avante";
    }
}
