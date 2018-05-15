package findAllNumbersDisappearedArray;

import java.util.List;
import java.util.ArrayList;

public class FindAllNumbersDisappearedArray {
	/**
	 * Time complexity: O(n)
	 * Space Complexity: O(1)
	 * @param nums
	 * @return
	 */
	public List<Integer> findDisappearedNumbers(int[] nums) {
        int index = 0;
        List<Integer> result = new ArrayList<>();
        for(int i =  0; i < nums.length; i++){
        	index = (Math.abs(nums[i]) - 1) % nums.length;
        	if(nums[index] > 0) nums[index] *= -1;
        }
        for(int i = 0; i < nums.length; i++){
        	if(nums[i] > 0) result.add(i + 1);
        }
        return result;
    }
	
	public static void main(String[] args){
		int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
		FindAllNumbersDisappearedArray app = new FindAllNumbersDisappearedArray();
		System.out.print(app.findDisappearedNumbers(nums));
	}
}
