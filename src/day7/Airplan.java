package day7;

public class Airplan {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private  int fuel;

    public Airplan(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public String getProducer() {
        return producer;
    }
    public void info(){
        System.out.println("Изготовитель: "+producer+"\nгод выпуска: "+year+"\nдлина: "+length+"\nвес "+weight+"\nобьем топлива в баке: "+fuel);
    }
    public void fillUp(int fuel){
        this.fuel+=fuel;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;

    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
    public  static void compareAirplanes(Airplan airplan1,Airplan airplan2){
        if(airplan1.getLength()>airplan2.getLength()) {
            System.out.println("Первый самолет длинее");
        }else if (airplan1.getLength()<airplan2.getLength()){
            System.out.println("Второй самолет длинее");
        }else {
            System.out.println("Они равны");
        }
    }
}
