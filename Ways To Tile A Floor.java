https://practice.geeksforgeeks.org/problems/ways-to-tile-a-floor/0/?fbclid=IwAR269gOZRluU1mumVUuva3tr85BLc70D-siGwNzPP4bfLF6d1Hskfz-Wc0A

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

//silver_Lining 
class GFG {
	public static void main (String[] args) {
	    
	    
	    
	    long   Dp [  ] = new long  [ 71 ]  ; 
	    Dp [ 1 ] = 1 ; 
	    Dp [ 2 ] = 2 ; 
	    for ( int  i = 3 ; i <71 ; i ++ )
	        Dp [ i ] = Dp [ i - 1 ] + Dp [ i - 2 ] ; 
	    int T ; 
	    Scanner in = new Scanner ( System.in ) ; 
	    T= in.nextInt() ; 
	    while ( T-- > 0 )
	    {
	        int n ; 
	        n = in.nextInt() ; 
	        System.out.println ( Dp [ n ] ) ; 
	    }
		//code
	}
}
