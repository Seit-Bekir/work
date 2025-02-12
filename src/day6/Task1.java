package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2020);
        car.setModel("audi");
        car.setColor("green");
        Motobike motobike = new Motobike("suzuki","black",2021);

        car.info();
        motobike.info();
        System.out.println(car.yearDiff(1900));
        System.out.println(motobike.yearDiff(2025));
    }
}
