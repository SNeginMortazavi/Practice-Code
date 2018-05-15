package nondecreasingArray;

public class NondecreasingArray {
    public boolean checkPossibility(int[] nums) {
    	if(nums == null || nums.length <= 1) return true;
        int count = 0;
        if(nums[0] > nums[1]){
        	count++;
        	int temp = nums[0];
        	nums[0] = nums[1];
        	nums[1] = temp;
        }
        for(int i = 2; i < nums.length; i++){
        	if(nums[i] < nums[ i - 1]) count++;
        }
        if(count > 1) return false;
        return true;
    }
    public static void main(String[] args){
    	int[] nums = {3, 4, 2, 3};
    	NondecreasingArray app = new NondecreasingArray();
    	boolean tag = app.checkPossibility(nums);
    	System.out.println(tag);
    }
}
