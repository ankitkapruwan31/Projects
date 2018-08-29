/*
 * Name : Ankit Kapruwan
 * Desc : checking two string is anagram or not
 */


package com.BridgeLabsCode;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	//solution with default method
	/*public static void main(String[] args) {

		boolean status = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first String ");
		String firstString = sc.nextLine();
		System.out.println("Enter the second string ");
		String secondString = sc.nextLine();
	
		if(firstString.length() == secondString.length())
		{
			char[] firstChar = firstString.toLowerCase().toCharArray();
			char[] secondChar = secondString.toLowerCase().toCharArray();
			
			Arrays.sort(firstChar);
			Arrays.sort(secondChar);
			status = Arrays.equals(firstChar, secondChar);
		}//end of if
		else
			System.out.println("string is not anagram");

		
		if(status)
			System.out.println("stringis anaggram");
		else
			System.out.println("string is not anagram");
		sc.close();
	}//end of main
	*/

	// without method
	
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the first string");
		String firstString = sc.nextLine();
		System.out.println("enter the second string");
		String secondString = sc.nextLine();
		
		char[] firstCharArr = firstString.toCharArray();
		char[] secondCharArr = secondString.toCharArray();
		
		
		//changing to char[] to string
		char[] firstCharArray = sort(firstCharArr);
		String firstSortedString = Arrays.toString(firstCharArray);
		char[] secondCharArray = sort(secondCharArr);
		String secondSortedString = Arrays.toString(secondCharArray);
		
		if(firstSortedString.equals(secondSortedString))
		{
			System.out.println("string is anagram");
		}
		else
			System.out.println("string is not anagram");
		
		sc.close();
	}//end of main
	
	
	static char[] sort(char[] arr)
	{
		char temp;
		char[] tempArr = new char[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			tempArr[i] = arr[i]; 
		}//end of for
		
		//sorting 
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=1;j<arr.length;j++)
			{
				if((int)arr[j-1] >(int) arr[j])
				{
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}//end of for
		return arr;
	}//end of sort
}//end of class

