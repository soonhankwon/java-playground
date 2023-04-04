package fuel;

public class Sonata extends Car{

    public Sonata(int distance) {
        super(distance);
    }

    @Override
    public double getDistancePerLiter() {
        return 10;
    }

    @Override
    public double getTripDistance() {
        return distance;
    }

    @Override
    public String getName() {
        return "Sonata";
    }
}
