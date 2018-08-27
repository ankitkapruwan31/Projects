package com.shop.Service;

import java.util.Scanner;
import com.shop.Beans.*;
public class ShopService {

	private String name , lastName , email, password;
	private long phoneNumber;
	private int numberOfItemsPurchased;
	
	public Customer takeInput()
	{
		Customer customer = new Customer();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name ");
		this.name  = sc.nextLine();
		customer.setName(name);
	
		System.out.println("Enter the Last Name ");
		this.lastName = sc.nextLine();
		customer.setLastName(lastName);
		System.out.println("Enter the email ");
		this.email = sc.nextLine();
		customer.setEmail(email);
		System.out.println("Enter the pass ");
		this.password = sc.nextLine();
		customer.setPassword(password);
		System.out.println("Enter the Phone number");
		this.phoneNumber = sc.nextLong();
		customer.setPhoneNumber(phoneNumber);
		
		sc.close();
		return customer;
	}//end of takeInput
	
	public void printing(Customer customer)
	{
		System.out.println("Name : "+customer.getName() );
		System.out.println("Last Name : "+customer.getLastName());
		System.out.println("Phone Number : "+customer.getPhoneNumber());
		System.out.println("Email : "+customer.getEmail());
		
	}//end of printing
	
	
	
}//end of class
