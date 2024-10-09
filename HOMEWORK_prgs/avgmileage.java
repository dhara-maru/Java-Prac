
import java.util.Scanner;

class Car {

    float kms;
    float liters;

    Car(float kms, float liters) {
        this.kms = kms;
        this.liters = liters;
    }

    public void calcmileage() {
        if (liters == 0) {
            System.out.println("Fuel consumption cannot be zero.");
            return;
        }
        float mileage = kms / liters;

    }
}

class Sedan extends Car {

    public Sedan(float kms, float liters) {
        super(kms, liters);
    }

    public void calcmileage() {
        super.calcmileage();
        float sedanMileage = (kms / liters) + 5.0f;
        System.out.printf("Sedan adjusted mileage is: " + sedanMileage + " Km/L");
    }
}

class SUV extends Car {

    public SUV(float kms, float liters) {
        super(kms, liters);
    }

    public void calcmileage() {
        super.calcmileage();
        float suvMileage = (kms / liters) - 5.0f;
        System.out.printf("SUV adjusted mileage is: " + suvMileage + " Km/L");
    }
}

public class avgmileage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your car (1. Sedan or 2. SUV): ");
        int type = sc.nextInt();
        System.out.print("Enter kilometers travelled: ");
        float kms = sc.nextFloat();
        System.out.print("Enter the amount of fuel consumed in Liters: ");
        float liters = sc.nextFloat();

        Car car;
        if (type == 1) {
            car = new Sedan(kms, liters);
        } else if (type == 2) {
            car = new SUV(kms, liters);
        } else {
            System.out.println("Enter a valid car type!");
            return;
        }
        car.calcmileage();
    }
}
