package chapter16;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;
import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CollectionTest {
	Logger logger = Logger.getLogger(CollectionTest.class.getName());
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void boxingTest() {
		String name = "Moby";
		Integer mobyAge = 16;
		
		
		//Non generic list that can take any type of elements.
		List nonGenericList = new ArrayList();
		nonGenericList.add(1);
		nonGenericList.add(name);
		nonGenericList.add(mobyAge);
		
		
		
		List <Integer> integers = new ArrayList<>();
		integers.add(1);
		integers.add(mobyAge);
		Iterator<Integer> integerIterator = integers.iterator();
		
		while(integerIterator.hasNext()) {
			logger.info(integerIterator.next().toString());
		}
		
		List<Integer> numbers = new Vector<>();
		numbers.add(1);
		numbers.add(mobyAge);
		numbers.add(Integer.MAX_VALUE);
		
		Vector<Integer> moreNumbers = new Vector<>();
		moreNumbers.add(mobyAge);
		
		integers = moreNumbers;
		
		List<Integer> linkedNumbers = new LinkedList<>();
		linkedNumbers.add(mobyAge);
		linkedNumbers.add(3);
		
		Set<Integer> setters = new HashSet<>();
		setters.add(1);
		setters.add(mobyAge);
		assertTrue(setters.size()==2);
		integerIterator = setters.iterator();
		while(integerIterator.hasNext()) {
			logger.info(integerIterator.next().toString());
		}
	}
	
	@Test
	void collectionsTest() {
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(29);
		numbers.add(17);
		numbers.add(BigInteger.TEN.intValue());
		numbers.add(58);
		numbers.add(0);
		numbers.add(-1);
		numbers.add(39);
		assertTrue(numbers.indexOf(39)==6);
		int result = numbers.indexOf(10);
		assertEquals(2, result);
		
		numbers.sort(null);
		assertFalse(numbers.indexOf(39)==6);
		assertTrue(numbers.indexOf(39)==5);
		
		Collections.reverse(numbers);
		assertEquals(1, numbers.indexOf(39));
		
	}
	
	@Test
	void mapTest() {
		Map<String, Integer> studentMarks = new Hashtable<>();
		studentMarks.put("SCV001", 80);
		studentMarks.put("SCV003", 75);
		studentMarks.put("SCV002", 85);
		
		assertEquals(3,studentMarks.size());
		assertTrue(studentMarks.containsKey("SCV002"));
		assertTrue(studentMarks.containsValue(75));
		
		int previousValue = studentMarks.remove("SCV001");
		assertEquals(80, previousValue);
		assertEquals(2, studentMarks.size());
		studentMarks.replace("SCV003", 95);
		assertFalse(studentMarks.containsValue(75));
		assertEquals(95, studentMarks.get("SCV003").intValue());
		
		
		Set<String> keySet = studentMarks.keySet();
		Iterator<String> keys = keySet.iterator();
		
		while(keys.hasNext()) {
			logger.info(keys.next());
		}
		Map<String, String> months = new TreeMap<>();
		months.put("Jan", "January");
			
		
	}
	
	@Test
	void utilityOfTest() {
		List<Integer> bankNotes;
	}

}
