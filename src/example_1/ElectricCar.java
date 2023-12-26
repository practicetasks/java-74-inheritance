package example_1;

public class ElectricCar extends Car {
    int battery;

    public ElectricCar(String brand, int maxSpeed, int battery){
        super(brand, maxSpeed);
        this.battery = battery;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Аккумулятор: " + battery);
    }
}
