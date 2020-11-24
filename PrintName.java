import java.util.Scanner;

public class PrintName {

	public static void main (String[] args ) {
	Scanner print = new Scanner(System.in);
	
	System.out.println("Enter your name: ");
	
	String input= print.next();
	
	System.out.println("Hi "+input);
	
	print.close();
	}//end main
	}//end class 
