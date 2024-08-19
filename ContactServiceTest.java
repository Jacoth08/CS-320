package com.test;
import com.project1.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;

class ContactServiceTest {
	
	private Contact contact;
    private ContactService contactService;
    
    // Create new instance of contact and contact service before each test
    @BeforeEach
    public void newContactService() {
        contactService = new ContactService();
        contact = new Contact("875", "Sarah", "Smith", "8887541122", "987 Moore Ave");
        contactService.addNewContact(contact);
    }
    
    // Add a new contact and attempt to add a contact with an existing contact ID
    @Test
    public void testAddContact() {
        assertTrue(contactService.addNewContact(new Contact("877", "Jane", "Addams", "0987654321", "456 Oak St")));
        assertFalse(contactService.addNewContact(new Contact("875", "Maurice", "Brown", "3542155544", "643 Redman Ln")));
    }
    
    // Delete the existing contact and try deleting it again
    @Test
    public void testDeleteContact() {
        assertTrue(contactService.deleteExistingContact("875"));
        assertFalse(contactService.deleteExistingContact("875"));
    }
    
    // Update the existing contact and attempt to update a contact that is not valid
    @Test
    public void testUpdateContact() {
        assertTrue(contactService.updateExistingContact("875", "Brittany", "Thompson", "4235548752", "354 S Chicago Ave"));
        assertFalse(contactService.updateExistingContact("1111", "Kyle", "Someone", "5555556688", "999 SW Some Street"));
    }
}

