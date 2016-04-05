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
public class MyClassMcdcTest_CompoundCondition {

	private static final boolean ANY = false;
	private static final boolean TRUE = true;

	@Test
	public void testCompoundConditionCoverage() {
		MyClassMcdc c = new MyClassMcdc();
		
		assertTrue( c.m(true, ANY, true, ANY, true) );
		assertFalse( c.m(true, ANY, true, ANY, false) );
		
		assertFalse( c.m(true, ANY, false, false, ANY) );
		assertFalse( c.m(true, ANY, false, true, false) );
		assertTrue( c.m(true, ANY, false, true, true) );
		
		assertFalse( c.m(false, false, ANY, false, ANY ) );
		assertFalse( c.m(false, false, ANY, true, false ) );
		assertTrue( c.m(false, false, ANY, true, true ) );
		
		
		assertTrue( c.m(false, true, true, ANY, true) );
		assertFalse( c.m(false, true, true, ANY, false) );
		assertFalse( c.m(false, true, false, false, ANY) );
		
		assertTrue( c.m(false, true, false, true, true) );
		assertFalse( c.m(false, true, false, true, false) );
		
		
	}
}
