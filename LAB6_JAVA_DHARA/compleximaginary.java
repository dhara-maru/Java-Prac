// L6 B5 :  Define class for Complex number with real and imaginary as data members. Create its
// constructor, overload the constructors. Also define addition method to add two
// complex objects. 

class numbers {

    double real, imaginary;

    numbers() {
        real = 0.0;
        imaginary = 0.0;

    }

    numbers(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void add(numbers n2) {
        double ans = this.real + n2.real;
        double ans2 = this.imaginary + n2.imaginary;

        System.out.println("sum of both real numbers is : " + ans);
        System.out.println("sum of both imaginary numbers is : " + ans2 + "i");
    }

}

class compleximaginary {

    public static void main(String[] args) {
        numbers n1 = new numbers(2.5, 5.5);
        numbers n2 = new numbers(6.6, 3.3);

        n1.add(n2);
    }
}
