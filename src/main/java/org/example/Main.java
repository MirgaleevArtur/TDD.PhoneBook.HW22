package org.example;

import org.example.phoneBook.PhoneBook;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Oleg", "+79191586848");
        phoneBook.add("Olga", "+79291556848");
        phoneBook.add("Igor", "+79292556888");
        phoneBook.add("Vladimir", "+79292599999");

        System.out.println(phoneBook.printAllNames());
        System.out.println(phoneBook.findByName("Oleg"));
        System.out.println(phoneBook.findByNumber("+79291556848"));
        System.out.println(phoneBook.findByName("Vasilyi"));
        System.out.println(phoneBook.findByNumber("123"));
    }
}