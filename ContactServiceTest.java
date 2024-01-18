/*
JUSTIN SWINNEY
CS-320
 */

package ContactService.test;

import ContactService.main.ContactService;
import ContactService.main.Contact;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ContactServiceTest {

    private ContactService contactService;
    private Contact testContact;

    @BeforeEach
    public void setUp() {
        contactService = new ContactService();
        testContact = new Contact("555", "Justin", "Swinney","1233451234","122 Test Street");
    }

    @Test
    void addContact() {
        contactService.addContact(testContact);
        assertTrue(contactService.getContacts().containsKey("555"));
    }

    @Test
    void removeContact() {
        contactService.addContact(testContact);
        contactService.removeContact("555");
        assertFalse(contactService.getContacts().containsKey("555"));

    }

    @Test
    void updateContactFirstName() {
        contactService.addContact(testContact);
        System.out.println("Starting First Name: " + testContact.getFirstName());
        contactService.updateContactFields("555","firstname", "Timmy");
        assertEquals("Timmy", testContact.getFirstName());
        System.out.println("Updated First Name: " + testContact.getFirstName());
    }
    @Test
    void updateContactLastName() {
        contactService.addContact(testContact);
        System.out.println("Starting Last Name: " + testContact.getLastName());
        contactService.updateContactFields("555", "lastname", "Bob");
        System.out.println("Updated Last Name: " + testContact.getLastName());
    }
    @Test
    void updateContactPhoneNumber() {
        contactService.addContact(testContact);
        System.out.println("Starting Phone-Number: " + testContact.getPhoneNumber());
        contactService.updateContactFields("555", "phone-number", "7045554444");
        System.out.println("Updated Phone-Number: " + testContact.getPhoneNumber());
    }
    @Test
    void updateContactAddress() {
        contactService.addContact(testContact);
        System.out.println("Starting Address: " + testContact.getAddress());
        contactService.updateContactFields("555", "address","555 Clear View Lane");
        System.out.println("Updated Address: " + testContact.getAddress());
    }
    @Test
    void updateInvalidField() {
        contactService.addContact(testContact);
        assertThrows(IllegalArgumentException.class, () -> contactService.updateContactFields("555", "InvalidField", null));
    }

}