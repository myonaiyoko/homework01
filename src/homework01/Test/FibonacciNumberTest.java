package homework01.Test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import homework01.FibonacciNumber;

public class FibonacciNumberTest {

	@Test
	public void testGetFibonacciNumber() {
		List<Integer> fList = FibonacciNumber.getFibonacciNumberList(20);
		assertEquals(1, fList.get(0).intValue() );
		assertEquals(1, fList.get(1).intValue());
		assertEquals(2, fList.get(2).intValue());
		assertEquals(3, fList.get(3).intValue());
		assertEquals(5, fList.get(4).intValue());
		assertEquals(8, fList.get(5).intValue());
		assertEquals(13, fList.get(6).intValue());

		fList = FibonacciNumber.getFibonacciNumberList(21);
		assertEquals(1, fList.get(0).intValue());
		assertEquals(1, fList.get(1).intValue());
		assertEquals(2, fList.get(2).intValue());
		assertEquals(3, fList.get(3).intValue());
		assertEquals(5, fList.get(4).intValue());
		assertEquals(8, fList.get(5).intValue());
		assertEquals(13, fList.get(6).intValue());
		assertEquals(21, fList.get(7).intValue());

		fList = FibonacciNumber.getFibonacciNumberList(-5);
		assertEquals(null, fList);
	}

}
