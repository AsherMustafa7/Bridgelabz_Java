package JavaEPIAC.Rides;

class Bike extends Vehical {
    Bike() {
        super("Bike");
    }

    double calculateFare(double distance) {
        return distance * 10;
    }
}
