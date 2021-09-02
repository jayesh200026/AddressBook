package com.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to AddressBook program");
		
		List<Contact> list =new ArrayList<>();
		
		
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
		
		Contact contact = new Contact(fname,lname,address,city,state,zip,phone,email);
		
		list.add(contact);
		
		System.out.println(list.get(0));
		
		//System.out.println(contact);
		
	}

}
