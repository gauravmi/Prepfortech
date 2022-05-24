// https://leetcode.com/problems/powx-n/


class Solution {
    public double positiveRow(double x, int n, HashMap<Integer, Double> hs) {
        if(n == 1) return x;
        if(n == 0) return 1;
        
        double result;

        if( hs.get(n / 2) == null ) {
            result = positiveRow(x, n/2, hs);
            hs.put(n/2, result);
        }else {
            result = hs.get(n / 2);
        }

        if(n % 2 == 0) {
            return result * result;
        } else {
            return (x * result * result);
        }
    }

    public double myPow(double x, int n) {
        double result = positiveRow(x, Math.abs(n), new HashMap<>());
        if(n < 0) {
            return 1/result;
        }else{
            return result;
        }
    }
}
