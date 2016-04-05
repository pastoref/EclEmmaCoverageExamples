package conditionCoverage;

/**
 * Example class used to show that the branch coverage criterion 
 * implemented in EclEmma subsume the basic condition coverage criterion,
 * in practice is a basic condition coverage criterion that pretend all conditions 
 * to be "evaluated true" at least once and "evaluated false" at least once
 * 
 * @author Fabrizio Pastore - pastore@disco.unimib.it
 *
 */
public class MyClass {

//Equivalent to (6 branches)
//	if (a = -1 ){
//		if ( b == -1 ){
//			if ( c == -1 ){
//				
//			} else {
//				
//			}
//		} else {
//			
//		}
//	} else {
//		
//	}
	public boolean mAnd(int a, int b, int c){
		if ( a == -1 && b == -1 && c == -1 ){
			return true;
		} else {
			return false;
		}
	}
	
	public boolean mOr(int a, int b, int c){
		if ( a == -1 || b == -1 || c == -1 ){
			return true;
		} else {
			return false;
		}
	}
	
	
}
