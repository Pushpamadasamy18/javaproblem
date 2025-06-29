Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n.
 

Example 1:

Input: n = 5
Output: 10
Explanation: The smallest multiple of both 5 and 2 is 10.
Example 2:

Input: n = 6
Output: 6
Explanation: The smallest multiple of both 6 and 2 is 6. Note that a number is a multiple of itself.


SOLUTION:
class Solution {
    public int smallestEvenMultiple(int n) {
       for(int i=1;i<n;i++){
            if(i*n%2==0){
                return i*n;
            }
       } 
       return n*2;
    }
}
