package fuel;

public class App {
    public static void main(String[] args) {
        RentCompany company = RentCompany.create();

        company.addCar(new Sonata(150));
        company.addCar(new K5(260));
        company.addCar(new Sonata(120));
        company.addCar(new Avante(300));
        company.addCar(new K5(390));

        System.out.println(company.generateReport());
    }
}
