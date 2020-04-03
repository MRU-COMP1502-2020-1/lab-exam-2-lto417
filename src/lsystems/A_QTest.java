package lsystems;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class A_QTest {
	
	private LRule q;

	@Before
	public void setUp() throws Exception {
		q = new A_Q();
	}

	@Test 
	public void testMatch() {
		assertEquals('A', q.getMatch());
	}
	
	@Test 
	public void testGetBody() {
		char[] testArray = {'Q'};
		assertArrayEquals(testArray, q.getBody());
	}
}
