import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;
import java.util.StringTokenizer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RegExTester {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Email: ");
		StringBuilder email = new StringBuilder(input.next());
		
		StringTokenizer tokenizer = new StringTokenizer(email.toString());
		
		String pattern = "[A-Za-z0-9-_]+[@]{1}[.a-z]+";
				//"[a-z(A-Z|0-9)('@')?[a-z]+(com|org|net)]";
		
		while(tokenizer.hasMoreTokens()) {
			boolean email1 = tokenizer.nextToken().matches(pattern);
			assertTrue(email1);
		}
		
		
		input.close();
		
	}

}
