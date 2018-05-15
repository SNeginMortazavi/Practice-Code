package plusOne;

public class PlusOne {
	/**
	 * Time Complexity: O(N)
	 * Space Complexity: O(N)
	 * @param digits
	 * @return
	 */
    public int[] plusOne(int[] digits) {
    	if(digits.length == 0) return null;
    	if(digits.length == 1 && digits[0] == 0) return new int[]{1};
    	int cary = 1;
    	int n = digits.length;
    	while(cary != 0 && n > 0){
    		n--;
    		int temp = digits[n];
    		temp = temp + cary;
    		cary = (digits[n] + cary) / 10;
    		digits[n] = (temp) % 10;
    	}
    	if(cary == 1){
    		int[] result = new int[digits.length + 1];
    		result[0] = 1;
    		for(int i = 1; i < result.length; i++){
    			result[i] = digits[i - 1];
    		}
    		return result;
    	}
    	return digits;
    }
    
    public static void main(String[] args){
    	int[] digits = {9, 9, 9, 9};
    	PlusOne app = new PlusOne();
    	int[] result = app.plusOne(digits);
    	for(int i = 0; i < result.length; i++){
    		System.out.print(result[i]);
    	}
    	
    }
}
