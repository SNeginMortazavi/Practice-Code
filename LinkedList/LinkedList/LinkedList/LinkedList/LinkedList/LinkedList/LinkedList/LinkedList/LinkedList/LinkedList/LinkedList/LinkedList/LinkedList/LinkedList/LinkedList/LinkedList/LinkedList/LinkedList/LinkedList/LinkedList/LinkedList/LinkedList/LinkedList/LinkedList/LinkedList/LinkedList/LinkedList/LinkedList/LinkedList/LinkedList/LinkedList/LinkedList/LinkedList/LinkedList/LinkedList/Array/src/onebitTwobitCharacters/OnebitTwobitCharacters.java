package onebitTwobitCharacters;


public class OnebitTwobitCharacters {
	/**
	 * time complexity: O(N)
	 * space complexity: O(1)
	 * @param bits
	 * @return
	 */
	public boolean isOneBitCharacter(int[] bits) {
		int i = 0;
        while(i < bits.length){
        	if(bits.length - i == 1) return true;
        	else if(bits[i] == 1) i = i + 2;
        	else i++;
        }
        return false;
    }
	
	public static void main(String[] args){
		int[] bits ={1, 1, 1, 0};
		OnebitTwobitCharacters app = new OnebitTwobitCharacters();
		System.out.println(app.isOneBitCharacter(bits));
	}
}
