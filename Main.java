class Car {
    String make;
    String model;

    Car(String make, String model) {
        this.make = make;
           this.model = model;
    }

    void display() {
        System.out.println("Make: " + make + ", Model: " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla");
        car1.display();

        changeCar(car1);
        car1.display();
    }

    static void changeCar(Car car) {
        car.make = "Honda";
        car.model = "Civic";
    }
}