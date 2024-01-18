/*
JUSTIN SWINNEY
CS-320
 */

package ContactService.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactService {
    private final Map<String, Contact> contacts;

    public ContactService() {
        contacts = new HashMap<>();
    }

    public Map<String, Contact> getContacts() {
        return contacts;
    }

    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getContactID())) {
            throw new IllegalArgumentException("The contact ID must be unique.");
        }
        contacts.put(contact.getContactID(), contact);
    }

    public void removeContact(String contactID) {
        if (!contacts.containsKey(contactID)) {
            throw new IllegalArgumentException("Contact ID not found.");
        }
        contacts.remove(contactID);
    }

    public void updateContactFields(String contactID, String field, String newInfo) {
        if (!contacts.containsKey(contactID)) {
            throw new IllegalArgumentException("Contact not found");
        }
        Contact contact = contacts.get(contactID);
        switch (field.toLowerCase()) {
            case "firstname" -> contact.setFirstName(newInfo);
            case "lastname" -> contact.setLastName(newInfo);
            case "phone-number" -> contact.setPhoneNumber(newInfo);
            case "address" -> contact.setAddress(newInfo);
            default -> throw new IllegalArgumentException("Invalid field entered.");
        }
    }




}