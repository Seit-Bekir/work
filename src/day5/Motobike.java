package day5;

class Motobike {
    private int year;
    private String color;
    private String model;

    Motobike(String model,String color,int year){
        this.model=model;
        this.color=color;
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


}