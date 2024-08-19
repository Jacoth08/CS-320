package com.test;
import com.project1.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ContactTest {
	
	private Contact contact;
	
	//Create new contact object before each test
	@BeforeEach
	public void newContact() {
		contact = new Contact("123456789", "Jared", "Cotherman", "4232548875", "340 Whistle Lane");		
	}
	
	
    @Test
    public void testContactConstructor() {
    	// Test the contact constructor by checking that the contact object was created and string data is equal to 
    	// what was passed as the arguments
        assertEquals("123456789", contact.getContactId());
        assertEquals("Jared", contact.getFirstName());
        assertEquals("Cotherman", contact.getLastName());
        assertEquals("4232548875", contact.getNumber());
        assertEquals("340 Whistle Lane", contact.getAddress());
        
        // Try creating a contact object with a null contactId field
    	assertThrows(IllegalArgumentException.class, () -> {
    		new Contact(null, "Jared", "Cotherman", "4232548875", "340 Whistle Lane");
    	});
    	
    	// Try creating a contact object with an invalid contactId field
    	assertThrows(IllegalArgumentException.class, () -> {
    		new Contact("98765432100", "Jared", "Cotherman", "4232548875", "340 Whistle Lane");
    	});
    	
        // Try creating a contact object with a null first name field
    	assertThrows(IllegalArgumentException.class, () -> {
    		new Contact("38473874", null, "Cotherman", "4232548875", "340 Whistle Lane");
    	});
    	
    	// Try creating a contact object with an invalid first name field
    	assertThrows(IllegalArgumentException.class, () -> {
    		new Contact("34587238", "JaredJareddd", "Cotherman", "4232548875", "340 Whistle Lane");
    	});
    	
        // Try creating a contact object with a null last name field
    	assertThrows(IllegalArgumentException.class, () -> {
    		new Contact("4327386476", "Jared", null, "4232548875", "340 Whistle Lane");
    	});
    	
    	// Try creating a contact object with an invalid last name field
    	assertThrows(IllegalArgumentException.class, () -> {
    		new Contact("43275632", "Jared", "Cothermannnnnnnnn", "4232548875", "340 Whistle Lane");
    	});
    	
        // Try creating a contact object with a null phone number field
    	assertThrows(IllegalArgumentException.class, () -> {
    		new Contact("2458195", "Jared", "Cotherman", null, "340 Whistle Lane");
    	});
    	
    	// Try creating a contact object with an invalid phone number field
    	assertThrows(IllegalArgumentException.class, () -> {
    		new Contact("6254184", "Jared", "Cotherman", "42325488753", "340 Whistle Lane");
    	});
    	
        // Try creating a contact object with a null address field
    	assertThrows(IllegalArgumentException.class, () -> {
    		new Contact("12734221", "Jared", "Cotherman", "4232548875", null);
    	});
    	
    	// Try creating a contact object with an invalid address field
    	assertThrows(IllegalArgumentException.class, () -> {
    		new Contact("38865775", "Jared", "Cotherman", "4232548875", "340 Whistle Laneeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
    	});
    	
    }
    

    @Test
    public void testContactMutators() {
        // Test the contact mutator (setter) methods by setting contact information and verifying the getter returns an equal
        // value
        contact.setFirstName("Peter");
        assertEquals("Peter", contact.getFirstName());
        
        contact.setLastName("Smith");
        assertEquals("Smith", contact.getLastName());
        
        contact.setNumber("8885421154");
        assertEquals("8885421154", contact.getNumber());
        
        contact.setAddress("114 E Blue St");
        assertEquals("114 E Blue St", contact.getAddress());
        
        // Test the Contact class mutators by testing with invalid data to ensure exceptions are thrown
    	assertThrows(IllegalArgumentException.class, () -> {
    	contact.setFirstName("Testtesttest");
    	});
    	
    	assertThrows(IllegalArgumentException.class, () -> {
    	contact.setFirstName(null);
    	});
        
    	assertThrows(IllegalArgumentException.class, () -> {
    	contact.setLastName("Testtesttest");
    	});
    	
    	assertThrows(IllegalArgumentException.class, () -> {
    	contact.setLastName(null);
    	});
    	
    	assertThrows(IllegalArgumentException.class, () -> {
    	contact.setNumber("Testtesttest");
    	});
    	
    	assertThrows(IllegalArgumentException.class, () -> {
    	contact.setNumber(null);
    	});
    	
    	assertThrows(IllegalArgumentException.class, () -> {
    	contact.setAddress("123455555 W Testtesttesttesttesttest");
    	});
    	
    	assertThrows(IllegalArgumentException.class, () -> {
    	contact.setAddress(null);
    	});
    }
}
