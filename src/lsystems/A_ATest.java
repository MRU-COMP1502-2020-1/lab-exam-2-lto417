package lsystems;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class A_ATest {
	
	private LRule a;

	@Before
	public void setUp() throws Exception {
		a = new A_A();
	}

	@Test 
	public void testMatch() {
		assertEquals('A', a.getMatch());
	}
	
	@Test 
	public void testGetBody() {
		char[] testArray = {'A'};
		assertArrayEquals(testArray, a.getBody());
	}

}
