import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Author: Nurfitra A. Jaafar	
 * Program Description: Tester for Calculator of Simple Mathematical Functions
**/

public class MyTester {
	@Test
	public void testNFactorial() {
		MyCalculator calc = new MyCalculator();
		//test cases for nfactorial
		float actual = calc.nfactorial(3);
		assertEquals("Expected (3!) = 6", 6, actual, 0.0);
		float actual2 = calc.nfactorial(4);
		assertEquals("Expected (4!) = 24", 24, actual2, 0.0);
	}
	
	@Test
	public void testBinarySearch() {
		MyCalculator calc = new MyCalculator();
		//test cases for binarySearch
		int[] arr = {1, 5, 6, 7, 8, 9};
		float actual = calc.binarySearch(arr, 6);
		assertEquals("Expected index 2 from arr [1, 5, 6, 7, 8, 9]", 2, actual, 0.0);
		
		int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		float actual2 = calc.binarySearch(arr2, 7);
		assertEquals("Expected index 7 from array [1, 2, 3, 4, 5, 6, 7, 8, 9] ", 6, actual2, 0.0);
	}
}
