package conditionCoverage;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This test suite satisfies compound condition coverage for method mAnd
 * 
 * @author Fabrizio Pastore - pastore@disco.unimib.it
 *
 */
public class MyClassTest_mAnd_CompoundConditionCoverage {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	 
	@Test
	public void test1() {
		MyClass c = new MyClass(); 
		boolean res = c.mAnd(2, 2, 3);
		
		assertFalse( res );
	}
	
	@Test
	public void test2() {
		MyClass c = new MyClass(); 
		boolean res = c.mAnd(-1, 3, -1);
		
		assertFalse( res );  
	}
	
	@Test
	public void test3() {
		MyClass c = new MyClass(); 
		boolean res = c.mAnd(-1, -1, 4);
		
		assertFalse( res );  
	}
	
	@Test
	public void test4() {
		MyClass c = new MyClass(); 
		boolean res = c.mAnd(-1, -1, -1);
		
		assertTrue( res );  
	}

	//all lines of mAnd are covered, all bytecode branches
}
