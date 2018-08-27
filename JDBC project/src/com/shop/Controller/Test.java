package com.shop.Controller;




import java.util.ArrayList;

public class Test {

	public static void main(String[] args)
	{
		int[] ar = new int[2];
		
			
		System.out.println(ar.length);
		ArrayList<String> arr = new ArrayList<String>(12);
		System.out.println(arr.size());//0
		arr.add("2");
		arr.add("45");
		arr.add("455");
		System.out.println(arr.size());//3
		for(int i=0;i<arr.size();i++)
			System.out.println(arr.get(i));
		
	}
}


/*
class Test
{
	public static void main(String[] args)
	{
		int[] ar = new int[2];
		ar[0] = 2;
		ar[1] = 3;
		System.out.println(ar.length);
	}
}*/