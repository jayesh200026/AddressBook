package com.day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {

	static Map<String, AddressBook> addressBook = new HashMap<>();
	static Scanner r = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to AddressBook program");

		final int EXIT = 10;

		int choice = 0;

		while (choice != EXIT) {

			System.out.println(
					"1 : Add AddressBook\n2 : Add Contact\n3 : Edit Contact\n4 : Delete Contact\n5 : Display Contact\n6 : Search by place\n"
							+ EXIT + " : to exit");
			Scanner r = new Scanner(System.in);
			Scanner sc = new Scanner(System.in);
			choice = r.nextInt();

			switch (choice) {
			case 1:
				addAddressBook();
				break;

			case 2:
				addContact();
				break;
			case 3:
				editContact();

				break;
			case 4:
				deleteContact();
				break;
			case 5:
				displayContact();
				break;
			case 6:
				searchPlace();
				break;

			case EXIT:
				System.exit(0);

			}

		}

	}

	private static void searchPlace() {
		System.out.println("Enter the city or state name");
		String place = r.nextLine();
		for (Map.Entry<String, AddressBook> entry : addressBook.entrySet()) {
			AddressBook obj = entry.getValue();
			obj.search(place);
		}

	}

	private static void deleteContact() {
		System.out.println("Enter the name of address book from which you wanna delete");

		// Scanner r =new Scanner(System.in);
		String bookName = r.nextLine();
		AddressBook adBook = addressBook.get(bookName);
		if (adBook != null) {
			addressBook.get(bookName).deleteperson();
			;
		} else {
			System.out.println("Book name not found");
		}

	}

	private static void editContact() {
		System.out.println("Enter the name of address book to which you wanna edit");

		// Scanner r =new Scanner(System.in);
		String bookName = r.nextLine();
		AddressBook adBook = addressBook.get(bookName);
		if (adBook != null) {
			addressBook.get(bookName).editPerson();
		} else {
			System.out.println("Book name not found");
		}

	}

	private static void addAddressBook() {
		System.out.println("Enter the name of new address book");

		// Scanner r =new Scanner(System.in);
		String bookName = r.nextLine();

		AddressBook book = addressBook.get(bookName);
		if (book != null) {
			System.out.println("Already has a address book of that name");
		} else {

			AddressBook adBook = new AddressBook(bookName);
			addressBook.put(bookName, adBook);
		}

	}

	private static void displayContact() {
		System.out.println("Enter the name of address book whose contacts you wanna display");

		// Scanner r =new Scanner(System.in);
		String bookName = r.nextLine();
		AddressBook adBook = addressBook.get(bookName);

		// System.out.println(adBook);
		if (adBook != null) {
			adBook.print();
		} else {
			System.out.println("Book name not found");
		}

	}

	private static void addContact() {

		System.out.println("Enter the name of Address book to which you wanna a add the contact");
		// Scanner r =new Scanner(System.in);
		String adBook = r.nextLine();
		AddressBook Book = addressBook.get(adBook);
		if (Book == null) {
			System.out.println("No book found");

		} else {
			addressBook.get(adBook).addContact();
		}

	}

}
