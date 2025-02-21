package com.CMS;

public class ContactManager implements AddNew, SearchContact, UpdateContact, ViewContact, deleteContact {
	private String[] names;
	private String[] phoneNumber;
	private int numberOfContact;

	public ContactManager(int capacity) {
		names = new String[capacity];
		phoneNumber = new String[capacity];
		numberOfContact = 0;
	}

	private int findContactIndex(String name) {
		for (int i = 0; i < numberOfContact; i++) {
			if (names[i].equalsIgnoreCase(name)) {
				return 1;
			}
		}
		return -1;
	}

	@Override
	public void viewContact() {
		for (int i = 0; i < numberOfContact; i++) {
			System.out.println("Name:" + names[i] + "\tPhoneNumber:" + phoneNumber[i]);
		}
	}

	@Override
	public void updateContact(String name, String newPhoneNumber) {
		int index = findContactIndex(name);
		if (index != -1) {
			phoneNumber[index] = newPhoneNumber;
			System.out.println("Contact updated successfully");
		} else {
			System.out.println("Contacts not found");
		}
	}

	@Override
	public void searchContact(String name) {
		int index = findContactIndex(name);
		if (index != -1) {
			System.out.println("Name:" + names[index] + "\tPhoneNumber:" + phoneNumber[index]);
		} else {
			System.out.println("cannot found your name");
		}
	}

	public void DeleteContact(String deleteName) {
int index =findContactIndex(deleteName);
if(index !=-1) {
	for(int i=0;i<numberOfContact;i++) {
	names [i]=names[i+1];
	phoneNumber[i]=phoneNumber[i+1];
	}
	numberOfContact--;
	
	System.out.println("Contact deleted successfully ");

}
	}

	@Override
	public void addContact(String name, String addPhoneNumber) {
		if (numberOfContact < names.length) {
			names[numberOfContact] = name;
			phoneNumber[numberOfContact] = addPhoneNumber;
			numberOfContact++;
			System.out.println("Successfully contacts added");
		} else {
			System.out.println("Contact list is full");
		}
	}

}
