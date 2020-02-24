/*package whatever //do not write package name here */
//https://www.geeksforgeeks.org/maximum-sum-rectangle-in-a-2d-matrix-dp-27/
import java.util.*;
import java.lang.*;
import java.io.*;
class Solution {
    
    
    public int Kadane ( int arr[] , int row )
    {
        int ans = Integer.MIN_VALUE , c = 0 ; 
        for ( int i = 0 ; i < row ; i ++ )
        {
            c = Math.max ( arr [ i ] , c + arr [ i ] ) ; 
            ans = Math.max ( c , ans ) ; 
        }
        return ans ; 
    }
    public int numSubmatrixSumTarget(int[][] m ) {
        
        int presum [ ] [] = new int [  1001  ] [ 1001 ] ;
        int row = m.length; 
        int col = m[ 0 ].length; 
        for ( int i = 0 ; i < row ; i ++ )
            for ( int j = 0 ; j < col  ; j ++ )
                presum[ i + 1 ] [ j + 1 ] = m [ i ] [ j ] + presum [ i + 1  ] [ j ] ;
            
        
        int ans = 0 , c = 0 ; 
        for ( int i = 0 ; i < col  ; i ++ )
        {
            for (  int j = i ; j < col  ; j ++ )
            {
                int arr [] = new int [ 1001 ] ;
                for ( int k = 0 ; k < row ; k++ )
                        arr [ k ] = presum [ k + 1 ] [ j + 1 ] - presum [ k + 1 ] [ i ] ; 
                c = Kadane ( arr , row ) ; 
                ans = Math.max ( ans , c ) ; 
            }
        }
        return ans ; 
    }
}
class GFG {
	public static void main (String[] args) {
	    
	    
	    Scanner  in = new Scanner( System.in ) ; 
	    int t = in.nextInt() ; 
	    while ( t-- > 0 )
	    {
	        int n = in.nextInt() ; 
	        int m = in.nextInt() ; 
	        int M [] [ ] = new int [ n ] [ m ] ; 
	        for ( int i = 0 ; i < n ; i ++ )
	        {
	            for ( int j = 0 ; j < m ; j ++ )
	                M [ i ] [ j ] = in.nextInt( ) ; 
	        }
	        Solution s = new Solution () ; 
	        System.out.println ( s. numSubmatrixSumTarget( M ) ) ;
	        
	    }
		//code
	}
}
