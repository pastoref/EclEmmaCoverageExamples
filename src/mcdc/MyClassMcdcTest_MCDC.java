package mcdc;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyClassMcdcTest_MCDC {

	private static final boolean ANY = false;

	@Test
	public void testMcdcCoverage() {
		MyClassMcdc c = new MyClassMcdc();
		
		assertTrue( c.m(true, ANY, true, ANY, true) );
		assertTrue( c.m(false,	true,	true, ANY,	true) );
		assertTrue( c.m(true, ANY,  false,	true, true) );
		
		assertFalse( c.m(true, ANY,	true, ANY, false) );
		assertFalse( c.m(true, ANY, false, false, ANY) );
		assertFalse( c.m(false,	false, ANY,	false, ANY) );
		
		
	}
}
