package lsystems;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class A_XTest {

	private LRule x;

	@Before
	public void setUp() throws Exception {
		x = new A_X();
	}

	@Test 
	public void testMatch() {
		assertEquals('A', x.getMatch());
	}
	
	@Test 
	public void testGetBody() {
		char[] testArray = {};
		assertArrayEquals(testArray, x.getBody());
	}
}
