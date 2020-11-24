import java.util.Scanner;

public class TaskUsingMethod {
	

	public String takeInput() {
		Scanner get = new Scanner (System.in);
		
		String x = get.next();
		
		get.close();
		return x;
	} //end method


}// end class
