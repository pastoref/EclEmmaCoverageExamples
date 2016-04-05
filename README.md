This project contains test cases that show the relation between EclEmma branch coverage
criterion and well known coverage criteria like "basic condition coverage",
"MCDC", "compound condition coverage".

EclEmma branch coverage criterion has a finer granularity than the traditional branch coverage criterion 
(which coincide with decision coverage). 


EclEmma implements branch coverage at the bytecode level. 
As a consequence 100% branch coverage implies that all the conditions have been evaluated to true and false.
In Java "compound conditions" are translated into code where the basic conditions are connected by jumps, i.e. branches.

In practice the condition 

"if ( a == -1 && b == -1 && c == -1 ){
return true;
} else {
return false;
}

at the bytecode level, will be equivalent to the following


	if (a = -1 ){
		if ( b == -1 ){
			if ( c == -1 ){
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	} else {
		return false;
	}

This is why EclEmmas detects 6 branches and not just 2. 

The consequence of this is that the branch coverage criterion implemented in EclEmma subsume the basic condition
 coverage criterion (at least as defined in Pezze' & Young - Software Testing and Analysis book).

The original "basic condition coverage criterion" does not care about the real evaluation of 
conditions, in practice it does not take into account the presence of short circuit evaluation.
 
100%  branch coverage returned by  EclEmma implies that all the basic conditions are 
"evaluated true" at least once and "evaluated false" at least once.
