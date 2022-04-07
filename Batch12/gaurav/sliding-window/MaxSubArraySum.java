class Solution {
    int calculateSum(int[] nums, int i, int j) {
        int sum = 0;
        for(int k=i; k<=j; k++) {
            sum = sum + nums[k];
        }
        return sum;
    }
    
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                int winLength = i-j+1;
                int sum = calculateSum(nums, i, j);
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
