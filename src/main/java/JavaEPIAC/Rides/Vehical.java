package JavaEPIAC.Rides;

abstract class Vehical {
    String name;

    Vehical(String name) {
        this.name = name;
    }

    abstract double calculateFare(double distance);
}
