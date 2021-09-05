package com.day12;

import java.util.HashSet;
import java.util.Set;

public class AddressBook {

	/**
	 * HashSet to avoid redundant data
	 */
	Set<Contact> contact = new HashSet<>();

	public void addContact(Contact c) {

		contact.add(c);
	}

	public void deleteContact(Contact c) {
		contact.remove(c);
	}

	public Contact getContact(String fname, String lname) {
		for (Contact c : contact) {
			if (c.firstName.equals(fname) && c.lastName.equals(lname)) {
				return c;
			}
		}
		return null;

	}

	public Set<Contact> getAllContact() {
		return contact;
	}

}
