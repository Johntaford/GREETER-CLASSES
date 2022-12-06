import java.util.Scanner;

public class GreeterApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Choose a greeting: ");
		String greeting = scan.nextLine();
		
		System.out.print("Enter your name: ");
		String name = scan.nextLine();
		
		Greeter greeter = new Greeter(greeting);
		System.out.println(greeter.greet(name));
		
	}

}
