/*
JUSTIN SWINNEY
CS-320
 */

package ContactService.test;

import ContactService.main.Contact;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    // CONTACT ID TEST
    @Test
    public void testValidContactID() {
        Contact contact = new Contact("243", "Justin", "Swinney", "1112223333", "122 Test Street");
        assertEquals("243", contact.getContactID());
        System.out.println("Desired contact ID: 243");
        System.out.println("Contact ID pulled: " + contact.getContactID());
    }

    @Test
    public void testNullContactID() {
        assertThrows(IllegalArgumentException.class, () -> new Contact(null, "Justin", "Swinney", "1112223333", "122 Test Street"));
    }
    @Test
    public void testInvalidContactID() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("12345678910", "Justin", "Swinney", "1112223333", "122 Test Street"));
    }

    // CONTACT FIRST NAME TEST
    @Test
    public void testValidFirstName() {
        Contact contact = new Contact("243", "Justin", "Swinney", "1112223333", "122 Test Street");
        assertEquals("Justin", contact.getFirstName());
    }

    @Test
    public void testNullFirstName() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("1234", null, "Swinney", "1112223333", "122 Test Street"));
    }
    @Test
    public void testInvalidFirstName() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("123", "JustinSwinney", "Swinney", "1112223333", "122 Test Street"));
    }


    // CONTACT LAST NAME TEST
    @Test
    public void testValidLastName() {
        Contact contact = new Contact("243", "Justin", "Swinney", "1112223333", "122 Test Street");
        assertEquals("Swinney", contact.getLastName());
    }

    @Test
    public void testNullLastName() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("1234", "Justin", null, "1112223333", "122 Test Street"));
    }
    @Test
    public void testInvalidLastName() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("123", "Justin", "SwinneyJustin", "1112223333", "122 Test Street"));
    }

    // CONTACT PHONE NUMBER TEST
    @Test
    public void testValidPhoneNumber() {
        Contact contact = new Contact("243", "Justin", "Swinney", "1112223333", "122 Test Street");
        assertEquals("1112223333", contact.getPhoneNumber());
    }

    @Test
    public void testNullPhoneNumber() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("1234", "Justin", "Swinney", null, "122 Test Street"));
    }
    @Test
    public void testInvalidPhoneNumber() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("123", "Justin", "Swinney", "1112223333665", "122 Test Street"));
    }

    // CONTACT ADDRESS TEST
    @Test
    public void testValidAddress() {
        Contact contact = new Contact("243", "Justin", "Swinney", "1112223333", "122 Test Street");
        assertEquals("122 Test Street", contact.getAddress());
    }

    @Test
    public void testNullAddress() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("1234", "Justin", "Swinney", "1231231234", null));
    }
    @Test
    public void testInvalidAddress() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("123", "Justin", "Swinney", "1112223333665", "1224563421 TestTestTestTestTest Street"));
    }
}