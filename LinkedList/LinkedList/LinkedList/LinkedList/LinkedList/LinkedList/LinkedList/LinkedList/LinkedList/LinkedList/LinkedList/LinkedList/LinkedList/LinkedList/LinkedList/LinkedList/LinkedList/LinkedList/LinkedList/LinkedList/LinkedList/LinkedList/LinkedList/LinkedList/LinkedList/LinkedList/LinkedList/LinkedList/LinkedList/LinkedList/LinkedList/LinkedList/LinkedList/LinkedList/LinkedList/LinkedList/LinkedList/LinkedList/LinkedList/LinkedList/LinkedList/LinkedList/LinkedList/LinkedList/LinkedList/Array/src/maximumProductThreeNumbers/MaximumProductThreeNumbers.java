package maximumProductThreeNumbers;

public class MaximumProductThreeNumbers {
	/*
	 * TIme Complexity: O(N);
	 * Space Complexity:O(1);
	 */
    public int maximumProduct(int[] nums) {
    	Integer min1 = Integer.MAX_VALUE;
    	Integer min2 = Integer.MAX_VALUE;
    	Integer max1 = Integer.MIN_VALUE;
    	Integer max2 = Integer.MIN_VALUE;
    	Integer max3 = Integer.MIN_VALUE;
    	
    	for(int n : nums){
    		if(n <= min1){
    			min2 = min1;
    			min1 = n;
    		}else if(n <= min2){
    			min2 = n;
    		}
    		if(n >= max3){
    			max1 = max2;
    			max2 = max3;
    			max3 = n;
    		}else if(n>= max2){
    			max1 = max2;
    			max2 = n;
    		}else if(n >= max1){
    			max1 = n;
    		}
    	}
        return Math.max(min1 * min2 * max3, max1* max2* max3);
    }
    public static void main(String[] args){
    	int[] nums = {1000,1000,1000};
    	MaximumProductThreeNumbers app = new MaximumProductThreeNumbers();
    	System.out.print(app.maximumProduct(nums));
    }
}
