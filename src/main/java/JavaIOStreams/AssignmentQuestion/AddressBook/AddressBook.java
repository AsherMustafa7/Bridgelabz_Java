package JavaIOStreams.AssignmentQuestion.AddressBook;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    static class Contact {
        int id;
        String name;
        String phone;
        String email;
        String city;

        Contact(int id, String name, String phone,
                String email, String city) {
            this.id = id;
            this.name = name;
            this.phone = phone;
            this.email = email;
            this.city = city;
        }

        public String toString() {
            return "ID: " + id
                    + " | Name: " + name
                    + " | Phone: " + phone
                    + " | Email: " + email
                    + " | City: " + city;
        }

        String toFileFormat() {
            return id + "|" + name + "|" + phone
                    + "|" + email + "|" + city;
        }
    }

    private static final String INPUT_FILE =
            "InputFiles/contacts.txt";

    private static final String OUTPUT_FILE =
            "Outputfiles/contacts.txt";

    private static final String REPORT_FILE =
            "Outputfiles/address_book_report.txt";

    private static final ArrayList<Contact> contacts =
            new ArrayList<>();

    private static final Scanner scanner =
            new Scanner(System.in);

    public static void main(String[] args) {

        File outputDirectory = new File("Outputfiles");

        if (!outputDirectory.exists()) {
            outputDirectory.mkdirs();
        }

        loadContacts();

        int choice;

        do {
            System.out.println("\n===== ADDRESS BOOK =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Generate Report");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = readInt();

            switch (choice) {
                case 1:
                    addContact();
                    break;

                case 2:
                    viewContacts();
                    break;

                case 3:
                    searchContact();
                    break;

                case 4:
                    deleteContact();
                    break;

                case 5:
                    generateReport();
                    break;

                case 0:
                    System.out.println(
                            "Exiting Address Book. Goodbye!"
                    );
                    break;

                default:
                    System.out.println(
                            "Invalid choice. Try again."
                    );
            }

        } while (choice != 0);

        scanner.close();
    }

    private static int readInt() {
        while (true) {
            try {
                return Integer.parseInt(
                        scanner.nextLine().trim()
                );
            } catch (NumberFormatException e) {
                System.out.print(
                        "Enter a valid number: "
                );
            }
        }
    }

    private static void loadContacts() {

        // Prefer saved contacts from previous runs.
        // Use the input file if no saved file exists.
        File savedFile = new File(OUTPUT_FILE);

        String fileToRead = savedFile.exists()
                ? OUTPUT_FILE
                : INPUT_FILE;

        File inputFile = new File(fileToRead);

        if (!inputFile.exists()) {
            System.out.println(
                    "No existing contacts file found."
            );
            return;
        }

        try (BufferedReader reader =
                     new BufferedReader(
                             new FileReader(inputFile))) {

            String line;

            while ((line = reader.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] fields = line.split("\\|", -1);

                if (fields.length != 5) {
                    System.out.println(
                            "Skipping invalid record: " + line
                    );
                    continue;
                }

                try {
                    int id = Integer.parseInt(
                            fields[0].trim()
                    );

                    Contact contact = new Contact(
                            id,
                            fields[1].trim(),
                            fields[2].trim(),
                            fields[3].trim(),
                            fields[4].trim()
                    );

                    contacts.add(contact);

                } catch (NumberFormatException e) {
                    System.out.println(
                            "Skipping invalid contact ID: " + line
                    );
                }
            }

            System.out.println(
                    contacts.size() + " contact(s) loaded."
            );

        } catch (IOException e) {
            System.out.println(
                    "Error loading contacts: " + e.getMessage()
            );
        }
    }

    private static void addContact() {

        System.out.print("Enter contact ID: ");
        int id = readInt();

        if (findById(id) != null) {
            System.out.println(
                    "A contact with this ID already exists."
            );
            return;
        }

        System.out.print("Enter name: ");
        String name = scanner.nextLine().trim();

        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine().trim();

        System.out.print("Enter email: ");
        String email = scanner.nextLine().trim();

        System.out.print("Enter city: ");
        String city = scanner.nextLine().trim();

        if (name.isEmpty() || phone.isEmpty()
                || email.isEmpty() || city.isEmpty()) {
            System.out.println(
                    "All fields are required."
            );
            return;
        }

        Contact contact = new Contact(
                id, name, phone, email, city
        );

        contacts.add(contact);

        if (saveContacts()) {
            System.out.println(
                    "Contact added successfully."
            );
        }
    }

    private static void viewContacts() {

        if (contacts.isEmpty()) {
            System.out.println("Address book is empty.");
            return;
        }

        System.out.println("\n===== ALL CONTACTS =====");

        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    private static void searchContact() {

        System.out.println("Search by:");
        System.out.println("1. ID");
        System.out.println("2. Name");
        System.out.print("Enter choice: ");

        int choice = readInt();
        Contact found = null;

        if (choice == 1) {
            System.out.print("Enter contact ID: ");
            int id = readInt();
            found = findById(id);

        } else if (choice == 2) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine().trim();

            for (Contact contact : contacts) {
                if (contact.name.equalsIgnoreCase(name)) {
                    found = contact;
                    break;
                }
            }

        } else {
            System.out.println("Invalid search choice.");
            return;
        }

        if (found != null) {
            System.out.println("Contact found:");
            System.out.println(found);
        } else {
            System.out.println("Contact not found.");
        }
    }

    private static void deleteContact() {

        System.out.print("Enter ID of contact to delete: ");
        int id = readInt();

        Contact contact = findById(id);

        if (contact == null) {
            System.out.println("Contact not found.");
            return;
        }

        contacts.remove(contact);

        if (saveContacts()) {
            System.out.println(
                    "Contact deleted successfully."
            );
        }
    }

    private static Contact findById(int id) {

        for (Contact contact : contacts) {
            if (contact.id == id) {
                return contact;
            }
        }

        return null;
    }

    private static boolean saveContacts() {

        try (BufferedWriter writer =
                     new BufferedWriter(
                             new FileWriter(OUTPUT_FILE))) {

            for (Contact contact : contacts) {
                writer.write(contact.toFileFormat());
                writer.newLine();
            }

            return true;

        } catch (IOException e) {
            System.out.println(
                    "Error saving contacts: " + e.getMessage()
            );
            return false;
        }
    }

    private static void generateReport() {

        try (BufferedWriter writer =
                     new BufferedWriter(
                             new FileWriter(REPORT_FILE))) {

            writer.write("ADDRESS BOOK REPORT");
            writer.newLine();
            writer.write("==============================");
            writer.newLine();
            writer.newLine();

            for (Contact contact : contacts) {
                writer.write(contact.toString());
                writer.newLine();
            }

            writer.newLine();
            writer.write(
                    "Total contacts: " + contacts.size()
            );
            writer.newLine();

            System.out.println(
                    "Report saved to " + REPORT_FILE
            );

        } catch (IOException e) {
            System.out.println(
                    "Error generating report: " + e.getMessage()
            );
        }
    }
}
