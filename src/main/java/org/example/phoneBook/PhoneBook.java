package org.example.phoneBook;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private final Map<String, String> contacts = new HashMap<>();

    public int add(String name, String phoneNumber) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Имя контакта не может быть пустым");
        }
        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("Номер телефона не может быть пустым");
        }

        contacts.put(name, phoneNumber);
        return 0;
    }
}
