package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("tesla");
        car.setColor("green");
        car.setYear(2020);

        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getYear());

        Motobike motobike = new Motobike("subary","yealow",2021);
        System.out.println(motobike.getModel());
        System.out.println(motobike.getColor());
        System.out.println(motobike.getYear());
    }

}
