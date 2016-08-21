package homework01.Test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import homework01.PrimeNumber;

public class PrimeNumberTest {

	@Test
	public void testGetPrimeNumber() {
		List<Integer> primeNumberList = PrimeNumber.getPrimeNumberList(1, 10);
		assertEquals(2,primeNumberList.get(0).intValue() );
		assertEquals(3,primeNumberList.get(1).intValue() );
		assertEquals(5,primeNumberList.get(2).intValue() );
		assertEquals(7,primeNumberList.get(3).intValue() );

		primeNumberList = PrimeNumber.getPrimeNumberList(5, 17);
		assertEquals(5,primeNumberList.get(0).intValue() );
		assertEquals(7,primeNumberList.get(1).intValue() );
		assertEquals(11,primeNumberList.get(2).intValue() );
		assertEquals(13,primeNumberList.get(3).intValue() );
		assertEquals(17,primeNumberList.get(4).intValue() );
	}

}
