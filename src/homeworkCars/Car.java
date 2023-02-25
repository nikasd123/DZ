package homeworkCars;

public class Car {
    private String model;
    private String color;
    private int yearProduction;
    private int maxSpeed;

    public Car(String model, String color, int yearProduction, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.yearProduction = yearProduction;
        this.maxSpeed = maxSpeed;
    }

    public void carInfo() {
        System.out.println("Car model is: " + model);
        System.out.println("Car color is: " + color);
        System.out.println("Car year of production is: " + yearProduction);
        System.out.println("Car maximum speed is: " + maxSpeed);
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
