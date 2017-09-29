/***
 * This class sorts in place the given array by using Bubble Sort algorithm
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 * @author negin
 *
 */
public class BubbleSort {
	/***
	 * This function sorts the given array in bubble sort format. 
	 * @param array given input
	 * @return sorted array
	 */
	public static int[] bubbleSort(int[] array){
		for(int i = 0; i < array.length - 1; i++){
			// in each pass, one element is bubble up and being set to its correct position, so 
			//don't need to be checked again. Thus every pass decreases by one element 
			// but complexity remains the same.
			for(int j = 0; j < array.length - 1 - i; j++){
				if(array[j] > array[j + 1]){
					swap(array, j, j + 1);
				}
			}
		}
		return array;
	}
	
	/***
	 * this function swaps two elements of given array
	 * @param array given array to be swapped
	 * @param start first element 
	 * @param end second element
	 */
	public static void swap(int[] array, int start, int end){
		int temp = 0;
		temp = array[end];
		array[end] =array[start];
		array[start] = temp;
	}
	
	public static void main(String[] args) {
		int[] array = {5, 8, 1, 6, 9, 2};
		int[] newArray = bubbleSort(array);
		for(int i = 0; i < array.length; i++){
			System.out.print(newArray[i]);
		}
	}
}
