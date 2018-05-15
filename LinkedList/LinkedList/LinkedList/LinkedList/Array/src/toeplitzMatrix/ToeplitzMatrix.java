package toeplitzMatrix;

public class ToeplitzMatrix {
	public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++){
        	for(int j = 0; j < matrix[0].length; j++){
        		if(i > 0 && j > 0 && matrix[i - 1][j - 1] != matrix[i][j]) return false;
        	}
        }
        return true;
    }
	public static void main(String[] args) {
//		int[][] matrix = {{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}};
		int[][] matrix = {{1, 2}, {2, 2}};
		ToeplitzMatrix appMatrix = new ToeplitzMatrix();
		boolean result = appMatrix.isToeplitzMatrix(matrix);
		System.out.println(result);
	}
}
