package com.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class AddressBookMain {
	static List<Contact> list =new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("Welcome to AddressBook program");
		
		 final int EXIT=10;
		
		int choice=0;
		while(choice != EXIT) {
			
			System.out.println("1 : Add Contact\n2 : Edit Contact\n3 : Delete Contact\n4 : Display Contact\n"+EXIT+" to exit");
			Scanner r = new Scanner(System.in);
			Scanner sc = new Scanner(System.in);
			choice=r.nextInt();
			
			switch(choice)
			{
			case 1:addContact();
					break;
			case 2:
				System.out.println("enter the first name");
				String fname=sc.nextLine();
				System.out.println("enter the last name");
				String lname=sc.nextLine();
					editPerson(fname,lname);
					break;
			case 3:System.out.println("enter the first name");
					fname=sc.nextLine();
					System.out.println("enter the last name");
					lname=sc.nextLine();
					deleteperson(fname,lname);
					break;
			case 4:displayContact();
					break;
			case 10:System.exit(0);
			
			}
			
		}
		
		
	}
	
	/**
	 * @param fname
	 * @param lname
	 *  Deteles the contact of person
	 */
	private static void deleteperson(String fname, String lname) {
		// TODO Auto-generated method stub
		Contact person=getPerson(fname,lname);
		if(person == null)
		{
			System.out.println("No contact found of that name");
		}
		else {
			list.remove(person);
		}
		
		
		
	}

	/**
	 *  Display all the contact store in list
	 */
	private static void displayContact() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
	}

	/**
	 * @param fname  firstname of person
	 * @param lname  lastname of person
	 * @return contact of person  firstname=fname and lastname=lname
	 */
	private static Contact getPerson(String fname,String lname)
	{
		for(Contact item:list)
		{
			if(item.firstName.equals(fname) && item.lastName.equals(lname)) {
				return item;
			}
			
		}
		return null;
		
	}

	/**
	 * @param fname firstname of person
	 * @param lname lastname of person
	 * 
	 * Function used to edit contact of person with firstname=fname and lastname=lname
	 */
	private static void editPerson(String fname,String lname) {
		
		Contact person=getPerson(fname,lname);
		if(person == null)
		{
			System.out.println("No contact found of that name");
		}
		else {
			int choice;
			
			Scanner r = new Scanner(System.in);
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				System.out.println("What do you wanna edit");
				System.out.println("1 First Name\n2 Last Name\n3 Address\n4 City\n5 State\n6Zip\n7 Phone number\n8Email\n9Go back");
				choice=r.nextInt();
				switch(choice) {
				case 1:System.out.println("enter the first name");
					String firstName=sc.nextLine();
					person.firstName=firstName;
					break;
				case 2:System.out.println("enter the last name");
				String lastName=sc.nextLine();
				person.lastName=lastName;
				break;
				case 3:System.out.println("enter the address");
				String address=sc.nextLine();
				person.address=address;
				break;
				case 4:System.out.println("enter the city");
				String city=sc.nextLine();
				person.city=city;
				break;
				case 5:System.out.println("enter state");
				String state=sc.nextLine();
				person.state=state;
				break;
				case 6:System.out.println("enter the zip code");
				String zip=sc.nextLine();
				person.zip=zip;
				break;
				case 7:System.out.println("enter phone number");
				String phone=sc.nextLine();
				person.phoneNumber=phone;
				break;
				case 8:System.out.println("enter email");
				String email=sc.nextLine();
				person.eMail=email;
				break;
				case 9: return;
				}
			}
		}
		
		
		// TODO Auto-generated method stub
		
	}

	/**
	 * Function to add new contact
	 */
	private static void addContact() {
		Contact contact ;
		
		System.out.println("Enter the person details");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the first name");
		String fname=sc.nextLine();
		System.out.println("enter the last name");
		String lname=sc.nextLine();
		System.out.println("enter the addres");
		String address=sc.nextLine();
		System.out.println("enter the city");
		String city=sc.nextLine();
		
		System.out.println("enter the state");
		String state=sc.nextLine();
		System.out.println("enter the zip code");
		String zip=sc.nextLine();
		System.out.println("enter the phone Number");
		String phone=sc.nextLine();
		System.out.println("enter the email Id ");
		String email=sc.nextLine();
		contact=new Contact(fname,lname,address,city,state,zip,phone,email);
		list.add(contact);
		
		
		// TODO Auto-generated method stub
		
	}

}
