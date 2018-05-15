package degreeArray;

import java.util.Map;
import java.util.Collections;
import java.util.HashMap;

public class DegreeArray {
	/**
	 * TIme complexity: O(N)
	 * Space Complexity: O(N)
	 * @param nums
	 * @return
	 */
	public int findShortestSubArray(int[] nums) {
		Map<Integer, Integer> leftIndex = new HashMap<>();
		Map<Integer, Integer> rightIndex = new HashMap<>();
		Map<Integer, Integer> count = new HashMap<>();
		int degree = 0;
		int min = nums.length;
		for(int i = 0; i < nums.length; i++){
			count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
			if(leftIndex.get(nums[i]) == null) leftIndex.put(nums[i], i);
			rightIndex.put(nums[i], i);
		}
		
		degree = Collections.max(count.values());
		for(Integer s: count.keySet()){
			if(count.get(s) == degree){
				min = Math.min(min, rightIndex.get(s) - leftIndex.get(s) + 1);
			}
		}
		return min;
	}
	
	public static void main(String[] args){
		int[] nums = {1,2,2,3,4,2};
		DegreeArray app = new DegreeArray();
		System.out.println(app.findShortestSubArray(nums));
	}
}
