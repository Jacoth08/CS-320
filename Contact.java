/* Author:      Jared Cotherman
 * Date:        8-6-2024
 * Course ID:   CS-320 
 * Description: Project 1
 * 				The purpose of the contact class is to construct new contact objects which contain a Unique ID, 
 * 				First Name, Last Name, Phone Number, and an Address.
 * 				 
 */
package com.project1;


public class Contact {

	// Private data fields for Contact class
	private final String contactId; // Contact ID is final as it shall not be up-datable.
	private String firstName;
	private String lastName;
	private String number;
	private String address;
	
	// Default constructor method
	public Contact(String contactId, String firstName, String lastName, String number, String address) {
	    
		// Check contact ID string for null or correct length
		if (contactId == null || contactId.length() > 10) {
	        throw new IllegalArgumentException("Contact ID Is Invalid");
	    }
		// Check first name string for null or correct length
		if (firstName == null || firstName.length() > 10) {
	        throw new IllegalArgumentException("First Name Is Invalid");
	    }
		// Check last name string for null or correct length
		if (lastName == null || lastName.length() > 10) {
	        throw new IllegalArgumentException("Last Name Is Invalid");
	    }
		// Check phone number string for null or correct length
		if (number == null || number.length() != 10) {
	        throw new IllegalArgumentException("Phone Number Is Invalid");
	    }
		// Check address string for null or correct length
		if (address == null || address.length() > 30) {
	        throw new IllegalArgumentException("Address Is Invalid");
	    }
		
		// If all object data fields pass, create the new contact object
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		this.address = address;
	}
	
	
	// Accessor methods of the Contact class
	public String getContactId() {
	    return contactId;
	}
	
	public String getFirstName() {
	    return firstName;
	}
	
	public String getLastName() {
	    return lastName;
	}
	
	public String getNumber() {
	    return number;
	}
	
	public String getAddress() {
	    return address;
	}
	
	// Mutator methods of the Contact class
	public void setFirstName(String firstName) {
		// Check first name string for null or correct length
		if (firstName == null || firstName.length() > 10) {
	        throw new IllegalArgumentException("First Name Is Invalid");
	    }
	    this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		// Check last name string for null or correct length
		if (lastName == null || lastName.length() > 10) {
	        throw new IllegalArgumentException("Last Name Is Invalid");
	    }
	    this.lastName = lastName;
	}
	
	public void setNumber(String number) {
		// Check phone number string for null or correct length
		if (number == null || number.length() != 10) {
	        throw new IllegalArgumentException("Phone Number Is Invalid");
	    }
	    this.number = number;
	}
	
	public void setAddress(String address) {
		// Check address string for null or correct length
		if (address == null || address.length() > 30) {
	        throw new IllegalArgumentException("Address Is Invalid");
	    }
	    this.address = address;
	}
}