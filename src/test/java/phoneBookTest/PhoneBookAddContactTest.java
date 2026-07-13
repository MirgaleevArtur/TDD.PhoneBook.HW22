package phoneBookTest;

import org.example.phoneBook.PhoneBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PhoneBookAddContactTest {

    private PhoneBook phoneBook;

    @BeforeEach
    public void setUp() {
        phoneBook = new PhoneBook();
    }

    @Test
    public void testAddContacts() {
        assertEquals(1, phoneBook.add("Marina", "+781284814"));
        assertEquals(2, phoneBook.add("Olga", "+781284812314"));
    }

    @Test
    public void testAddTwoSameNames() {
        assertEquals(1, phoneBook.add("Marina", "+781284814"));
        assertEquals(1, phoneBook.add("Marina", "+7812848143"));
    }

    @Test
    public void testAddTwoSameNumbers() {
        assertEquals(1, phoneBook.add("Marina", "+781284814"));
        assertEquals(1, phoneBook.add("Marina", "+781284814"));
    }

    @Test
    public void testAddContactNameIsEmpty() {
        assertEquals("Имя контакта не может быть пустым",
                assertThrows(IllegalArgumentException.class, () -> phoneBook.add("", "+124190284")).getMessage());
    }

    @Test
    public void testAddContactNumberIsEmpty() {
        assertEquals("Номер телефона не может быть пустым",
                assertThrows(IllegalArgumentException.class, () -> phoneBook.add("Michail", "")).getMessage());
    }
}
