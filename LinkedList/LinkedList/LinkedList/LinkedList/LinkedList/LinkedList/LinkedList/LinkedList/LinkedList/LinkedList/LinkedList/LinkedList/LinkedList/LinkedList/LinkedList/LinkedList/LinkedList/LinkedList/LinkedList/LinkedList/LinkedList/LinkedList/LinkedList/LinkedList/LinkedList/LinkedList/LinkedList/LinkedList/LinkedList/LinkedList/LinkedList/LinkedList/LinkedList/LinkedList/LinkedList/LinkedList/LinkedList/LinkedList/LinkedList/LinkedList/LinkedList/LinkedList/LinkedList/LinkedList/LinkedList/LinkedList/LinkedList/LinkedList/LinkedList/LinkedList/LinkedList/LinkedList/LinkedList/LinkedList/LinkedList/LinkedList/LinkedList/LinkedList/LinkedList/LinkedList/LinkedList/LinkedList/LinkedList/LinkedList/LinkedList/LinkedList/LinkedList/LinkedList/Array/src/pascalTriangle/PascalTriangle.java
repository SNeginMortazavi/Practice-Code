package pascalTriangle;
import java.util.List;
import java.util.ArrayList;

public class PascalTriangle {
	/**
	 * Time Complexity: O(n^2)
	 * Space COmplexity: O(n^2) because we need to store each number that we update in list
	 * refer to: https://leetcode.com/articles/pascals-triangle/
	 * @param numRows
	 * @return
	 */
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
        	List<Integer> temp = new ArrayList<>();
        	temp.add(1);
        	if(i > 0) {
        		for(int j = 1; j < i; j++){
        			temp.add(list.get(i - 1).get(j) + list.get(i - 1).get(j - 1));
        		}
        		temp.add(1);
        	}
        	list.add(temp);
        }
        return list;
    }
	
	public static void main(String[] args){
		int num = 5;
		PascalTriangle app = new PascalTriangle();
		System.out.println(app.generate(num));
	}
}
