package example_1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Tesla", 249);
        car.display();


        ElectricCar electricCar = new ElectricCar("", 123, 500);
        electricCar.display();

    }
//    public static void main(String[] args) {
//        CTO cto = new CTO();
//
//        HybridCar hybridCar = new HybridCar();
//        cto.repair(hybridCar);
//
//        ElectricCar car = new ElectricCar();
//        cto.repair(car);
//    }
//    public static void main(String[] args) {
//        Car car = new Car();
//        car.brand = "brand";
//        car.maxSpeed = 230;
//        car.display();
//
//        System.out.println();
//
//        ElectricCar electricCar = new ElectricCar();
//        electricCar.brand = "electric";
//        electricCar.maxSpeed = 230;
//        electricCar.battery = 2900;
//        electricCar.display();
//
//    }
}

// Media (название, год выпуска)
// display()
    // Название: ...
    // Год выпуска: ...

// Movie extends Media
    // - rating
// display()
    // super.display()
    // Рейтинг: rating

// Song extends Media
    // - genre


