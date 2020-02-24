//https://leetcode.com/problems/number-of-submatrices-that-sum-to-target/

class Solution {
    
   
    public int numSubmatrixSumTarget(int[][] m , int target ) {
        
        int presum [ ] [] = new int [  1001  ] [ 1001 ] ;
        int row = m.length; 
        int col = m[ 0 ].length; 
        for ( int i = 0 ; i < row ; i ++ )
            for ( int j = 0 ; j < col  ; j ++ )
                presum[ i + 1 ] [ j + 1 ] = m [ i ] [ j ] + presum [ i + 1  ] [ j ] ;
            
        
        int ans = 0  ; 
        for ( int i = 0 ; i < col  ; i ++ )
        {
            for (  int j = i ; j < col  ; j ++ )
            {
              
                Map < Integer, Integer > mp = new HashMap < Integer, Integer > () ;
                int sum = 0 ; 
                for ( int k = 0 ; k < row ; k++ )
                {
                    sum += presum [ k + 1 ] [ j + 1 ] - presum [ k + 1 ] [ i ] ;
                    int diff = sum - target  ; 
                    if ( sum == target )
                            ans ++ ; 
                    if ( mp.get ( diff ) != null )
                        ans += mp.get( diff ) ; 
                    
                    if ( mp.get ( sum ) == null ) 
                            mp.put ( sum , 1 ) ; 
                    else 
                            mp.put ( sum , mp.get( sum ) + 1 ) ; 
                    
                }
                   
            }
        }
        return ans ; 
    }
}
