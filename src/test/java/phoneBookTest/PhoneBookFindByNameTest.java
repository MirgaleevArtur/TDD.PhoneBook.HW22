package phoneBookTest;

import org.example.phoneBook.PhoneBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookFindByNameTest {

    private PhoneBook phoneBook;

    @BeforeEach
    public void setUp() {
        phoneBook = new PhoneBook();
    }


    @Test
    public void testFindByName() {
        phoneBook.add("Oleg", "+71284719824");
        assertEquals("+71284719824", phoneBook.findByName("Oleg"));
    }

    @Test
    public void testNameNotFound() {
        phoneBook.add("Oleg", "+71284719824");
        assertEquals("Имя контакта не найдено", phoneBook.findByName("Misha"));
    }

    @Test
    public void testNameIsBlank() {
        phoneBook.add("Oleg", "+71284719824");
        assertEquals("Имя контакта не может быть пустым", phoneBook.findByName(""));
    }
}
