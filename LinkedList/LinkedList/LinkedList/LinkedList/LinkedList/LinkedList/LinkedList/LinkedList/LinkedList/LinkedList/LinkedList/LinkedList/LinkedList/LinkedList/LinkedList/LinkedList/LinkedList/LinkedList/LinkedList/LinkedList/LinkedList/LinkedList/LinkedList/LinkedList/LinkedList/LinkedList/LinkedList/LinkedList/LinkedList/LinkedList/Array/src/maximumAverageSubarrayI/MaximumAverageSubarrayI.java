package maximumAverageSubarrayI;

public class MaximumAverageSubarrayI {
	/**
	 * First Method
	 * Time Complexity: O(N)
	 * Space Complexity: O(N)
	 * @param nums
	 * @param k
	 * @return
	 */
    public double findMaxAverage(int[] nums, int k) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
        	sum[i] = sum[i - 1] + nums[i];
        }
        double average = (1.0 / k) * sum[k - 1];
        for(int i = k; i < sum.length; i++){
        	average = Math.max(average, (1.0 / k) * (sum[i] - sum[i - k]));
        }
        return average;
    }
    
    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     * @param nums
     * @param k
     * @return
     */
    public double findMaxAverage2(int[] nums, int k) {
    	int sum = 0;
    	for(int i = 0; i < k; i++) sum += nums[i];
    	int result = sum;
    	for(int i = k; i < nums.length; i++){
    		sum += nums[i] - nums[i - k];
    		result = Math.max(result, sum);
    	}
        return (1.0/k) * result;
    }
    
    public static void main(String[] args){
    	int[] nums = {4, 2, 1, 3, 3};
    	int k = 2;
    	MaximumAverageSubarrayI app = new MaximumAverageSubarrayI();
    	System.out.print(app.findMaxAverage2(nums, k));	
    }
}
