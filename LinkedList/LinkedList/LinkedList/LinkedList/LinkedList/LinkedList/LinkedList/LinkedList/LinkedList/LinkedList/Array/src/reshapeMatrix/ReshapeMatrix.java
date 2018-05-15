package reshapeMatrix;

import java.util.LinkedList;
import java.util.Queue;

public class ReshapeMatrix {
	
	/**
	 * First Method
	 * Time complexity: O(m * n)
	 * Space Complexity: O(m * n)
	 * using queue as extra space
	 * @param nums
	 * @param r number of new rows
	 * @param c number of new columns
	 * @return
	 */
	public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums.length == 0 || nums.length * nums[0].length != r * c) return nums;
        
        Queue<Integer> queue = new LinkedList<Integer>();
        int[][] result = new int[r][c];
        
        for(int i = 0; i < nums.length; i++){
        	for(int j = 0; j < nums[0].length; j++){
        		queue.add(nums[i][j]);
        	}
        }
        
        for(int i = 0; i < r; i++){
        	for(int j = 0; j < c; j++){
        		result[i][j] = queue.remove();
        	}
        }
        return result;
    }
	
	/**
	 * Second Method
	 * Time Complexity: O(m * n)
	 * Space COmplexity: O(m * n)
	 * @param nums
	 * @param r
	 * @param c
	 * @return
	 */
	public int[][] matrixReshape2(int[][] nums, int r, int c) {
		int[][] result = new int[r][c];
		int count = 0;
		
		if(nums.length == 0 || nums.length * nums[0].length != r * c) return nums;
		for(int i = 0; i < nums.length; i++){
			for(int j = 0; j < nums[0].length; j++){
				result[count / c][count % c] = nums[i][j];
				count++;
			}
		}
		return result;
	}
	
	public static void main(String[] args){
		ReshapeMatrix app = new ReshapeMatrix();
		int r = 3; 
		int c = 2;
		int[][] nums = {{1, 2, 3},{4, 5, 6}};
		System.out.println(nums.length + " " + nums[0].length);
		int[][] result = app.matrixReshape(nums, r, c);
		int[][] result1 = app.matrixReshape2(nums, r, c);

		System.out.println(result.length + " " + result[0].length);

		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				System.out.print(result[i][j] + " ");
			}
		}
		
		System.out.println();
		
		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				System.out.print(result1[i][j] + " ");
			}
		}
	}
}
