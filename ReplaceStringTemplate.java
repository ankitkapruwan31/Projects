import java.util.Scanner;

public class ReplaceStringTemplate {

	public static void main(String[] args)
	{

		String template = "hello <username> , How are you?";
		Scanner sc = new Scanner(System.in);
		System.out.println("template is :"+template);
		System.out.println("enter the new username");
		String username = sc.nextLine();
		
		//By method
		String newTemplate = template.replace("<username>", username);
		System.out.println(newTemplate);
		
		//without replace method
	}//end of main
}//end of class
