package lsystems;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C_BTest {

	private LRule c;

	@Before
	public void setUp() throws Exception {
		c = new C_B();
	}

	@Test 
	public void testMatch() {
		assertEquals('C', c.getMatch());
	}
	
	@Test 
	public void testGetBody() {
		char[] testArray = {'B'};
		assertArrayEquals(testArray, c.getBody());
	}
}
