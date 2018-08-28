import java.util.Scanner;
class StopWatch{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 to start the stopwatch");
		int start =  sc.nextInt();
		
		//method is present in SYSTEM ... The static method System.currentTimeMillis() returns the time since January 1st 1970 in milliseconds.
		// if we use this method back to back this method doesnt give accurate value .
		
		long startTiming = System.currentTimeMillis(); 
		System.out.println("press 2 to stop the stopwatch");
		int stop = sc.nextInt();
		
		
		long stopTiming = System.currentTimeMillis();
		
		long diffrence = stopTiming - startTiming;
		
		System.out.println("Milli second time diffence: "+diffrence );
		System.out.println("Difference in second: "+(diffrence/1000));
		
	}//end of main
}//end of class