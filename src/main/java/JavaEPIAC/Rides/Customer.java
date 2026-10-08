package JavaEPIAC.Rides;

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    void bookRide(Ride ride, double distance) {
        ride.bookride(distance);
    }
}
