package ContactManagementSystem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ContactManagementSystem {

    // Use a Set to store unique contacts and a Map for quick access
    private static Set<Contact> contacts = new HashSet<>();
    private static Map<String, Contact> contactMap = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nContact Management System");
            System.out.println("1. Add Contact");
            System.out.println("2. Update Contact");
            System.out.println("3. Remove Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Find Contact");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    updateContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    displayAllContacts();
                    break;
                case 5:
                    findContact();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    private static void addContact() {
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        if (contactMap.containsKey(name)) {
            System.out.println("Contact with this name already exists.");
            return;
        }
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        Contact contact = new Contact(name, phoneNumber, email);
        contacts.add(contact);
        contactMap.put(name, contact);
        System.out.println("Contact added successfully.");
    }

    private static void updateContact() {
        System.out.print("Enter the name of the contact to update: ");
        String name = scanner.nextLine();
        Contact contact = contactMap.get(name);
        if (contact != null) {
            System.out.print("Enter new phone number: ");
            String newPhoneNumber = scanner.nextLine();
            System.out.print("Enter new email: ");
            String newEmail = scanner.nextLine();

            contact.setPhoneNumber(newPhoneNumber);
            contact.setEmail(newEmail);
            System.out.println("Contact updated successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    private static void removeContact() {
        System.out.print("Enter the name of the contact to remove: ");
        String name = scanner.nextLine();
        Contact contact = contactMap.remove(name);
        if (contact != null) {
            contacts.remove(contact);
            System.out.println("Contact removed successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    private static void displayAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            System.out.println("Contact List:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    private static void findContact() {
        System.out.print("Enter the name of the contact to find: ");
        String name = scanner.nextLine();
        Contact contact = contactMap.get(name);
        if (contact != null) {
            System.out.println("Contact found: " + contact);
        } else {
            System.out.println("Contact not found.");
        }
    }
}
