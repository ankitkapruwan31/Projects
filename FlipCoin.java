/*
 * Name =  Ankit Kapruwan

 * Desc = Flip coin and find the percentage of Heads and Tails.
 */


package com.BridgeLabsCode;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {

	
	public static void main(String[] args)
	{
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of times to flip coin");
		int times = sc.nextInt();
		Random random = new Random();
		if(times>0)
		{
			int[] arr = new int[times];
			
			for(int i=0;i<times;i++)
			{
				arr[i] = random.nextInt(2);
				if(arr[i] == 0)
				{
					count ++;
				}
			}//end of for
			float perc = ((float)count/(float)times)*100;
			System.out.println("percentage of getting head is : "+perc);
		}//end of if
		else
			System.out.println("jabardasti krni  h");
		
		sc.close();
	}//end of main
	
}//end of class

