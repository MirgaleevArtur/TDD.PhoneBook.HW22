import org.example.phoneBook.PhoneBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PhoneBookTest {

    private PhoneBook phoneBook;

    @BeforeEach
    public void setUp() {
        phoneBook = new PhoneBook();
    }

    @Test
    public void testAddFirstContact() {
        assertEquals(1, phoneBook.add("Oleg", "+79191452949"));
    }

    @Test
    public void testAddTwoContacts() {
        assertEquals(1, phoneBook.add("Marina", "+781284814"));
        assertEquals(2, phoneBook.add("Olga", "+781284812314"));
    }

    @Test
    public void testAddTwoSameContacts() {
        assertEquals(1, phoneBook.add("Marina", "+781284814"));
        assertEquals(1, phoneBook.add("Marina", "+7812848143"));
    }

    @Test
    public void testNameIsEmpty() {
        assertEquals("Имя контакта не может быть пустым",
                    assertThrows(IllegalArgumentException.class, () -> phoneBook.add("", "+124190284")).getMessage());
    }

    @Test
    public void testNumberIsEmpty() {
        assertEquals("Номер телефона не может быть пустым",
                assertThrows(IllegalArgumentException.class, () -> phoneBook.add("Michail", "")).getMessage());
    }

    @Test
    public void testFindByNumber() {
        phoneBook.add("Oleg", "+71284719824");
        assertEquals("Oleg", phoneBook.findByNumber("+71284719824"));
    }

    @Test
    public void testFindByNumberNotFound() {
        phoneBook.add("Oleg", "+71284719824");
        assertEquals("Номер телефона не найден", phoneBook.findByNumber(""));
    }

}
