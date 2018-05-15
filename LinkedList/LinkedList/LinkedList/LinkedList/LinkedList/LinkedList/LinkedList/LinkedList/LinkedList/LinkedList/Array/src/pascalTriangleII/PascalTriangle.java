package pascalTriangleII;
import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	/**
	 * Time Complexity: O(N^2)
	 * Space Complexity: O(N)
	 * @param rowIndex
	 * @return
	 */
    public List<Integer> getRow(int rowIndex) {
        int[] result = new int[(rowIndex + 1)];
        List<Integer> list = new ArrayList<Integer>();
        result[0] = 1;
        
        for(int i = 1; i <= rowIndex; i++){
        	for(int j = i; j > 0; j--){
        		result[j] = result[j] + result[j - 1];
        	}
        }
        for(int i = 0; i < result.length; i++){
        	list.add(result[i]);
        }
        return list;
    }
    
    public static void main(String[] args){
    	int rowIndex = 3;
    	PascalTriangle app = new PascalTriangle();
    	System.out.println(app.getRow(rowIndex));
    }
}
