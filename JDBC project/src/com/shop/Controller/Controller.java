package com.shop.Controller;


import com.shop.Service.*;
import com.shop.Beans.Customer;

import java.sql.SQLException;
import java.util.Scanner;
import com.shop.DAO.ShopDAO;
public class Controller {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("+_+  WELCOME TO SHOP DATABASE  *_* ");
		// CuStomer thing
		
		System.out.println("1. ADD customer ");
		System.out.println("2. DELETE Customer ");
		System.out.println("3. UPDATE Customer ");
		System.out.println("4. EXIT ");
		switch(sc.nextInt()) 
		{
		case 1:
				//ADD CUSTOMER 
				try {
					
				ShopService service = new ShopService();
				ShopDAO dao = new ShopDAO();
				Customer  customer = service.takeInput();
				int submit = dao.addCustomer(customer);
				if(submit == 1)
				{
					System.out.println("Customer is successfully added +_+");
				}
				else
					System.out.println("failed idk -_-");
				}//end of try
				catch(SQLException sqle)
				{
					sqle.printStackTrace();
					System.out.println("Add customer me faat gya");
				}
			break;
		case 2:
			// DELete Customer ..
			{
					System.out.print("Enter the email of that customer to delete");
				
				String email  = sc.nextLine();
				ShopDAO dao = new ShopDAO();
				try {
				int i = dao.deleteCustomer(email);
				if(i==0)
				{
					System.out.println("deletion is done ");
				}
				else
					System.out.println("Kch to dikat agyi");
				}//end of try
				catch(Exception e)
				{
					e.printStackTrace();
					System.out.println("Fattgya DELETE me");
				}
			}
			break;
		case 3:
			//UPDAte 	
			Scanner scc = new Scanner(System.in);
			System.out.println("Enter the email of customer ");
			String email = scc.nextLine();
			Customer customer = new ShopDAO().getDetails(email);
			ShopService service = new ShopService();
			service.printing(customer);
			System.out.println("Enter the entity you want to change ");
			String update = scc.nextLine();
			System.out.println("enter the change value");
			String updateValue = scc.nextLine();
			ShopDAO dao = new ShopDAO();
			int i  = dao.updatation(update, updateValue, email);
			if(i==1)
			{
				System.out.println("hogya ");
			}
			else
				System.out.println("done ");
			break;
		case 4:
			
			break;
		default :
			
			System.out.println("sahi se type kia ni jata");
		
		
		}//end of switch
		//FOR SHOP 
		//System.out.println("4. CHeck details of ITEMS ");
		
		
		sc.close();
	}//end of main

}//end of class
