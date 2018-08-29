package com.BridgeLabsCode;

import java.util.Scanner;

/*
 * Name : Ankit Kapruwan
 desc : Check year is leap year or not !!!
 */
public class LeapYear {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year you want to check");
		int year = sc.nextInt();
		
		//checking year is of 4 digit
		if(year>999 && year<10000 )
		{
			if(year%4 == 0)
			{
				if(year%100 == 0)
				{
					if(year%400 == 0)
					{
						System.out.println("year is leap year");
						
					}//end of if
					else
						System.out.println("leap year ni h wo");
					
				}//end of if
				else
					System.out.println("leap year ni h wo");
				
			}//end of if
			else
				System.out.println("leap year ni h wo");
		}//end of if
		
		sc.close();
	}//end of main
}//end of class 
