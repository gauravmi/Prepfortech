//  why does time limit exceeds ?
class Solution {
    public int mySqrt(int x) { 
        int start  = 0;
        int end = x;
        
        while(start < end) {
            int mid = start + (end - start ) / 2;
            int square = mid * mid;
            if( square == x ) {
                return mid;
            } else if (square < x) {
                start = mid+1;
            }else{
                end = mid+1;
            }
        }
        
        return -1;
    }
}
