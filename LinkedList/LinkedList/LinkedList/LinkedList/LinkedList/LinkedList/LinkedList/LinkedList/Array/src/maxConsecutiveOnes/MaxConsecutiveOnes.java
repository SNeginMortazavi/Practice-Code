package maxConsecutiveOnes;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current = 0;
        
        for(int i = 0; i < nums.length; i++){
        	if(nums[i] == 1) {
        		current++;
        		max = Math.max(current, max);
        	}else {
        		current = 0;
        	}
        }
        return max;
    }
    
    public static void main(String[] args){
    	MaxConsecutiveOnes app = new MaxConsecutiveOnes();
    	int[] nums = {1, 1, 1, 1, 0, 0, 1, 1, 1};
    	int result = app.findMaxConsecutiveOnes(nums);
    	System.out.println(result);
    }
}
