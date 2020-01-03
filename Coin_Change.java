//https://practice.geeksforgeeks.org/problems/coin-change/0

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    
	    
	    int T ; 
	    Scanner in = new Scanner ( System.in ) ; 
	    T = in.nextInt() ; 
	    while ( T-- > 0  )
	    {
	        int n , m ; 
	        m = in.nextInt() ; 
	        int arr [ ] = new int [ m + 1 ]; 
	        for ( int i = 1 ; i <= m ; i ++ )
	            arr [ i ] = in.nextInt() ; 
	           
	       n = in.nextInt() ; 
	       int dp [  ] [  ]  = new int [ n + 1 ] [ m + 1 ] ; 
	       for ( int i = 0 ; i <= m  ; i ++ )
	                dp [ 0 ] [ i ] = 1 ; 
	                
	       for ( int i = 0 ; i <=n  ; i ++ )
	            dp [ i ] [ 0 ] = 0 ; 
	           
	       for ( int i = 1 ; i <= n ; i ++ )
	       {
	           for ( int j =  1 ; j <= m ; j ++ )
	           {
	               dp [ i ] [ j ] = dp [ i ] [ j - 1 ] ;
	               
	               if ( i - arr [ j ] >= 0 ) 
	                    dp [ i ] [ j ] +=  dp [ i - arr [ j ] ] [  j  ] ; 
	           }
	       }
	       
	       System.out.println ( dp [ n ] [  m ] )  ; 
	    }
	    
		//code
	}
}
