interface vehicle {
    int vehicle_number = 4604;

}

interface car {
    int wheels = 4;

    public void start();

    void stop();

}

interface bike {
    int wheels = 2;

    public void start();

    void stop();
}

class benz implements car, vehicle {
    public void start() {
        System.out.println("Benz Car starts!!!");

    }

    public void stop() {
        System.out.println("Benz Car stops!!!");
    }
}

class activa1 implements bike, vehicle {

    @Override
    public void start() {
        System.out.println("Activa bike starts!!!");
    }

    @Override
    public void stop() {
        System.out.println("Activa bike stops!!!");

    }

}

class interfacedemo {
    public static void main(String[] args) {
        activa1 myactiva = new activa1();
        System.out.println("Wheels in my activa are " + myactiva.wheels);
        System.out.println("My vehicle number is " + myactiva.vehicle_number);
        myactiva.start();
        benz mybenz = new benz();
        System.out.println("Wheels in my benz are " + mybenz.wheels);
        mybenz.stop();
    }
}