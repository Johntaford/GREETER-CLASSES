import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreeterTest {

	@Test
	void testConstructor() {
		Greeter greeter = new Greeter("Hello");
		assertEquals("Hello", greeter.greeting);
	}
	
	@Test
	void testGreet() {
		Greeter greeter = new Greeter("Hello");
		assertEquals("Hello,Ford!", greeter.greet("Ford"));
	}

}
