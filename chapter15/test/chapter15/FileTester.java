package chapter15;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileTester {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void FileExistsTest() {
		String fileAddress = "C:\\acid_in_sql.txt";
		File aFile = new File(fileAddress);
		assertTrue(aFile.exists());
	}
	
	@Test
	void directoryExistsTest() {
		String dirAddress = "C:\\Intel";
		File aDir = new File(dirAddress);
		assertTrue(aDir.exists());
		assertTrue(aDir.isDirectory());
	}
	
	@Test
	void createFile() {
		File NewFile = new File("NewFileFromEclipse.txt");
		try {
			NewFile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(NewFile.exists());
	}
	
	@Test
	void deleteFile() {
		File NewFile = new File("NewFileFromEclipse.txt");
		NewFile.delete();
	}
	

}
