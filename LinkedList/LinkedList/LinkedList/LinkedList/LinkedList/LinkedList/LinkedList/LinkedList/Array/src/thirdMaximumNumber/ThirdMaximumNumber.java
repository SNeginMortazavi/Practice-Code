package thirdMaximumNumber;

public class ThirdMaximumNumber {
	/**
	 * Time Complexity: O(N)
	 * Space Complexity: O(1)
	 * @param nums
	 * @return
	 */
    public int thirdMax(int[] nums) {
    	if(nums.length == 1) return nums[0];
    	if(nums.length == 2) return nums[0] > nums[1] ? nums[0]: nums[1];
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        for(Integer n: nums){
        	if(n.equals(max1) || n.equals(max2)  || n.equals(max3) ) continue;
            if (max1 == null || n > max1) { //use max1 == null because we cannot compare n and null 
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
            } else if (max3 == null || n > max3) {
                max3 = n;
            }
        }
        return max3 == null ? max1: max3; 
    }
    
    public static void main(String[] args){
    	int[] nums = {1, 1, 2};
    	ThirdMaximumNumber app = new ThirdMaximumNumber();
    	System.out.print(app.thirdMax(nums));
    }
}
