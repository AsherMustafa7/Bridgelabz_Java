package Java8Assignments.HotelReservationSystem;

import java.util.*;
import java.util.stream.*;

class Hotel {
    String name;
    String city;
    double pricePerNight;
    double rating;

    Hotel(String name, String city,
          double pricePerNight, double rating) {
        this.name = name;
        this.city = city;
        this.pricePerNight = pricePerNight;
        this.rating = rating;
    }

    public String getCity() {
        return city;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public double getRating() {
        return rating;
    }

    public String toString() {
        return name + " | " + city
                + " | Rs." + pricePerNight
                + " per night | Rating: " + rating;
    }
}

public class HotelReservationSystem {
    public static void main(String[] args) {

        List<Hotel> hotels = Arrays.asList(
                new Hotel("Taj Hotel", "Chennai", 8000, 4.8),
                new Hotel("Grand Palace", "Mumbai", 6000, 4.5),
                new Hotel("Budget Inn", "Chennai", 2000, 3.8),
                new Hotel("Royal Stay", "Delhi", 4500, 4.2),
                new Hotel("Comfort Suites", "Mumbai", 3500, 4.0)
        );

        // 1. Display all hotels
        System.out.println("All Hotels:");
        hotels.stream().forEach(System.out::println);

        // 2. Find hotels in Chennai
        System.out.println("\nHotels in Chennai:");
        hotels.stream()
                .filter(h -> h.getCity().equalsIgnoreCase("Chennai"))
                .forEach(System.out::println);

        // 3. Find hotels under Rs.5000
        System.out.println("\nHotels under Rs.5000:");
        hotels.stream()
                .filter(h -> h.getPricePerNight() < 5000)
                .forEach(System.out::println);

        // 4. Sort hotels by price, low to high
        System.out.println("\nHotels by Increasing Price:");
        hotels.stream()
                .sorted(Comparator.comparingDouble(
                        Hotel::getPricePerNight))
                .forEach(System.out::println);

        // 5. Sort hotels by rating, high to low
        System.out.println("\nHotels by Rating:");
        hotels.stream()
                .sorted(Comparator.comparingDouble(
                        Hotel::getRating).reversed())
                .forEach(System.out::println);

        // 6. Count hotels in Mumbai
        long mumbaiCount = hotels.stream()
                .filter(h -> h.getCity().equalsIgnoreCase("Mumbai"))
                .count();

        System.out.println("\nHotels in Mumbai: " + mumbaiCount);

        // 7. Find hotels with rating >= 4.5
        System.out.println("\nHighly Rated Hotels:");
        hotels.stream()
                .filter(h -> h.getRating() >= 4.5)
                .forEach(System.out::println);

        // 8. Find the cheapest hotel
        Optional<Hotel> cheapest = hotels.stream()
                .min(Comparator.comparingDouble(
                        Hotel::getPricePerNight));

        System.out.println("\nCheapest Hotel:");
        cheapest.ifPresent(System.out::println);

        // 9. Calculate average price
        double averagePrice = hotels.stream()
                .mapToDouble(Hotel::getPricePerNight)
                .average()
                .orElse(0.0);

        System.out.println("\nAverage Price: Rs." + averagePrice);

        // 10. Count hotels in each city
        Map<String, Long> hotelsByCity =
                hotels.stream()
                        .collect(Collectors.groupingBy(
                                Hotel::getCity,
                                Collectors.counting()));

        System.out.println("\nHotels Count by City:");
        hotelsByCity.forEach((city, count) ->
                System.out.println(city + " -> " + count));
    }
}
