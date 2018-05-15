package findPivotIndex;

public class FindPivotIndex {
	/**
	 * Time Complexity: O(N)
	 * Space Complexity: O(1)
	 * @param nums
	 * @return
	 */
    public int pivotIndex(int[] nums) {
    	int totalSum = 0;
    	int leftSum = 0;
    	for(int i = 0; i < nums.length; i++){
    		totalSum += nums[i];
    	}
    	
    	for(int i = 0; i < nums.length; i++){
    		if(totalSum - nums[i] - leftSum == leftSum){
    			return i;
    		}else{
    			leftSum += nums[i];
    		}
    	}
    	return -1;
    }
    
    public static void main(String[] args){
    	int[] nums = {1, 7, 3, 6, 5, 6};
    	FindPivotIndex app = new FindPivotIndex();
    	System.out.print(app.pivotIndex(nums));
    }
}
