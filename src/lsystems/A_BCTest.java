package lsystems;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class A_BCTest {
	private LRule bc;

	@Before
	public void setUp() throws Exception {
		bc = new A_BC();
	}

	@Test 
	public void testMatch() {
		assertEquals('A', bc.getMatch());
	}
	
	@Test 
	public void testGetBody() {
		char[] testArray = {'B', 'C'};
		assertArrayEquals(testArray, bc.getBody());
	}
}
