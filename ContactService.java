/* Author:      Jared Cotherman
 * Date:        8-6-2024
 * Course ID:   CS-320
 * Description: Project 1
 * 			    The purpose of the Contact Service class is to add, update, and delete contacts. 
 * 				
 */

package com.project1;
import java.util.HashMap;
import java.util.Map;


public class ContactService {
    
	// Utilize a HashMap in-memory data structure to store contact data
	private Map<String, Contact> contacts = new HashMap<>();

    
    // Method to add a new contact
    public boolean addNewContact(Contact contact) {
    	
    	// Check that an existing contact ID does not exist before adding new contact
        if (contacts.containsKey(contact.getContactId())) {
            return false;
        }
        
        // Map the new key (contact ID) to the contact object data
        contacts.put(contact.getContactId(), contact);
        return true;
    }
    
    // Method to delete an existing contact
    public boolean deleteExistingContact(String contactId) {
        
    	// Check if contact ID exists in hash map before attempting to delete
    	if (!contacts.containsKey(contactId)) {
            return false;
        }
        // Remove contact from hash map and return true
        contacts.remove(contactId);
        return true;
    }
    
    // Method to update an existing contact
    public boolean updateExistingContact(String contactId, String firstName, String lastName, String number, String address) {
        
    	// Check to see if the contact ID exists in hash map before attempting to update
    	Contact contact = contacts.get(contactId);
        if (contact == null) {
            return false;
        }
        
        contact.setFirstName(firstName);
        
        contact.setLastName(lastName);
        
        contact.setNumber(number);
        
        contact.setAddress(address);
        
        // If all mutator methods accept valid data, return true
        return true;
    }
}