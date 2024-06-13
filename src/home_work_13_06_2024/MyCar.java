package home_work_13_06_2024;

class Person {
    String fullName;
    int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
}

class Driver {
    String fullName;
    int age;
    int yearsOfService;

    public Driver(String fullName, int age, int yearsOfService) {
        this.fullName = fullName;
        this.age = age;
        this.yearsOfService = yearsOfService;
    }
}

class Engine {
    int power;
    String manufacturer;

    public Engine(int power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }
}

class Car {
    String brand;
    String carClass;
    int weight;
    Driver driver;
    Engine engine;

    public Car(String brand, String carClass, int weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Let's go");
    }

    public void stop() {
        System.out.println("Stop");
    }

    public String toStringTest() {
        return "Car: " + brand + "\nClass: " + carClass + "\nWeight: " + weight + "\nDriver: " + driver.fullName + "\nEngine Power: " + engine.power;
    }
}

class SportCar extends Car {
    int maxSpeed;

    public SportCar(String brand, String carClass, int weight, Driver driver, Engine engine, int maxSpeed) {
        super(brand, carClass, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }
}

class Lorry extends Car {
    int weightCapacity;

    public Lorry(String brand, String carClass, int weight, Driver driver, Engine engine, int weightCapacity) {
        super(brand, carClass, weight, driver, engine);
        this.weightCapacity = weightCapacity;
    }
}

public class MyCar {
    public static void main(String[] args) {
        Driver driver = new Driver("Ivan Ivanovich", 45, 12);
        Engine engine = new Engine(120, "Kia");
        Engine engineSport = new Engine(220, "Ferrari");
        Engine engineLorry = new Engine(300, "Man");

        Car car1 = new Car("Kia", "sedan", 1250, driver, engine);
        System.out.println(car1.toStringTest());
        car1.start();
        car1.stop();

        SportCar sportCar = new SportCar("Ferrari", "Sports", 1600, driver, engineSport, 310);
        System.out.println(sportCar.toStringTest());
        sportCar.start();
        sportCar.stop();

        Lorry lorry = new Lorry("Man", "Truck", 4200, driver, engineLorry, 8300);
        System.out.println(lorry.toStringTest());
        lorry.start();
        lorry.stop();
    }
}