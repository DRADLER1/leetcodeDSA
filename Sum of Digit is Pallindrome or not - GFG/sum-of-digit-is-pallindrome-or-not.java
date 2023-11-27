//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isDigitSumPalindrome(int N) {
        // code here
        int sum = 0 ;
        int revNum = 0;
        
        while( N > 0){
            int ld = N % 10;
            sum += ld;
            N/= 10;
        }
        
        int n  = sum;
        
         while( n > 0){
            int ld = n % 10;
            revNum = (revNum * 10) + ld;
            n/= 10;
        }
    
        
        
        
        return sum == revNum ? 1 : 0;
    }
}