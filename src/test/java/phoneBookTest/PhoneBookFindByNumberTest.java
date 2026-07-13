package phoneBookTest;

import org.example.phoneBook.PhoneBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PhoneBookFindByNumberTest {

    private PhoneBook phoneBook;

    @BeforeEach
    public void setUp() {
        phoneBook = new PhoneBook();
    }

    @Test
    public void testNumberIsEmpty() {
        assertEquals("Номер телефона не может быть пустым",
                assertThrows(IllegalArgumentException.class, () -> phoneBook.add("Michail", "")).getMessage());
    }

    @Test
    public void testFindContactByNumber() {
        phoneBook.add("Oleg", "+71284719824");
        assertEquals("Oleg", phoneBook.findByNumber("+71284719824"));
    }

    @Test
    public void testNumberIsBlank() {
        phoneBook.add("Oleg", "+71284719824");
        assertEquals("Номер телефона не может быть пустым", phoneBook.findByNumber(""));
    }

    @Test
    public void testNumberNotFound() {
        phoneBook.add("Oleg", "+71284719824");
        assertEquals("Номер телефона не найден", phoneBook.findByNumber("+712719824"));
    }
}
