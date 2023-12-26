package example_2;

import inheritance.example_1.Car;

public class HybridCar extends Car  {
    public HybridCar(String brand, int maxSpeed) {
        super(brand, maxSpeed);
    }

    void display(){
        System.out.println(brand);
//        System.out.println(maxSpeed);
    }
}


