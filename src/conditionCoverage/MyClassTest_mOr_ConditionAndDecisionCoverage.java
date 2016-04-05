package conditionCoverage;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This test suite satisfies condition and decision coverage for method mOr
 * 
 * @author Fabrizio Pastore - pastore@disco.unimib.it
 *
 */
public class MyClassTest_mOr_ConditionAndDecisionCoverage {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		MyClass c = new MyClass(); 
		boolean res = c.mOr(-1, -1, -1);
		
		assertTrue( res );
	}
	
	@Test
	public void test2() {
		MyClass c = new MyClass(); 
		boolean res = c.mOr(6, 7, 8);
		
		assertFalse( res );  
	}

	//Covers line 30, not covered by MyClassTest_mOr_BasiConditionCoverage.java
	//but still misses 2 of 6 branches
}
