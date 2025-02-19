package day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);
        for (int i = 0; i < 999; i++) {
            picker.dowork();
            courier.dowork();
        }
        picker.bonus();
        courier.bonus();

        System.out.println(warehouse);
        System.out.println(picker.toString());
        System.out.println(courier.toString());


    }
}
