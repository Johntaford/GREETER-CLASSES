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
		
		SimonGreeter simon = new SimonGreeter(greeting);
		System.out.println(simon.greet(name));
		
		
		
		LoudGreeter loud = new LoudGreeter(greeting);
		System.out.println(loud.greet(name));
		
		
		HtmlGreeter html1 = new HtmlGreeter(greeting);
		System.out.println(html1.greet(name));
		
		HtmlGreeter html2 = new HtmlGreeter(greeting);
		System.out.println(html2.greet(name));
	}

}
