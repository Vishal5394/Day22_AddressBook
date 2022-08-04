package com.BridgeLabz.AddressBook;

public class AddressBookMain {
    public static void main(String[] args) {

        Interface person = new Person();
        person.createContact();
        person.display();
        person.displayBook();
    
    }
}
