package lsystems;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class B_ATest {

	private LRule b;

	@Before
	public void setUp() throws Exception {
		b = new B_A();
	}

	@Test 
	public void testMatch() {
		assertEquals('B', b.getMatch());
	}
	
	@Test 
	public void testGetBody() {
		char[] testArray = {'A'};
		assertArrayEquals(testArray, b.getBody());
	}

}
