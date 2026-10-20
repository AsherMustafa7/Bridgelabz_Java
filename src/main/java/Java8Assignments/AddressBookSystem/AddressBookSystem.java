package Java8Assignments.AddressBookSystem;


import java.util.*;
import java.util.stream.*;

class Contact {
    String firstName;
    String lastName;
    String city;
    String state;
    String phone;

    Contact(String firstName, String lastName,
            String city, String state, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String toString() {
        return firstName + " " + lastName
                + " | " + city + " | " + state
                + " | " + phone;
    }
}

public class AddressBookSystem {
    public static void main(String[] args) {

        List<Contact> contacts = new ArrayList<>();

        contacts.add(new Contact(
                "Asher", "Mustafa", "Chennai",
                "Tamil Nadu", "9876543210"));

        contacts.add(new Contact(
                "Rahul", "Sharma", "Mumbai",
                "Maharashtra", "9876543211"));

        contacts.add(new Contact(
                "Priya", "Verma", "Chennai",
                "Tamil Nadu", "9876543212"));

        contacts.add(new Contact(
                "Aman", "Singh", "Delhi",
                "Delhi", "9876543213"));

        contacts.add(new Contact(
                "Neha", "Gupta", "Mumbai",
                "Maharashtra", "9876543214"));

        // 1. Display all contacts
        System.out.println("All Contacts:");
        contacts.stream().forEach(System.out::println);

        // 2. Search contacts by city
        System.out.println("\nContacts in Chennai:");
        contacts.stream()
                .filter(c -> c.getCity().equalsIgnoreCase("Chennai"))
                .forEach(System.out::println);

        // 3. Search contacts by state
        System.out.println("\nContacts in Tamil Nadu:");
        contacts.stream()
                .filter(c -> c.getState().equalsIgnoreCase("Tamil Nadu"))
                .forEach(System.out::println);

        // 4. Sort contacts alphabetically by first name
        System.out.println("\nSorted by First Name:");
        contacts.stream()
                .sorted(Comparator.comparing(Contact::getFirstName))
                .forEach(System.out::println);

        // 5. Sort contacts by city
        System.out.println("\nSorted by City:");
        contacts.stream()
                .sorted(Comparator.comparing(Contact::getCity))
                .forEach(System.out::println);

        // 6. Count contacts in Chennai
        long chennaiCount = contacts.stream()
                .filter(c -> c.getCity().equalsIgnoreCase("Chennai"))
                .count();

        System.out.println("\nContacts in Chennai: " + chennaiCount);

        // 7. Find a contact by first name
        System.out.println("\nSearch for Asher:");
        contacts.stream()
                .filter(c -> c.getFirstName().equalsIgnoreCase("Asher"))
                .forEach(System.out::println);

        // 8. Display distinct cities
        System.out.println("\nDistinct Cities:");
        contacts.stream()
                .map(Contact::getCity)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        // 9. Group contacts by city
        System.out.println("\nContacts Grouped by City:");
        Map<String, List<Contact>> groupedContacts =
                contacts.stream()
                        .collect(Collectors.groupingBy(Contact::getCity));

        groupedContacts.forEach((city, list) ->
                System.out.println(city + " -> " + list));

        // 10. Count contacts in each city
        System.out.println("\nCount by City:");
        Map<String, Long> countByCity =
                contacts.stream()
                        .collect(Collectors.groupingBy(
                                Contact::getCity,
                                Collectors.counting()));

        countByCity.forEach((city, count) ->
                System.out.println(city + " -> " + count));
    }
}
