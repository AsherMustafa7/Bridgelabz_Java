package JavaEPIAC.Rides;

class Car extends Vehical {
    Car() {
        super("Car");
    }

    double calculateFare(double distance) {
        return distance * 20;
    }
}
