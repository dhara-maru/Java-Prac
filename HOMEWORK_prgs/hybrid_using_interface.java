
import java.util.Scanner;

interface country1 {
    void displayCountry();
}

interface areaofcountry extends country1 {
    public void displayArea();
}

interface population extends country1 {
    public void displayPopulation();
}

class India implements population, areaofcountry {
    int year;

    India(int year) {
        this.year = year;
    }

    public void displayCountry() {
        if (year == 2024) {
            System.out.println("Country Name: India");
        }
    }

    public void displayArea() {
        if (year == 2024) {
            System.out.println("Area: 3,287,263 sq km");
        }
    }

    public void displayPopulation() {
        if (year == 2024) {
            System.out.println("Population: 1.4 billion");
        }
    }

    // New method to check the year and display relevant information
    public void displayInfo() {
        if (year == 2024) {
            displayCountry();
            displayArea();
            displayPopulation();
        } else {
            System.out.println("I don't have data for previous years");
        }
    }
}

public class hybrid_using_interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year to see India's data : ");
        int year = sc.nextInt();
        India i1 = new India(year);
        i1.displayInfo();
    }
}
