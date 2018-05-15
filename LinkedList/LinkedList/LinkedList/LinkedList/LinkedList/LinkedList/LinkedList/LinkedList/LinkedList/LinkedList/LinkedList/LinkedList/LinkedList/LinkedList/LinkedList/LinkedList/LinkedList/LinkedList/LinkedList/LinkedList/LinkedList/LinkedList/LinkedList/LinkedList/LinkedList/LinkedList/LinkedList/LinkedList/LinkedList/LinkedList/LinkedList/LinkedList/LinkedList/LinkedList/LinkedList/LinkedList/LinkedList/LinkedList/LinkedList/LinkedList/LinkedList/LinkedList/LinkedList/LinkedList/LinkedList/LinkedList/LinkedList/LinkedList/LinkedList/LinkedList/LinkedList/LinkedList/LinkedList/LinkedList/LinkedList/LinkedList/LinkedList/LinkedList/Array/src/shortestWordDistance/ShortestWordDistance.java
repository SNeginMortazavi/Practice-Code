package shortestWordDistance;

public class ShortestWordDistance {
	/**
	 * brute force method
	 * Time complexity: O(n^2)
	 * space complexity: O(1)
	 * @param words
	 * @param word1
	 * @param word2
	 * @return
	 */
	public int shortestDistance(String[] words, String word1, String word2) {
        int minDsitance = words.length;
		for(int i = 0; i < words.length; i++){
        	if(words[i].equals(word1)){
        		for(int j = 0; j < words.length; j++){
        			if(words[j].equals(word2)){
        				minDsitance = Math.min(minDsitance, Math.abs(i - j));
        			}
        		}
        	}
        }
		return minDsitance;
    }
	
	/**
	 * The faster method
	 * Time complexity: O(n)
	 * Space Complexity: O(1)
	 * @param words
	 * @param word1
	 * @param word2
	 * @return
	 */
	public int shortestDistance2(String[] words, String word1, String word2) {
        int minDsitance = words.length;
        int i = -1;
        int j = -1;
        for(int m = 0; m < words.length; m++){
        	if(words[m].equals(word1)) i = m;
        	else if(words[m].equals(word2)) j = m;
        	if(i != -1 && j != -1) {
        		minDsitance = Math.min(minDsitance, Math.abs(i - j));
        	}
        }
		return minDsitance;
    }
	
	public static void main(String[] args){
		ShortestWordDistance appDistance = new ShortestWordDistance();
		String[] wordsStrings = {"practice", "makes", "perfect", "coding", "makes"};
		String word1 = "coding";
		String word2 = "makes";
		int result = appDistance.shortestDistance2(wordsStrings, word1, word2);
		System.out.println(result);
	}
}
