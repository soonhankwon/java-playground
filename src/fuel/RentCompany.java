package fuel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentCompany {
    private final List<Car> carList;

    public RentCompany(List<Car> carList) {
        this.carList = carList;
    }

    public static RentCompany create() {
        List<Car> list = new ArrayList<>();
        return new RentCompany(list);
    }

    public void addCar(Car car) {
        this.carList.add(car);
    }

    private int convertDoubleToInt(double input) {
        return (int) Math.round(input);
    }

    public String generateReport() {
        return carList.stream()
                .map(car -> car.getName() + " : " + convertDoubleToInt(car.getChargeQuantity()) + "리터")
                .collect(Collectors.joining(System.getProperty("line.separator")));
    }
}
