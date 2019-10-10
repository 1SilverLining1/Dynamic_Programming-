
//https://practice.geeksforgeeks.org/problems/word-wrap/0
#include <bits/stdc++.h>
using namespace std;
int main() {
	
	int T ; 
	cin >> T ; 
	while ( T-- )
	{
		int n , k  ; 
		cin >> n >> k ; 
		int arr [ n ], pre [ n ]; 
		for ( int i = 0 ; i < n ; i ++ )
			cin >> arr [ i ] ; 
		int dp [ n ] [ n ] ; 
		for ( int i = 0 ; i < n ; i ++ )
		{
			for ( int j = 0 ; j < n ; j ++ )
				dp[ i ] [j ] = INT_MAX; 
		}
		pre [ 0 ] = arr [ 0 ] ; 
		for ( int i = 1 ; i < n ; i ++ )
			pre [ i ] = pre [ i - 1 ] + arr [ i ] ; 
		
		for ( int i = 0 ; i < n ; i ++ )
		{
			for ( int j = i  ; j < n ; j ++ )
			{
				int c = 0 ; 
				if ( i - 1 >= 0 )
					 c = pre [ j ] - pre [ i - 1 ] ;
				else 
					c = pre [ j ] ; 
				c += ( j - i ) ; 
			   if ( c <= k )
				dp [ i ] [ j ] = ( k - c ) * ( k - c  ) ; 
			  else break ; 
			}
		}
		
	/*	for ( int i = 0 ; i < n ; i ++ )
		{
			for ( int j = 0 ; j < n ; j ++ )
				cout << dp[ i ] [j ] << " " ;
			cout << endl ; 
		}
		*/
		
		
		
		int ind [ n ] , cost [ n + 1 ] ;
		for ( int i = 0 ; i <= n ; i ++ )
			cost [ i ] = 0 ; 
		for ( int i = n - 1 ; i >= 0 ; i -- )
		{
			int  min_idx ; 
			cost [ i ] = INT_MAX ; 
			for ( int j = n - 1 ; j >= i ; j -- )
			{
				   
				     if (  dp [ i ] [ j  ] != INT_MAX and dp [ i ] [ j ] + cost [ j + 1 ] < cost [ i ] )
				     {
				     	cost [  i ] = dp [ i ] [ j ] + cost [ j + 1 ] ; 
				        ind [ i ] = j + 1 ; 
				     }
			
			}
		}
		/*cout << endl ; 
		for ( int i = 0 ; i < n ; i ++ )
			cout << cost [ i ] << " " ;
		cout << endl ; 
		for ( int i = 0 ; i < n ; i ++ )
			cout << ind [ i ] << " " ; 
		cout << endl; */
		for ( int i = 0 ; i < n ;   )
		{
			cout << i  + 1 << " " << ind  [ i ]  << " " ; ; 
			i = ind [ i ] ; 
		}
		cout << endl ;  
	}
	// your code goes here
	return 0;
}
