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

        String oldNumber = contacts.put(name.trim(), phoneNumber.trim());
        if (oldNumber != null) {
            reverseContacts.remove(oldNumber);
        }
        reverseContacts.put(phoneNumber.trim(), name.trim());

        return contacts.size();
    }

    public String findByNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isBlank()) {
            return "Номер телефона не может быть пустым";
        }
        return reverseContacts.getOrDefault(phoneNumber, "Номер телефона не найден");
    }

    public String findByName(String name) {
        if (name == null || name.isBlank()) {
            return "Имя контакта не может быть пустым";
        }
        return contacts.getOrDefault(name, "Имя контакта не найдено");
    }

    public String printAllNames() {
        if (contacts.isEmpty()) {
            return "Список контактов пуст";
        }
        return String.join(", ", contacts.keySet());
    }
}
