
public class Greeter {
 
	public String greeting;

	public Greeter(String greeting) {
		
		this.greeting = greeting;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	public String greet(String name) {
		return (greeting + "," + name +"!");
	}
}
