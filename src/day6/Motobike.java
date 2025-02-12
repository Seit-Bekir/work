package day6;

class Motobike {
    private int year;
    private String color;
    private String model;

    Motobike(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("it is motobike");
    }
    public int yearDiff(int year){
        return Math.abs(year-getYear());
    }
}