package lsystems;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class A_AATest {

	private LRule aa;

	@Before
	public void setUp() throws Exception {
		aa = new A_AA();
	}

	@Test 
	public void testMatch() {
		assertEquals('A', aa.getMatch());
	}
	
	@Test 
	public void testGetBody() {
		char[] testArray = {'A','A'};
		assertArrayEquals(testArray, aa.getBody());
	}

}
