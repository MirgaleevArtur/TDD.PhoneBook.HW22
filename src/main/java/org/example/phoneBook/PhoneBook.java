package org.example.phoneBook;

import java.util.*;

public class PhoneBook {

    private final Map<String, String> contacts = new TreeMap<>();
    private final Map<String, String> reverseContacts = new HashMap<>();

    public int add(String name, String phoneNumber) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Имя контакта не может быть пустым");
        }
        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("Номер телефона не может быть пустым");
        }

        contacts.put(name, phoneNumber);
        reverseContacts.put(phoneNumber, name);

        return contacts.size();
    }

    public String findByNumber(String phoneNumber){
        if (phoneNumber == null || phoneNumber.isBlank()) {
            return "Номер телефона не найден";
        }
        return reverseContacts.get(phoneNumber);
    }

    public String findByName(String name){
        if (name == null || name.isBlank()) {
            return "Имя контакта не найдено";
        }
        return contacts.get(name);
    }

    public String printAllNames() {
        if (contacts.isEmpty()) {
            return "Список контактов пуст";
        }
        return null;
    }
}
