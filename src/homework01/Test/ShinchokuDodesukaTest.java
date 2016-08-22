package homework01.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import homework01.ShinchokuDodesuka;

public class ShinchokuDodesukaTest {

	@Test
	public void testGetShinchokuDodesuka() {
		String value = ShinchokuDodesuka.getShinchokuDodesuka();
		assertTrue(value.endsWith("進捗どうですか？"));
		assertFalse(value.substring(0, value.length() - 1).matches(".*" + "進捗どうですか？" + "*."));
	}
}
