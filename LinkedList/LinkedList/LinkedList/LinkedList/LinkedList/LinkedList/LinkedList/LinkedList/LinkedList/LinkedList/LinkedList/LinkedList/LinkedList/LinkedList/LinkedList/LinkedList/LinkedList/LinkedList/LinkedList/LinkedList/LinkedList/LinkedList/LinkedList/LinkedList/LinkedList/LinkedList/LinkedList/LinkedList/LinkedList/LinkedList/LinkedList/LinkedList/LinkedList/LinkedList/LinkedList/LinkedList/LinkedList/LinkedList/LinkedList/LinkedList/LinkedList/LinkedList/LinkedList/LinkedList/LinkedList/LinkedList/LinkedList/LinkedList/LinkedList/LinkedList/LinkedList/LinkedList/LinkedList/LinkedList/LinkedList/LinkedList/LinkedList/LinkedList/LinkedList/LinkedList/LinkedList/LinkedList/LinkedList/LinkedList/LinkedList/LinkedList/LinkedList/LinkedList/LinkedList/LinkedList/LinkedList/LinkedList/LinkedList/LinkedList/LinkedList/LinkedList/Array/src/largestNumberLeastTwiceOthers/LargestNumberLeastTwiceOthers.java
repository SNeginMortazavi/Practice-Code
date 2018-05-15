package largestNumberLeastTwiceOthers;


public class LargestNumberLeastTwiceOthers {
	/**
	 * Time Complexity: O(N)
	 * Space Complexity: O(1)
	 * @param nums
	 * @return
	 */
    public int dominantIndex(int[] nums) {
        int index = 0;
        for(int i = 0; i < nums.length; i++){
        	if(nums[i] > nums[index]){
        		index = i;
        	}
        }
        for(int i = 0; i < nums.length; i++){
        	if(i != index && nums[index] < 2 * nums[i]) return -1;
        }
        return index;
    }
    public static void main(String[] args){
    	int[] nums = {1, 2, 3, 4};
    	LargestNumberLeastTwiceOthers app = new LargestNumberLeastTwiceOthers();
    	System.out.println(app.dominantIndex(nums));
    }
}
