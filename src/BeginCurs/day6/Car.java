package BeginCurs.day6;

class Car{
    private int year;
    private String color;
    private String model;

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void info(){
        System.out.println("It is car");
    }
    public int yearDiff(int year){
        return Math.abs(year-getYear());
    }
}