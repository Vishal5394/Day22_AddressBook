package com.BridgeLabz.AddressBook;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Person implements Interface {
    static Scanner sc = new Scanner(System.in);
    static String firstName, lastName, address, state, email, city;
    static int zip;
    static long phoneNumber;
    ContactInfo infoContact = new ContactInfo();
    Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
    static Map<String, Contact> detailsBook = new HashMap<>();
    static Map<String, Contact> personByCity = new HashMap<>();
    Map<String, Contact> personByState = new HashMap<>();
    static Map<String, Map<String, Contact>> book = new HashMap<>();

    public void createContact() {
        System.out.println("Enter how many contacts you want to create");
        int numOfContact = sc.nextInt();
        while (numOfContact > 0) {
            System.out.println("\nEnter Name of person");
            String firstName = sc.next();
            if (!detailsBook.containsKey(firstName)) {
                infoContact.info();
                detailsBook.put(firstName, new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email));
                numOfContact--;
            } 
            else {
                System.out.println("Contact already exists!");
            }
        }
    }

    public void display() {
        System.out.println("Created contact list is");
        for (Map.Entry m : detailsBook.entrySet()) {
            System.out.println(m.getKey() + "--> " + m.getValue());
        }
    }

    public void displayBook() {
        System.out.println("Address Books are:");
        for (Map.Entry e : book.entrySet()) {
            System.out.println(e.getKey() + "--> " + e.getValue());
        }
    }
}