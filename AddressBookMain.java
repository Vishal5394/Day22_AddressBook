package com.BridgeLabz.AddressBook;

public class AddressBookMain {
    public static void main(String[] args) {

        Interface person = new Person();
        person.createContact();
        person.display();
        person.displayBook();
        person.addContact();
        person.editContact();
        person.deleteContact();
        person.addToBook();
        person.operation();
        person.searchPerson();
        person.addContactByCity();
        person.addContactByState();
        person.viewByCity();
        person.viewByState();
    
    }
}
