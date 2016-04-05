package conditionCoverage;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This test suite satisfies compound condition coverage for method mOr
 * 
 * @author Fabrizio Pastore - pastore@disco.unimib.it
 *
 */
public class MyClassTest_mOr_CompoundConditionCoverage {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	 
	
	@Test
	public void test1() {
		MyClass c = new MyClass(); 
		boolean res = c.mOr(-1, 2, 3);
		
		assertTrue( res );
	}
	
	@Test
	public void test2() {
		MyClass c = new MyClass(); 
		boolean res = c.mOr(2, -1, -1);
		
		assertTrue( res );  
	}
	
	@Test
	public void test3() {
		MyClass c = new MyClass(); 
		boolean res = c.mOr(6, 7, -1);
		
		assertTrue( res );  
	}
	
	@Test
	public void test4() {
		MyClass c = new MyClass(); 
		boolean res = c.mOr(8, 9, 10);
		
		assertFalse( res );  
	}

	//Cover all lines and branches of mOr
}
