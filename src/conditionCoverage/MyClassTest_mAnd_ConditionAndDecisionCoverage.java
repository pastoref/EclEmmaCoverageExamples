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
public class MyClassTest_mAnd_ConditionAndDecisionCoverage {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		MyClass c = new MyClass(); 
		boolean res = c.mAnd(-1, -1, -1);
		
		assertTrue( res );
	}
	
	@Test
	public void test2() {
		MyClass c = new MyClass(); 
		boolean res = c.mAnd(6, 7, 8);
		
		assertFalse( res );  
	}

	//cover line 20 not covered by BasicConditionCoverage, but same bytecode branches
}
