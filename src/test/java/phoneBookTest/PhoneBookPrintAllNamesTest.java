package phoneBookTest;

import org.example.phoneBook.PhoneBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookPrintAllNamesTest {

    private PhoneBook phoneBook;

    @BeforeEach
    public void setUp() {
        phoneBook = new PhoneBook();
    }

    @Test
    public void testPrintAllContacts() {
        phoneBook.add("Oleg", "+71284719824");
        phoneBook.add("Olga", "+7128234419824");
        assertEquals("Oleg, Olga", phoneBook.printAllNames());
    }

    @Test
    public void testContactsEmpty() {
        assertEquals("Список контактов пуст", phoneBook.printAllNames());
    }

    @Test
    public void testPrintAllNamesSort() {
        phoneBook.add("Zuhra", "+1");
        phoneBook.add("Anna", "+2");
        assertEquals("Anna, Zuhra", phoneBook.printAllNames());
    }
}
