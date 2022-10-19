import java.util.*;

public class Lab5Q3 {
    public static void main(String[] args) {

        List<CarObjects> carList = new ArrayList<>();

        carList.add(new CarObjects("NISSAN", "Elgrand", 1998));
        carList.add(new CarObjects("TOYOTA", "CX-60", 2022));
        carList.add(new CarObjects("HONDA", "Integra", 2000));
        carList.add(new CarObjects("Lexus", "CT", 2011));
        System.out.println(carList);

        carList.sort(null);
        System.out.println(carList);

    }
}

class CarObjects implements Comparable<CarObjects> {
    String brand;
    String model;
    int year;

    public CarObjects(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "\n[brand: " + brand + ", model: " + model + ", year: " + year + "]\n";
    }

    @Override
    public int compareTo(CarObjects o) {
        return this.year - o.year;
    }
}