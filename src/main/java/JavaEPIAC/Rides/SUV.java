
package JavaEPIAC.Rides;

class SUV extends Vehical {
    SUV() {
        super("SUV");
    }

    double calculateFare(double distance) {
        return distance * 300;
    }
}
