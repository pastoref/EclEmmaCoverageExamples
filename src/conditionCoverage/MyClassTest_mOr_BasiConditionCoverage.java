package conditionCoverage;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This test suite satisfies basic condition coverage for method mOr
 * 
 * @author Fabrizio Pastore - pastore@disco.unimib.it
 *
 */
public class MyClassTest_mOr_BasiConditionCoverage {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		MyClass c = new MyClass(); 
		boolean res = c.mOr(-1, -1, 8);
		
		assertTrue( res );
	}
	
	@Test
	public void test2() {
		MyClass c = new MyClass(); 
		boolean res = c.mOr(6, 7, -1);
		
		assertTrue( res );  //test1 and test2 cannot satisfy branch coverage...
	}

	//Does not cover line 30, misses 2 of 6 branches
}
