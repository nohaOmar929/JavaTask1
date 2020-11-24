import java.util.Scanner;

public class MultibleInput {
	
	public static void main (String[] args){
		
		System.out.println("Enter your name... ");
		
		Scanner data = new Scanner(System.in);
		String name = data.next();
		data.close();
		
		System.out.println("Your name is: " + name);
				
	System.out.println("Enter your age...");
	
	Scanner data1 = new Scanner (System.in);
	
	int age = data1.nextInt();
	data1.close();
	System.out.println("Your age is: " + age);
	
System.out.println("Enter your Email...");
	
	Scanner data2 = new Scanner (System.in);
	
	String mail = data2.next();
	data2.close();
	System.out.println("Your Email is: " + mail);
	
	

System.out.println("Enter your Faculty...");
	
	Scanner data3 = new Scanner (System.in);
	
	String Faculty = data3.next();
	data3.close();
	System.out.println("Your Email is: " + Faculty);
	

	}//end main

	

}//end class
