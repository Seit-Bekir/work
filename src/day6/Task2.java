package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplan airplan = new Airplan("Boing", 2020, 30, 40000);
        airplan.setYear( 2021);
        airplan.setFuel(2000);
        airplan.fillUp(2000);
        airplan.fillUp(5000);
        airplan.info();

    }
}
