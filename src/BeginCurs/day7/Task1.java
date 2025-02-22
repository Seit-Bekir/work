package BeginCurs.day7;

public class Task1 {
    public static void main(String[] args) {
        Airplan airplan1 = new Airplan("Boing", 2012, 50, 40000);
        Airplan airplan2 = new Airplan("Boing", 2012, 40, 40000);
        Airplan.compareAirplanes(airplan1,airplan2);
    }
}
