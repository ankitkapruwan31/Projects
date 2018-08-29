
/*
	Name : Ankit Kapruwan
 	Description : TIC TAC TOE Game ....
 	DATE : 8/29/2018
 */
package com.BridgeLabsCode;

import java.util.Scanner;

public class TicTacToe {
	
	
	static char[] arr = new char[9];
	
	static void print()
	{
		//printing value
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
			if(i%3==2)
				System.out.println();
		}
	
	}
	
	public static void main(String[] args)
	{
		int position = 0;
		int i = 0;
		System.out.println("wellocme to tic tac toe");
		// Assigning  value 
		for(i=0;i<arr.length;i++)
		{
			arr[i] = '-';
			
		}//end of for
		
	
		System.out.println("enter the position where u want 0 to 9 "+arr[0]);
		Scanner sc = new Scanner(System.in);
		print();
		System.out.println("Player 1 is 'X' and player 2 is '0' \n\n\n");
		
		
		for(i =0 ;i<arr.length;i++)
		{
			
			
			//alternative chance to play 
			if(i%2 == 0)
			{
				System.out.println("Player One chance");
				position = sc.nextInt();
				
				
				if(position<=9 && position>=1 && arr[position-1] == '-')
				{
					boolean playerOneWin = false;
					arr[position -1] = 'x' ;
					print();
					
					
					//position of Wining
					if(arr[0] == 'x' && arr[1] == 'x' && arr[2] == 'x')
						playerOneWin = true;
					else if(arr[0] == 'x' && arr[3] == 'x' && arr[6] == 'x')
						playerOneWin = true;
					else if(arr[1] == 'x' && arr[4] =='x' && arr[7] == 'x')
						playerOneWin = true;
					else if(arr[2] == 'x' && arr[5] == 'x' && arr[8] == 'x' )
						playerOneWin = true;
					else if(arr[2] == 'x' && arr[4] =='x' && arr[6] == 'x' )
						playerOneWin = true;
					else if(arr[3] == 'x' && arr[4] =='x' && arr[5] == 'x')
						playerOneWin = true;
					else if(arr[6] == 'x' && arr[7] =='x' && arr[8] =='x')
						playerOneWin = true;
					else if(arr[0] == 'x' && arr[4] == 'x' && arr[8] == 'x')
						playerOneWin = true;
					//if player one win in play
					if(playerOneWin)
					{
						System.out.println("jeetgye player one");
						break;
					}//end of wining decision
					
					
				}//end of first Player
				else
				{
					System.out.println("sahii jagh print ni kia jata tjhese");
					print();
					i--;
				}//end of first Player
				
			}//end of alternative play
			
			//Second player chance to play
			else
			{
				boolean playerTwoWin = false;

				System.out.println("Player two chance");
				position = sc.nextInt();
				
				if(position>0 && arr[position-1] == '-' && position<=9)
				{
					arr[position-1] = '0';
					print();
					//position of Wining
					if(arr[0] == '0' && arr[1] == '0' && arr[2] == '0')
						playerTwoWin = true;
					else if(arr[0] == '0' && arr[3] == '0' && arr[6] == '0')
						playerTwoWin = true;
					else if(arr[1] == '0' && arr[4] =='0' && arr[7] == '0')
						playerTwoWin = true;
					else if(arr[2] == '0' && arr[5] == '0' && arr[8] == '0' )
						playerTwoWin = true;
					else if(arr[2] == '0' && arr[4] =='0' && arr[6] == '0' )
						playerTwoWin = true;
					else if(arr[3] == '0' && arr[4] =='0' && arr[5] == '0')
						playerTwoWin = true;
					else if(arr[6] == '0' && arr[7] =='0' && arr[8] =='0')
						playerTwoWin = true;
					else if(arr[0] == '0' && arr[4] =='0' && arr[8] =='0')
						playerTwoWin = true;
					//checking player two win or not
					if(playerTwoWin )
					{
						System.out.println("player two jeetgya");
						break;
					}//end of checking
				}//end of player Two	
				else
				{
					System.out.println("sahi se ni daalajaaata input tjhse");
					print();
					i--;
				}
			}
		}//end of for	
		if(i == 9)
			System.out.println("Game draw");
		sc.close();
	}//end of main
	
}//end of class
