package rotateArray;


public class RotateArray {
	/**
	 * time complexity: O(n)
	 * space complexity: O(1)
	 * @param nums
	 * @param k
	 */
    public void rotate(int[] nums, int k) {
    	reverse(nums, 0, nums.length - 1);
    	reverse(nums, 0, k - 1);
    	reverse(nums, k, nums.length - 1);
    }
    public void reverse(int[] nums, int i, int j){
    	while(i < j){
    		int temp = nums[i];
    		nums[i] = nums[j];
    		nums[j] = temp;
    		i++;
    		j--;
    	}
    }
    
    public static void main(String[] args){
    	int k = 3; 
    	int[] nums = {1, 2, 3, 4, 5, 6, 7};
    	RotateArray app = new RotateArray();
    	app.rotate(nums, k);
    	for(int i = 0; i < nums.length; i++){
    		System.out.print(nums[i] + "-");
    	}
    	
    }
}
