package JavaConstructor.level1;

/*
 * Question:
 * Hotel Booking System: Create a HotelBooking class with attributes guestName, roomType, and nights. Use default, parameterized, and copy constructors to initialize bookings.
 *
 * Hint:
 * Create three constructors: default, parameterized, and copy. Display each booking.
 *
 * Author: Asher Mustafa
 * Date: 30 - 09 - 2026
 */

public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;
    public HotelBooking()
    {
        this("Unknown","Unknown",1);
    }
    public HotelBooking(String guestName, String roomType, int nights)
    {
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;
    }
    public HotelBooking(HotelBooking obj)
    {
        this.nights= obj.nights;
        this.roomType= obj.roomType;;
        this.guestName= obj.guestName;
    }
    public void display()
    {
        System.out.println("Nights : "+ nights);
        System.out.println("Room type : "+ roomType);
        System.out.println("Guest name : "+guestName);
    }
    public static void main(String[] args)
    {
        HotelBooking obj1= new HotelBooking();
        HotelBooking obj2= new HotelBooking("Asher","luxury",10);
        HotelBooking obj3= new HotelBooking(obj2);
        obj1.display();
        obj2.display();
        obj3.display();
    }
}
