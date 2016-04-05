package mcdc;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This test shows that we can achieve eclEmma 100% branch coverage
 * with a test that does not satisfy MCDC and does not satisfy compound
 * condition coverage
 * 
 * @author Fabrizio Pastore - pastore@disco.unimib.it
 *
 */
public class MyClassMcdcTest_BytecodeCondition {

	private static final boolean ANY = false;
	private static final boolean TRUE = true;

	@Test
	public void testMcdcCoverage() {
		MyClassMcdc c = new MyClassMcdc();
		
		assertTrue( c.m(true, ANY, true, ANY, true) );
		assertFalse( c.m(true, ANY, true, ANY, false) );
		assertFalse( c.m(true, ANY, false, false, ANY) );
		assertFalse( c.m(true, ANY, false, true, false) );
		assertTrue( c.m(true, ANY, false, true, true) );
		assertTrue( c.m(false, false, ANY, TRUE, TRUE ) );
		assertTrue( c.m(false, true, TRUE, ANY, TRUE) );
		
		
		
	}
}
