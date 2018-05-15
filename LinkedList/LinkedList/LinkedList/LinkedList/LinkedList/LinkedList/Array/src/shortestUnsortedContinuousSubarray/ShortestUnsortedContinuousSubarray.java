package shortestUnsortedContinuousSubarray;

public class ShortestUnsortedContinuousSubarray {
	/**
	 * Time Complexity: O(N)
	 * Space Complexity: O(1)
	 * @param nums
	 * @return
	 */
    public int findUnsortedSubarray(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int l = 0;
        int r = 0;
        boolean flag = false;
        
        for(int i = 1; i < nums.length; i++){
        	if(nums[i] < nums[i - 1]) flag = true;
        	if(flag) min = Math.min(min, nums[i]);
        }
        
        for(int i = nums.length - 2; i >= 0; i--){
        	if(nums[i] > nums[i + 1]) flag = true;
        	if(flag) max = Math.max(max, nums[i]);
        }
        
        for(l = 0; l < nums.length; l++){
        	if(min < nums[l]) break;
        }
        
        for(r = nums.length - 1; r > 0; r--){
        	if(max > nums[r]) break;
        }
        
        return r - l <= 0 ? 0: r - l + 1;
    }
    
    public static void main(String[] args){
    	int[] nums = {2, 6, 4, 8, 10, 9, 15};
    	ShortestUnsortedContinuousSubarray app = new ShortestUnsortedContinuousSubarray();
    	System.out.print(app.findUnsortedSubarray(nums));
    }
}
