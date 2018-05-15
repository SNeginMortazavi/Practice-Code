package longestContinuousIncreasingSubsequence;

public class LongestContinuousIncreasingSubsequence {
	/**
	 * time complexity: O(N)
	 * space complexity: O(1)
	 * @param nums
	 * @return
	 */
	public int findLengthOfLCIS(int[] nums) {
		if(nums.length == 0) return 0;
		if(nums.length == 1) return 1;
        int count = 1;
        int max = Integer.MIN_VALUE;
        for(int i = 1; i < nums.length; i++){
        	if(nums[i] > nums[i - 1]){
        		count++;
        	}else{
        		count = 1;
        	}
    		max = Math.max(max, count);
        }
        return max;
    }
	public static void main(String[] args){
		int[] nums = {1, 3, 5, 4, 7};
		LongestContinuousIncreasingSubsequence app = new LongestContinuousIncreasingSubsequence();
		System.out.print(app.findLengthOfLCIS(nums));
	}
}
