package chapter15;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.bind.JAXB;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest {
	Pattern pattern = Pattern.compile("A-Z");
	Matcher matcher = pattern.matcher("Welcome");
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		Account joyAccount =  new Account(1, "Joy", "Johnson", 300.34);
		Account johnAccount = new Account(2, "John", "Johnson", 5900.83);
		Account tof = new Account(3, "Tofunmi", "Ojo", 300);
		String fileName = "clients.xml";
	
	try {
		BufferedWriter writer = Files.newBufferedWriter(Paths.get(fileName));
		Accounts accounts = new Accounts();
		
		accounts.getAccounts().add(johnAccount);
		accounts.getAccounts().add(joyAccount);
		JAXB.marshal(accounts, writer);
		
		File clientFile =  new File(fileName);
		
	}
	catch(IOException ex) {
		ex.printStackTrace();
		
	}}

}
