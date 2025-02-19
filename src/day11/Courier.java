package day11;

public class Courier implements Worker {
    private int salary;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    private Warehouse warehouse;

    @Override
    public void dowork() {
        salary += 100;
        warehouse.setBalance(warehouse.getBalance() + 1000);
    }

    @Override
    public void bonus() {
        if (warehouse.getBalance() >= 1000000) {
        salary*=3;
        }
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary='" + salary + '\'' +
                '}';
    }
}
