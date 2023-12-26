package example_1;

public class Car {
    protected String brand;
    int maxSpeed;

    public Car(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public Car(String brand) {
        this.brand = brand;
    }


    void display() {
        System.out.println("Бренд: " + brand);
        System.out.println("Макс скорость: " + maxSpeed);
    }
}
